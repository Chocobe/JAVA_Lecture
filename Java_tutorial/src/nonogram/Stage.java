package nonogram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;

// 스테이지 불러오기, 출력 담당 클래스

public class Stage {
	private String name_stage_1;		// 스테이지 파일1
	private String name_stage_2;		// 스테이지 파일2
	private String name_stage_3;		// 스테이지 파일3
	
	private int stage_size_row;
	private int stage_size_col;
	
	public String[] origin_data;	// 불러온 스테이지 데이터
	public Block[][] stage_block;	// 데이터의 블록화
	
	
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
	
	
	// 읽어온 데이터 -> 블록화
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	private void init_all_block() {
		this.stage_block = new Block[this.stage_size_row][this.stage_size_col];
		
		String block_str_data = "";
		int block_int_data = 0;
		
		for(int i = 0; i < this.stage_size_row; i++) {
			for(int j = 0; j < this.stage_size_col; j++) {
				block_str_data = this.origin_data[i].substring(j, j + 1);
				block_int_data = Integer.parseInt(block_str_data);
				
				this.stage_block[i][j] = new Block(block_int_data);
			}
		}
		
		this.stage_block = Block.init_all_block(this.stage_block);
	}
}
