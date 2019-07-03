package nonogram;

public class Renderer {
	public final static String WHITE  = "□ ";
	public final static String BLACK  = "■ ";
	public final static String V	  = "V ";
	public final static String X	  = "X ";
	
	
	// 원본 이미지 출력
	// @author	:	Chocobe
	// @param	:	Block[][] _block : 스테이지 블록 배열
	// @return	:	N/A
	public static void draw_screen(Block[][] _block, Draw_mode _draw_mode) {
		int row = _block.length;
		int col = _block[0].length;
		
		if(_draw_mode == Draw_mode.ORIGIN) {
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					
					// switch ~ case 로 변경
					switch(_block[i][j].origin_block) {
					case WHITE:
						System.out.print(WHITE);
						break;
						
					case BLACK:
						System.out.print(BLACK);
						break;
						
					default:
					}
					
				} //for(j)
				
				System.out.println();
			} //for(i)

		} else if(_draw_mode == Draw_mode.CURRENT) {
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					
					// switch ~ case 로 변경
					switch(_block[i][j].guess_block) {
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
				
				System.out.println();
			} //for(i)
		} //if~else
	}
}
















