package nonogram;


public class Game_engine {
	public static void main(String[] args) {	
		// 스테이지 생성
		Stage stage = new Stage(2);
		
		// 원본 이미지 출력
		Renderer.draw_origin_screen(stage);

		Renderer.draw_current_screen(stage);
		
		// 가로 힌트 테스트
		for(int i = 0; i < stage.horizon_hint_data.length; i++) {
			for(int j = 0; j < stage.horizon_hint_data[i].length; j++) {
				System.out.print(stage.horizon_hint_data[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
		
		// 세로 힌트 테스트
		for(int i = 0; i < stage.get_stage_row(); i++) {
			for(int j = 0; j < stage.get_stage_col(); j++) {
				if(stage.vertical_hint_data[j].length > j) {
					System.out.print(stage.vertical_hint_data[j][i] + " ");
					
				} else {
					System.out.print("  ");
				}
				
			System.out.println();
			}
		}
	}
}
