package nonogram;


public class Game_engine {
	public static void main(String[] args) {	
		// 스테이지 생성
		Stage stage = new Stage(3);
		
		// 원본 이미지 출력
		Renderer.draw_screen(stage.stage_block, Draw_mode.ORIGIN);
		
		System.out.println("----------------------------------------");
		
		// 메인 루프 진입부
		// 현재 이미지 출력
		Renderer.draw_screen(stage.stage_block, Draw_mode.CURRENT);
	}
}
