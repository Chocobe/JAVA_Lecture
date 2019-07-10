package file_input_output.fileReader_ex_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class FileReader_ex {
	public static void main(String[] args) {
		FileInputStream file_stream = null;
		InputStreamReader reader = null;
		
		try {
			file_stream = new FileInputStream("D:\\hangul.txt");
			reader = new InputStreamReader(file_stream, "UTF-8");
			
			System.out.println("인코딩 집합 문자 : " + reader.getEncoding());
			
			int c = 0;
			
			while((c = reader.read()) != -1) {
				System.out.println((char)c);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일 입출력 오류");
			
		} catch (UnsupportedEncodingException e) {
			System.out.println("지원 문자 집합이 아님");
			
		} catch (IOException e) {
			System.out.println("문자 입출력 오류");
			
		} finally {
			
			try {
				reader.close();
				file_stream.close();
				
			} catch (IOException e) {}
		}
	}
}
