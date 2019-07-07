package nonogram;

import java.util.Scanner;

public class Game_engine {
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		
		// 스테이지 생성
		Stage stage = new Stage(3);
		
		// 플레이어 생성
		Player player = new Player(scanner, stage);
		
//		// 원본 이미지 출력
//		Renderer.draw_origin_screen(stage);
		
		System.out.println("가로 개수 : " + stage.get_stage_col());
		
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
				break;
			}
		}
	}
}
