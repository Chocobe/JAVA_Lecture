package database_oracle.simple_project_DB_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManagerData {
	public MemberDTO dto = new MemberDTO();
	public MemberDAO dao = new MemberDAO();
	
	public static Scanner scanner;
	
	static {
		scanner = new Scanner(System.in);
	}
	
	public void inputData() {
		System.out.println("자료입력");
		
		// id 입력시, 잘못된 데이터 처리(정수형 입력)
		//		- 정수 이외는 예외처리로 재입력
		// id 중복 처리
		
		// ID 입력부
		do {
			try {
				System.out.print("ID입력 : ");
				dto.setId(scanner.nextInt());
				break;
				
			} catch(InputMismatchException e) {
				System.out.println("ID는 정수만 가능합니다");
				scanner.nextLine();
			}
		} while(true);
		
		// 이름 입력부		
		System.out.print("이름입력 : ");
		dto.setName(scanner.nextLine());
		
		// 비번 입력부
		System.out.print("비번입력 : ");
		dto.setPassword(scanner.nextLine());
		
		// email 입력부
		System.out.print("email입력 : ");
		dto.setEmail(scanner.nextLine());
		
		
		// 완성된 DTO를 DAO로 보내기
		dao.registerMember(dto);
		
		System.out.println("inputData 메소드 종료");
	}
	
	
	public void writeAll() {
		System.out.println("전체 회원 출력 페이지");
	}
	
	
	public void searchName() {
		System.out.println("이름으로 회원 검색 페이지");
	}
	
	
	public void modifyData() {
		System.out.println("회원 수정 페이지");
	}
	
	
	public void deleteData() {
		System.out.println("회원 삭제 페이지");
	}
}
