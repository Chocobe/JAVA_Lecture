package generic_collection.hashMap_1;

import java.util.HashMap;
import java.util.Scanner;

public class Hashmap_tester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		HashMap<String, String> hash = new HashMap<String, String>();
		
		hash.put("baby", "아기");
		hash.put("apple", "사과");
		hash.put("love", "사랑");
		
		while(true) {
			System.out.print("찾을 단어(종료:exit) : ");
			String input_data = scanner.nextLine();
			
			if(input_data.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			
			String found_data = hash.get(input_data);
			
			if(found_data == null) {
				System.out.println("일치하는 데이터가 없습니다.");
				
			} else {
				System.out.println(found_data);
			}
		}
		
		scanner.close();
	}
}
