package before_starting_java;

import java.util.Scanner;

public class FlowEx8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String ID = "";
		char gender = ' ';
		
		System.out.print("주민등록번호를 입력하세요 : ");
		ID = scanner.nextLine();
		gender = ID.charAt(7);
		
		switch(gender) {
		case '1' : case '3':
			System.out.println("남성입니다.");
			break;
			
		case '2' : case '4' :
			System.out.println("여성입니다.");
			break;
			
		default :
			System.out.println("잘못된 입력입니다.");
		}
		
		scanner.close();
	}
}
