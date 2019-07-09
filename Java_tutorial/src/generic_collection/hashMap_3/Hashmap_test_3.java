package generic_collection.hashMap_3;

import java.util.HashMap;
import java.util.Scanner;

public class Hashmap_test_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Student> map = new HashMap<String, Student>();
		
		map.put("황기태", new Student(1, "010-111-1111"));
		map.put("이재문", new Student(2, "010-222-2222"));
		map.put("김남윤", new Student(3, "010-333-3333"));
		
		String input_name = "";
		
		while(true) {
			System.out.print("검색할 이름(종료 : exit) : ");
			input_name = scanner.nextLine();
			
			if(input_name.equals("exit")) {
				break;
			}
			
			Student student = map.get(input_name);
			
			if(student == null) {
				System.out.println("정보가 없습니다.");
				
			} else {
				System.out.println("이름 : " + input_name);
				System.out.println("id : " + student.get_id() + ", tel : " + student.get_tel());
			}
			
			System.out.println();
		}
		
		scanner.close();
	}
}
