package file_input_output.file_ex_2;

import java.io.File;

public class File_ex_2 {
	public static void main(String[] args) {
		list_directory(new File("C:\\windows"));
	}
	
	
	private static void list_directory(File _dir) {
		System.out.println("-----" + _dir.getPath() + "의 서브 리스트 입니다.");
		
		File[] subfiles = _dir.listFiles();		
		for(int i = 0; i < subfiles.length; i++) {
			File f = subfiles[i];
			long t = f.lastModified();
			
			System.out.print(f.getName());
			System.out.print("\t파일 크기 : " + f.length());
			System.out.printf("\t수정한 시간 : %tb %td %ta %tT\n", t, t, t, t);
		}
	}
}
