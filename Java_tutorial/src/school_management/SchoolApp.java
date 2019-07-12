package school_management;

import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SchoolApp {	
	// 메인메뉴를 보여주는 메소드
	public void mainMenu() {
		out.println("---------------Main Menu---------------");
		out.println("| 1.등록 2.검색 3.삭제 4.출력 5.종료 |");
		out.println("---------------------------------------");
		out.print("번호를 입력하세요 : ");
	}
	
	
	// 하위메뉴를 보여주는 메소드
	public void subMenu() {
		out.println("---------------Sub menu----------------");
		out.println("| 1.학생 2.강사 3.직원 4.상위메뉴 |");
		out.println("---------------------------------------");
		out.print("번호를 입력하세요 : ");
	}
	
	
	public static void main(String[] args) {	
		SchoolApp app = new SchoolApp();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int input_menu = 0;
			
			// 메뉴 호출
			app.mainMenu();
			
			try {
				input_menu = scanner.nextInt();
				
			} catch(InputMismatchException e) {
				out.println("정수로 입력하세요");
				return;				
			}
			
			switch(input_menu) {
			case 1:	// 등록
				out.println("등록 선택");
				break;
				
			case 2: // 검색
				out.println("검색 선택");
				break;
				
			case 3: // 삭제
				out.println("출력 선택");
				break;
				
			case 4:	// 출력
				out.println("출력 선택");
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





















