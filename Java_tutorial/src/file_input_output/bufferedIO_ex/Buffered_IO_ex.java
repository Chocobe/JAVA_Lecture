package file_input_output.bufferedIO_ex;

import java.io.BufferedOutputStream;
import java.io.FileReader;

public class Buffered_IO_ex {
	public static void main(String[] args) {
		FileReader file_reader = null;
		BufferedOutputStream out = null;
		
		int c;
		
		try {
			file_reader = new FileReader("D:\\test2.txt");
			out = new BufferedOutputStream(System.out, 5);
			
			while((c = file_reader.read()) != -1) {
				out.write(c);
			}
			
		} catch(Exception e) {
			System.out.println("파일을 읽을 수 없습니다.");
			
		} finally {
			try {
				if(out != null) {
					out.close();
				}
				
				if(file_reader != null) {
					file_reader.close(); 
				}
				
			} catch(Exception e) {
				
			}
		}
			
	}
}
