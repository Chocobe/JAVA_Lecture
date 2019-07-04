package nonogram;

public class Game_engine {
	public static void main(String[] args) {	
		// 스테이지 생성
		Stage stage = new Stage(3);
		
		// 원본 이미지 출력
		Renderer.draw_origin_screen(stage);

		// 게임 화면 출력
		Renderer.draw_current_screen(stage);
	}
}
