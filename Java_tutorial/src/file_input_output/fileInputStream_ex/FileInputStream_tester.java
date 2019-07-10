package file_input_output.fileInputStream_ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_tester {
	public static void main(String[] args) {
		
		FileInputStream file_input_stream = null;
		
		byte[] b = new byte[6];
		int c = 0;
		int idx = 0;
		
		try {
			file_input_stream = new FileInputStream("D:\\Hello.txt");
			
			while((c = file_input_stream.read()) != -1) {
				b[idx] = (byte)c;
				idx++;
			}// while((c = file_input_stream.read()))
			
			System.out.println("읽어온 데이터를 출력합니다");
			for(int i = 0; i < b.length; i++) {
				System.out.print(b[i] + " ");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다");
			
		} catch (IOException e) {
			System.out.println("입출력 오류");
			
		} finally {
			try {
				if(file_input_stream != null) {
					file_input_stream.close();
				}
				
			} catch (Exception e) {
				System.out.println("종료 오류"); 
			}
		}
	}
}
