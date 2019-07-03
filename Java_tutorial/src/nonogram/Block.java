package nonogram;

public class Block {	
	public Block_type guess_block;
	public Block_type origin_block;
	
	
	// 생성자
	// @author	:	Chocobe
	// @param	:	int _txt_data : .txt파일로 부터 읽어온 데이터
	public Block(int _txt_data) {
		this.guess_block = Block_type.MUST_INIT;
		this.origin_block = convert_to_block(_txt_data);
	}
	
	
	// 원본 블록 설정 (생성자 전용 메소드)
	// @author	:	Chocobe
	// @param	:	int _txt_data : .txt파일로 부터 읽어온 데이터
	// @return	:	(Block_type) 블록값
	private static Block_type convert_to_block(int _txt_data) {
		if(_txt_data == 0) {
			return Block_type.WHITE;
		
		} else { 
			return Block_type.BLACK; 
		}
	}
	
	
	// 전체 블록 레이지 초기화
	// @author	:	Chocobe
	// @param	:	Block[][] _block : 생성된 블록배열
	// @return	:	N/A
	public static Block[][] init_all_block(Block[][] _block) {
		int row = _block.length;
		int col = _block[0].length;
		
		Block[][] set_block = _block;
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				set_block[i][j].guess_block = Block_type.WHITE;
			}
		}
		
		return set_block;
	}
	
	
	// (답 입력) 원본 블록과 추측 블록의 비교 결과 반영
	// @author	:	Chocobe
	// @param	:	Answer _key : 플레이어의 입력값 (O 또는 X)
	// @return	:	N/A
	public void send_answer(Answer _key) {
		if(_key == Answer.O) {
			if(this.origin_block == Block_type.BLACK) {
				this.guess_block = Block_type.BLACK;
				
			} else {
				this.guess_block = Block_type.X;
			}
			
		} else if(_key == Answer.X) {
			if(this.guess_block== Block_type.WHITE) {
				this.guess_block = Block_type.V;
				
			} else if(this.guess_block == Block_type.V) {
				this.guess_block = Block_type.WHITE;
			}
		}
	}
}
