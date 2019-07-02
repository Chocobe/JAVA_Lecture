package nonogram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.util.List;

//List<String> lines = Files.readAllLines(Paths.get("practice.txt"));
//String[] line = lines.toArray(new String[lines.size()]);

public class TEST {
	public static void main(String[] args) {
		String origin_data = "";
		String current_line = "";
		char[][] puzzle_data = null;
		
		int row = 0;
		int col = 0;
		
		String path = "D:\\Kim_Young_Woo\\JAVA_LECTURE\\Java_practice(git)\\JAVA_Lecture\\Java_tutorial\\src\\nonogram\\nonogram_path.txt";
		
		File file = new File(path);
		
		try {
			FileReader file_reader = new FileReader(file);
			BufferedReader buffer_reader = new BufferedReader(file_reader);
			
			buffer_reader.close();
			
		} catch (Exception e) {}
		
		System.out.println(origin_data);
	}
}
