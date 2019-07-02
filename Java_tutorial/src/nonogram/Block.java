package nonogram;

public class Block {
	
	// 출력부로 옮기자.
	public final static String WHITE  = "□";
	public final static String BLACK  = "■";
	public final static String V	  = "V";
	public final static String X	  = "X";
	
	private Block_type block_is;
	private Block_type origin_block;
	
	
	// 생성자
	public Block(int _txt_data) {
		this.block_is = Block_type.MUST_INIT;
		this.origin_block = convert_to_block(_txt_data);
	}
	
	
	// 원본 블록 설정
	private static Block_type convert_to_block(int _txt_data) {
		if(_txt_data == 0) {
			return Block_type.WHITE;
		
		} else { 
			return Block_type.BLACK; 
		}
	}
	
	
	// 전체 블록 초기화
	// create_block_array 로 이름변경 고려해볼 것 (변경시, 매개변수->row, col로 변경)
	public static void init_all_block(Block[][] _block) {
		int row = _block.length;
		int col = _block[0].length;
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				_block[i][j].block_is = Block_type.WHITE;
			}
		}
	}
	
	
	// (답 입력) 원본 블록과 입력값의 비교 결과 반영
	public void send_answer(KEY _key) {
		if(_key == KEY.O) {
			if(this.origin_block == Block_type.BLACK) {
				this.block_is = Block_type.BLACK;
				
			} else {
				this.block_is = Block_type.X;
			}
			
		} else if(_key == KEY.X) {
			if(this.block_is == Block_type.WHITE) {
				this.block_is = Block_type.V;
				
			} else if(this.block_is == Block_type.V) {
				this.block_is = Block_type.WHITE;
			}
		}
	}
}
