package nonogram;

public class Renderer {
	public final static String WHITE  = "□";
	public final static String BLACK  = "■";
	public final static String V	  = "V";
	public final static String X	  = "X";
	
	public final static String HORIZON   	= "─";
	public final static String VERTICAL  	= "│";
	public final static String LEFT_TOP  	= "┌";
	public final static String RIGHT_TOP	= "┐";
	public final static String LEFT_BOT 	= "└";
	public final static String RIGHT_BOT 	= "┘";
	public final static String CENTER_LEFT 	= "├";
	public final static String CENTER_RIGHT = "┤";
	public final static String CENTER 		= "┼";
	
	
	// 진행 화면 출력
	// @author	:	Chocobe
	// @param	:	Stage _stage : 스테이지 객체
	// @return	:	N/A
	public static void draw_current_screen(Stage _stage) {
		int row = _stage.get_stage_row();
		int col = _stage.get_stage_col();
		
		int corrected_line_col = 10 * (col / 5) + 1;
		
		print_top_line(corrected_line_col);
		
		for(int i = 0; i < row; i++) {				
			for(int j = 0; j < col; j++) {
				
				if(i != 0 && i % 5 == 0 && j == 0) {
					print_mid_line(corrected_line_col);
				}
				
				if(j % 5 == 0) {
					System.out.print("│");
					
				} else {
					System.out.print(" ");
				}

				switch(_stage.stage_block[i][j].guess_block) {
				case WHITE:
					System.out.print(WHITE);
					break;
					
				case BLACK:
					System.out.print(BLACK);
					break;
					
				case V:
					System.out.print(V);
					break;
					
				case X:
					System.out.print(X);
					break;
				
				default:
				}
			} //for(j)
			
			System.out.print("│");
			
			// 가로 힌트 출력부
			for(int j = 0; j < _stage.horizon_hint_data[i].length; j++) {
				System.out.print(_stage.horizon_hint_data[i][j] + " ");
			}
			
			System.out.println();
		} //for(i)
		
		print_bottom_line(corrected_line_col);
		
		
		// 세로 힌트 출력부
		for(int i = 0; i < _stage.vertical_hint_data.length; i++) {
			System.out.print(" ");
			
			for(int j = 0; j < _stage.vertical_hint_data[i].length; j++) {
				System.out.print(_stage.vertical_hint_data[j][i] + " ");
			}
			
			System.out.println();
		}
	}
	
	
	// 정답 화면 출력
	// @author	:	Chocobe
	// @param	:	Stage _stage : 스테이지 객체
	// @return	:	N/A
	public static void draw_origin_screen(Stage _stage) {
		int row = _stage.get_stage_row();
		int col = _stage.get_stage_col();
		// 원본 출력
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				
				// switch ~ case 로 변경
				switch(_stage.stage_block[i][j].origin_block) {
				case WHITE:
					System.out.print(WHITE + " ");
					break;
					
				case BLACK:
					System.out.print(BLACK + " ");
					break;
					
				default:
				}
			} //for(j)
			
			System.out.println();
		} //for(i)
	}
	
	
	// 상단 테두리
	// @author	:	Chocobe
	// @param	:	int _col : 스테이지 크기에 맞게 조정된 가로길이
	// @return	:	N/A
	private static void print_top_line(int _col) {
		System.out.print(LEFT_TOP);
		
		for(int i = 0; i < _col - 2; i++) {
			if(i % 10 == 9) {
				System.out.print("┬");
				continue;
			}
			
			System.out.print(HORIZON);
		}
		
		System.out.println(RIGHT_TOP);
	}
	
	
	// 하단 테두리
	// @author	:	Chocobe
	// @param	:	int _col : 스테이지 크기에 맞게 조정된 가로길이
	// @return	:	N/A
	private static void print_bottom_line(int _col) {
		System.out.print(LEFT_BOT);
		
		for(int i = 0; i < _col - 2; i++) {
			if(i % 10 == 9) {
				System.out.print("┴");
				continue;
			}
			
			System.out.print(HORIZON);
		}
		
		System.out.println(RIGHT_BOT);
	}
	
	
	// 중앙 경계선
	// @author	:	Chocobe
	// @param	:	int _col : 세로 사이즈
	// @return	:	N/A
	private static void print_mid_line(int _col) {
		System.out.print(CENTER_LEFT);
		
		for(int i = 0; i < _col - 2; i++) {
			if(i % 10 == 9) {
				System.out.print(CENTER);
				continue;
			}
			
			System.out.print(HORIZON);
		}
		
		System.out.println(CENTER_RIGHT);
	}
	
	
	public static void clear_screen() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
	}
}
