package nonogram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

// 스테이지 불러오기, 출력 담당 클래스

public class Stage {
	private String name_stage_1;		// 스테이지 파일1
	private String name_stage_2;		// 스테이지 파일2
	private String name_stage_3;		// 스테이지 파일3
	
	private int stage_size_row;			// 스테이지 행 크기
	private int stage_size_col;			// 스테이지 열 크기
	
	public String[] origin_data;		// 불러온 스테이지 데이터
	public Block[][] stage_block;		// 데이터의 블록화
	
	public int[][] horizon_hint_data;			// 가로 힌트
	public int[][] origin_vertical_hint_data;	// (추출용)세로 힌트
	public String[][] vertical_hint_data;		// (출력용)세로 힌트
	
	private int success_cnt;					// 성공 조건
	
	// 생성자
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public Stage(int _stage_num) {
		this.name_stage_1 = "\\src\\nonogram\\nonogram_stage_1.txt";
		this.name_stage_2 = "\\src\\nonogram\\nonogram_stage_2.txt";
		this.name_stage_3 = "\\src\\nonogram\\nonogram_stage_3.txt";
		
		this.origin_data = new String[100];
		
		load_stage(_stage_num);
		
		this.stage_size_row = this.origin_data.length;
		this.stage_size_col = this.origin_data[0].length();
		
		init_all_block();
		
		integrated_hint_init();
		
		convert_array_type();
	}
	
	
	// 스테이지 데이터 읽어 오기 (.txt파일)
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	private void load_stage(int _stage_num) {
		Path path = Paths.get("");
		String absolute_path = path.toAbsolutePath().toString();
		
		if(_stage_num == 1) {
			absolute_path += this.name_stage_1;
			
		} else if(_stage_num == 2) {
			absolute_path += this.name_stage_2;
			
		} else if(_stage_num == 3) {
			absolute_path += this.name_stage_3;
		}
		
		File file = new File(absolute_path);
		
		try {
			FileReader file_reader = new FileReader(file);
			BufferedReader buffer_reader = new BufferedReader(file_reader);
			
			String temp_string = "";
			int line_cnt = 0;
			while((temp_string = buffer_reader.readLine()) != null) {
				this.origin_data[line_cnt] = temp_string;
				line_cnt++;
			}
			
			fix_array_size(line_cnt);
			
			buffer_reader.close();
			
		} catch (Exception e) {
			System.out.println("Error] 스테이지 파일을 읽을 수 없습니다.");
			System.out.println("Error] 프로그램을 종료합니다.");
			System.exit(0);
		}
		
	}
	
	
	// 읽어온 .txt 파일과 배열 크기 맞추기 (load_stage() 내부에 사용)
	// @author	:	Chocobe
	// @param	:	String[] _source : 임의의 크기에 저장된 스테이지 데이터
	//			:	int _len : 스테이지 데이터의 라인 수
	// @return	:	(String[]) 크기가 조정된 배열
	private void fix_array_size(int _len) {
		String[] temp_arr = new String[_len];
		
		for(int i = 0; i < _len; i++) {
			temp_arr[i] = this.origin_data[i];
		}
		
		this.origin_data = temp_arr;
	}
	
	
	// stage_size_row 반환
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	(int) 스테이지 행 개수
	public int get_stage_row() {
		return this.stage_size_row;
	}
	
	
	// stage_size_col 반환
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	(int) 스테이지 열 개수
	public int get_stage_col() {
		return this.stage_size_col;
	}
	
	
	// 성공 조건 개수 반환
	public int get_success_cnt() {
		return this.success_cnt;
	}
	
	// 성공 조건 개수 1 감소
	public void sub_success_cnt() {
		this.success_cnt--;
	}
	
	
	// 읽어온 데이터 -> 블록화
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	private void init_all_block() {
		this.stage_block = new Block[this.stage_size_row][this.stage_size_col];
		
		String block_str_data = "";
		int block_int_data = 0;
		this.success_cnt = 0;
		
		for(int i = 0; i < this.stage_size_row; i++) {
			for(int j = 0; j < this.stage_size_col; j++) {
				block_str_data = this.origin_data[i].substring(j, j + 1);
				block_int_data = Integer.parseInt(block_str_data);
				
				this.stage_block[i][j] = new Block(block_int_data);
				if(this.stage_block[i][j].origin_block == Block_type.BLACK) {
					this.success_cnt++;
				}
			}
		}
		
		this.stage_block = Block.init_all_block(this.stage_block);
	}
	
	
	// 힌트 연산 통합
	private void integrated_hint_init() {
		this.horizon_hint_data = new int[this.stage_size_row][this.stage_size_col];
		this.origin_vertical_hint_data = new int[this.stage_size_row][this.stage_size_col];
		horizon_hint_init();
		vertical_hint_init();
		convert_array_type();
	}
	
	
	// 가로방향 힌트 연산
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	private void horizon_hint_init() {
		int continuity_cnt = 0;
		boolean is_continuity = false;
		int[] temp_arr = new int[0];
		
		for(int i = 0; i < this.stage_size_row; i++) {
			for(int j = 0; j < this.stage_size_col; j++) {
				
				// 정답블록 -> 카운팅
				if(stage_block[i][j].origin_block == Block_type.BLACK) {
					continuity_cnt++;
					is_continuity = true;
				} //if
				
				// 오답블록 or 마지막 블록 -> 힌트 데이터 갱신
				if(stage_block[i][j].origin_block != Block_type.BLACK || j == this.stage_size_col - 1) {
					if(is_continuity) {
						temp_arr = add_idx(temp_arr, continuity_cnt);
						continuity_cnt = 0;
						is_continuity = false;
					}
				} //if
			} //for(j)
			
			this.horizon_hint_data[i] = temp_arr;
			temp_arr = new int[0];
		} //for(i)
	}
	
	
	// 세로방향 힌트 연산
	// @author	:	Chocobe
	// @adviser	:	Cha_seong_han
	// @param	:	N/A
	// @return	:	N/A
	private void vertical_hint_init() {
		int continuity_cnt = 0;
		boolean is_continuity = false;
		int[] temp_arr = new int[0];
		
		Block[][] rotated_arr = rotate_arr_reverse(this.stage_block);
		
		for(int i = 0; i < this.stage_size_col; i++) {
			for(int j = 0; j < this.stage_size_row; j++) {
				
				// 정답블록 -> 카운팅
				if(rotated_arr[i][j].origin_block == Block_type.BLACK) {
					continuity_cnt++;
					is_continuity = true;
				} //if
				
				// 오답블록 or 마지막 블록 -> 힌트 데이터 갱신
				if(rotated_arr[i][j].origin_block != Block_type.BLACK || j == this.stage_size_row - 1) {
					if(is_continuity) {
						temp_arr = add_idx(temp_arr, continuity_cnt);
						continuity_cnt = 0;
						is_continuity = false;
					}
				} //if				
			} //for(j)
			
			this.origin_vertical_hint_data[this.stage_size_col - (i + 1)] = temp_arr;
			temp_arr = new int[0];
		}
	}
	
	
	// 배열 인덱스 추가
	// @author	:	Chocobe
	// @param	:	int[] _dest : 저장 장소
	//			:	int _sour	: 저장할 값
	// @return	:	(int[]) 값이 추가된 배열
	private int[] add_idx(int[] _dest, int _sour) {
		int len = _dest.length;
		int[] result_arr = new int[len + 1];
		
		for(int i = 0; i < len; i++) {
			result_arr[i] = _dest[i];
		}
		result_arr[len] = _sour;
		
		return result_arr;
	}
	
	
	// 2차원 배열 반시계 회전
	// @author	:	Chocobe
	// @param	:	int[][] _sour : 원본 배열
	// @return	:	(int[][]) 반시계 회전된 결과 배열
	private Block[][] rotate_arr_reverse(Block[][] _sour) {
		int reverse_row = _sour[0].length;
		int reverse_col = _sour.length;
		
		Block[][] result_arr = new Block[reverse_row][reverse_col];
		
		for(int i = 0; i < reverse_row; i++) {
			for(int j = 0; j < reverse_col; j++) {
				result_arr[i][j] = _sour[j][reverse_row - (i + 1)];
			}
		}
		
		return result_arr;
	}
	
	
	// int[][] -> String[][] 로 변환 (정사각형 배열로 보정)
	// @author	:	Chocobe
	// @adviser	:	Kim_sun_kyung
	// @param	:	N/A
	// @return	:	N/A
	private void convert_array_type() {
		String[][] result_arr = new String[this.stage_size_row][this.stage_size_col];
		
		for(int i = 0; i < result_arr.length; i++) {
			for(int j = 0; j < result_arr[i].length; j++) {
				result_arr[i][j] = " ";
			}
		}
		
		for(int i = 0; i < this.origin_vertical_hint_data.length; i++) {
			for(int j = 0; j < this.origin_vertical_hint_data[i].length; j++) {
				result_arr[i][j] = Integer.toString(this.origin_vertical_hint_data[i][j]);
			}
		}
		
		this.vertical_hint_data = result_arr;
	}
	
	// 입력정보 -> 블록 갱신
	public void update_answer(Player _player, Answer_type _answer) {
		this.stage_block[_player.get_position_y()][_player.get_position_x()].update_answer(this, _player, _answer);
	}
	
	
	// 스테이지 클리어 검사
	public boolean is_success(Player _player) {
		if(_player.get_correct_answer_cnt() == this.success_cnt) {
			return true;
		}
		
		return false;
	}
	
	
	// 다음 스테이지 진행 여부
	public boolean is_continue(Scanner _scanner) {
		String continue_answer = "";
		
		while(true) {
			System.out.print("스테이지 이동(y), 종료(n) : ");
			continue_answer = _scanner.nextLine();
			
			if(continue_answer.equals("y")) {
				Renderer.clear_screen();
				return true;
				
			} else if(continue_answer.equals("n")) {
				System.out.println("\n게임을 종료합니다.");
				System.out.println("감사합니다.");
				return false;
				
			} else {
				System.out.println("\nError] 입력이 유효하지 않습니다.\n");
				continue;
			}
		}
	}
}
