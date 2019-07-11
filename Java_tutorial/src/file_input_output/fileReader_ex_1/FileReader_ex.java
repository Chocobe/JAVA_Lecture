package file_input_output.fileReader_ex_1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_ex {
	public static void main(String[] args) throws IOException {
		
		// 경로 문자열
		String path = "c:\\windows\\System.ini";
		
		try {
			// FileReader 객체 생성 - 매개변수 : (String) 경로
			FileReader file_reader = new FileReader(path);
			int c;
			
			// 문자 하나씩 읽고 출력하기 (EOF일 때 반환값인 -1일 때 까지)
			while((c = file_reader.read()) != -1) {				
				// System.out.print(c); <- 아스키 코드값으로 출력된다. 102485181308518 이런 방식..
				System.out.print((char)c);
			}
			
			// FileReader 객체의 스트림 해제
			file_reader.close();
			
		// FileReader 예외처리
		} catch (FileNotFoundException e) {
			System.out.println("Error] 입출력 오류");
		}
	}
}
