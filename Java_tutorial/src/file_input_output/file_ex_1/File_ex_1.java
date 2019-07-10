package file_input_output.file_ex_1;

import java.io.File;

public class File_ex_1 {
	public static void main(String[] args) {
		File file_1 = new File("C:\\windows\\system.ini");
		System.out.println(file_1.getPath() + ", " + file_1.getParent() + ", " + file_1.getName());
		
		String res = "";
		if(file_1.isFile()) {
			res = "파일";
			
		} else if(file_1.isDirectory()) {
			res = "디렉토리";
		}
		System.out.println(file_1.getPath() + "은(는) " + res + "입니다.");
		
		System.out.println();
		
		File file_2 = new File("C:\\windows");
		if(file_2.isFile()) {
			res = "파일";
			
		} else if(file_2.isDirectory()) {
			res = "디렉토리";
		}
		System.out.println(file_2.getPath() + "은(는) " + res + "입니다.");
		
		System.out.println();
		
		File file_3 = new File("D:\\Temp");
		if(!file_3.exists()) {
			file_3.mkdir();
		}
	}
}
