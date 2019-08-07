package project_04_school_management;

import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("resource")
public class SchoolApp {	
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		School_service school_service = new School_service();
		
		while(true) {
			int input_menu = 0;
			
			// 메뉴 호출
			school_service.mainMenu();
			
			try {
				input_menu = scanner.nextInt();
				
			} catch(InputMismatchException e) {
				out.println("정수로 입력하세요");
				return;				
			}
			
			String cur_name = "";
			switch(input_menu) {			
			case 1:	// 등록
				out.println("등록 선택");
				school_service.register();
				
				break;
				
			case 2: // 검색
				scanner.nextLine();
				out.println("검색 선택");
				System.out.print("검색 이름 입력 : ");
				cur_name = scanner.nextLine();
				System.out.println("------검색결과-----");
				school_service.find_person(cur_name);
				System.out.println("-----------------");
				
				break;
				
			case 3: // 삭제
				scanner.nextLine();
				out.println("삭제 선택");
				System.out.print("삭제 이름 입력 : ");
				cur_name = scanner.nextLine();
				school_service.delete_person(cur_name);

				break;
				
			case 4:	// 출력
				out.println("출력 선택");
				school_service.print_all();
				
				break;
				
			case 5:	// 종료
				out.println("종료 선택");
				System.exit(0);
				
			default:
				out.println("지원하지 않는 메뉴 번호 입니다.");
				break;
			}			
		}// end while		
	}// end main
}





















