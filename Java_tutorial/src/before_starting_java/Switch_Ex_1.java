package before_starting_java;

import java.io.IOException;
import java.util.Scanner;

public class Switch_Ex_1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int lhs = 0;
		int rhs = 0;
		char operator = ' ';
		int result_val = 0;
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		lhs = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.print("연산자를 입력하세요 : ");
		
		// 아스키 코드값으로 읽어옴 -> 아스키코드값을 문자로 형변환
		try {
			operator = (char)System.in.read();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		rhs = scanner.nextInt();
		
		switch(operator) {
		case '+' :
			result_val = lhs + rhs;
			break;
			
		case '-' :
			result_val = lhs - rhs;
			break;
			
		case '*' :
			result_val = lhs * rhs;
			break;
			
		case '/' :
			if(rhs == 0) {
				System.out.println("--------------------------------");
				System.out.println("제수가 0인 예외조건 발생 !");
				result_val = -100000;
				
				scanner.close();
				return;
			}
			result_val = lhs / rhs;
			break;
			
		default :
			result_val = 0;
			operator = 'N';
		}
		
		System.out.println("--------------------------------");
		System.out.println("좌측항 : " + lhs + ", 우측항 : " + rhs + ", 연산자 : " + operator);
		System.out.println("결과값 : " + result_val);
		
		scanner.close();
		
	}
}
