package file_input_output.fileWriter_ex_1;

import java.io.FileWriter;
import java.util.Scanner;

public class FileWriter_ex {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter file_writer = null;
		
		try {
			file_writer = new FileWriter("D:\\file_writer_test.txt");
			
			while(true) {
				String line = scanner.nextLine();
				
				if(line.length() == 0) {
					break;
				}
				
				file_writer.write(line, 0, line.length());
				file_writer.write("\r\n", 0, 2);
			}// while(true)
			
			file_writer.close();
			
		} catch(Exception e) {
			System.out.println("입출력 오류");
		}
		
		scanner.close();
	}
}