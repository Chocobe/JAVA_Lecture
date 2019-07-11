package file_input_output.fileOutputStream_ex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_tester {
	public static void main(String[] args) {
		byte b[] = { 7, 51, 3, 4, -1, 24 };
		FileOutputStream file_output_stream = null;
		
		try {
			file_output_stream = new FileOutputStream("D:\\tester.out");
			
			for(int i = 0; i < b.length; i++) {
				file_output_stream.write(b[i]);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일 생성 실패 [" + e.getMessage() + "]");
			
		} catch (IOException e) {
			System.out.println("입출력 오류");
			
		} finally {
			try {
				if(file_output_stream != null) {
					file_output_stream.close();
				}
				
			} catch (IOException e) {}
		}
		
		System.out.println("프로그램 종료");
	}
}
