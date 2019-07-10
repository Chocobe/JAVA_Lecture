package generic_collection.hashMap_4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

// 나라 이름과 인구를 입력하세요. (exit 입력시, 입력 종료)
// 입력 데이터는 HashMap으로 만들기
// 입력 종료 -> 인구 검색
// 검색 나라가 없으면, 없음 문장 출력

public class Nation_tester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> nation_db = new HashMap<String, Integer>();
		
		String input_nation = "";
		int input_population = 0;
		boolean is_continue = true;
		
		while(is_continue) {
			System.out.print("나라이름 입력 : ");
			input_nation = scanner.nextLine();
			
			while(true) {
				try {
					System.out.print("인구수 입력 : ");
					input_population = scanner.nextInt();
					scanner.nextLine();	// 버퍼 비우기
					break;
					
				} catch(Exception e) {
					System.out.println("입력된 인구수는 유효하지 않습니다\n");
					scanner.nextLine(); // 버퍼 비우기
					continue;
				}
			}// while(true)
			nation_db.put(input_nation, input_population);
			
			while(true) {
				System.out.print("계속 입력하시겠습니까(y/n) : ");
				String answer_continue = scanner.nextLine();
				
				if(answer_continue.equals("y")) {
					is_continue = true;
					break;
					
				} else if(answer_continue.equals("n")) {
					is_continue = false;
					break;
					
				} else {
					System.out.println("잘못된 입력입니다\n");
					continue;
				}
			}// while(true)
		}// while(is_continue)
		
		
		System.out.println("\n--- 데이터 검색 모드 ---");
		is_continue = true;
		
		Set<String> nation_db_keys = nation_db.keySet();
		Iterator<String> itr = nation_db_keys.iterator();
		
		while(is_continue) {
			// Iterator는 인덱스 초기화가 없다. -> 매번 검색마다 새로운 Iterator객체를 가져오자.
			itr = nation_db_keys.iterator();
			
			System.out.print("검색할 나라 입력(종료 : exit) : ");
			input_nation = scanner.nextLine();
			
			if(input_nation.equals("exit")) {
				is_continue = false;
				continue;
			}
			
			while(itr.hasNext()) {
				if(input_nation.equals(itr.next())) {
					int cur_population = nation_db.get(input_nation);
					System.out.println("나라 : " + input_nation + ", 인구 : " + cur_population + "\n");
					break;
				}
				
				if(!itr.hasNext()) {
					System.out.println("저장된 데이터가 없습니다.\n");
				}
			}// while(itr.hasNext())
		}// while(is_continue)
		
		System.out.println("프로그램을 종료합니다\n");		
		scanner.close();
	}
}
