package project_nonogram;

import java.util.Scanner;

public class Game_engine {
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		int cur_stage_num = 1;
		
		// 스테이지 생성
		Stage stage = new Stage(cur_stage_num);
		
		// 플레이어 생성
		Player player = new Player(scanner, stage);
		
//		// 원본 이미지 출력
//		Renderer.draw_origin_screen(stage);
		
		while(true) {
		// 게임 화면 출력
			Renderer.draw_current_screen(stage);
			
			player.input_sequence(stage);
			stage.update_answer(player, player.get_player_answer());
			
			Renderer.clear_screen();
			
			if(player.is_game_over()) {
				Renderer.print_game_over(stage, player);
				break;
			}
			
			if(stage.is_success(player)) {
				Renderer.draw_origin_screen(stage);
				Renderer.print_stage_clear();
				
				if(cur_stage_num >= 3) {
					System.out.println("모든 스테이지를 클리어 했습니다.");
					System.out.println("감사합니다.");
					break;
				}
				
				if(stage.is_continue(scanner)) {
					cur_stage_num++;
					stage = new Stage(cur_stage_num);
					player = new Player(scanner, stage);
					
				} else {
					break;
				}
			}
		}
		
		scanner.close();
	}
}
