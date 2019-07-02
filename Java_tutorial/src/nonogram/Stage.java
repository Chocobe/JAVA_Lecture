package nonogram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

// 스테이지 불러오기, 출력 담당 클래스

public class Stage {	
	public String[] stage;
	
	// 스테이지 데이터 읽어 오기 (.txt파일)
	public void load_stage() {
		try {
			String[] temp_array= new String[100];
			String temp_line = "";
			int cur_line_num = 0;
			
			// path는 해당 컴퓨터의 경로를 재설정 해야 한다.
			String path = "D:\\Kim_Young_Woo\\JAVA_LECTURE\\Java_practice(git)\\JAVA_Lecture\\Java_tutorial\\src\\nonogram\\nonogram_stage.txt";
			File file = new File(path);
			FileReader file_reader = new FileReader(file);
			BufferedReader buffer_reader = new BufferedReader(file_reader);
			
			while((temp_line = buffer_reader.readLine()) != null) {
				temp_array[cur_line_num] = temp_line;
				cur_line_num++;
			}
			
			this.stage = fix_array_size(temp_array, cur_line_num);
			buffer_reader.close();
			
		} catch (Exception e) {
			System.out.println("스테이지 데이터를 읽을 수 없습니다.");
			System.out.println("게임을 종료합니다.");
			System.exit(0);
		}
	}
	
	
	// 배열의 인덱스 추가하기
	// @author	:	Chocobe
	// @param	:	String[] _source : 임의의 크기에 저장된 스테이지 데이터
	//			:	int _len : 스테이지 데이터의 라인 수
	public String[] fix_array_size(String[] _source, int _len) {
		String[] added_arr = new String[_len];
		
		for(int i = 0; i < _len; i++) {
			added_arr[i] = _source[i];
		}
		
		return added_arr;
	}
}