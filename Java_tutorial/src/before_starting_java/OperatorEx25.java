package before_starting_java;

import java.util.Scanner;

public class OperatorEx25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		String str = null;
		
		System.out.printf("문자를 하나 입력하세요. > ");
		
		String input = scanner.nextLine();
		ch = input.charAt(1);
		
		if('0' < ch && ch <= '9') {
			str = "입력하신 문자는 숫자입니다.";
		}
		
		if(('a' <= ch && ch <= 'z') || ('A' <= ch&& ch <= 'Z')) {
			str = "입력하신 문자는 영문자입니다.";
		}
		System.out.println(str);
		
		scanner.close();
	}
}
