package database_oracle.simple_project_DB_1;

import java.util.InputMismatchException;
import java.util.Scanner;

import database_oracle.util_OracleDataSource.DBConnection_data_source;

// - 번호별 메뉴 구현
//		1. 회원가입
//		2. 전체출력
//		3. 이름으로 검색
//		4. 회원수정
//		5. 회원삭제
// 		6. 종료

// - 회원 : 집합적인 명사 : 클래스
//		1. id
//		2. name
//		3. password
//		4. email

// - 회원의 정보를 입력받아 하나의 객체 생성

// - 회원 클래스 : 데이터베이스에 저장, 검색 하기
//		DTO(Data Transfer Object)	==> brean
//		VO (Value Object) 		 	==> bean

// 유효성 검사
// ID : 6글자 이상
// PASS : 6글자 이상
// EMAIL : @ 문자 유무 검사

public class MemberMain {
	private static ManagerData manager = new ManagerData();
	private static Scanner scanner = new Scanner(System.in);
	

// 메인 메소드
	public static void main(String[] args) {
		
		while(true) {			
			int selected_menu = input_main_menu();
			
			enter_menu(selected_menu);
		}
	}
	
	
// 메뉴 출력부
	public static void print_menu() {
		System.out.println("------------------------------------------------------------------------------------------");
		
		System.out.println(
				"[1.회원가입] | [2.전체출력] | [3.이름으로 검색] | " +
				"[4.회원수정] | [5.회원삭제] | [6. 전체삭제] | [7.종료]");
		
		System.out.println("------------------------------------------------------------------------------------------");
	}
	

// 메뉴 선택 메소드
	public static int input_main_menu() {
		int input_val = 0;
		
		while(true) {
			try {
				print_menu();
				System.out.print(">> ");
				
				input_val = scanner.nextInt();
				break;
				
			} catch(InputMismatchException e) {
				System.out.println("유효하지 않은 선택입니다");
				scanner.nextLine();
				
			} finally {
				System.out.println();
			}
		}
		
		
		return input_val;
	}
	
	
// 메뉴 열기 메소드
	public static boolean enter_menu(int _input_val) {
		boolean valid_state = true;
		
		switch(_input_val) {
		case 1:
			System.out.println("[1.회원가입] 선택");
			manager.inputData();
			break;
			
		case 2:
			System.out.println("[2.전체출력] 선택");
			manager.writeAll();
			break;
			
		case 3:
			System.out.println("[3.이름으로 검색] 선택");
			manager.searchName();
			break;
			
		case 4:
			System.out.println("[4.회원수정] 선택");
			manager.modifyData();
			break;
			
		case 5:
			System.out.println("[5.회원삭제] 선택");
			manager.deleteData();
			break;
			
		case 6:
			System.out.println("[6.전체삭제] 선택");
			manager.delete_all();
			break;
			
		case 7:
			System.out.println("[7.종료] 선택");
			DBConnection_data_source.close_connection();
			ManagerData.scanner.close();
			System.exit(0);
			break;
			
		default:
			System.out.println("잘못된 입력입니다.");
			valid_state = false;
			break;
		}
		
		return valid_state;
	}
}
