package before_starting_java;

import java.util.Scanner;

public class OperatorEx25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		String str = null;
		
		System.out.printf("���ڸ� �ϳ� �Է��ϼ���. > ");
		
		String input = scanner.nextLine();
		ch = input.charAt(1);
		
		if('0' < ch && ch <= '9') {
			str = "�Է��Ͻ� ���ڴ� �����Դϴ�.";
		}
		
		if(('a' <= ch && ch <= 'z') || ('A' <= ch&& ch <= 'Z')) {
			str = "�Է��Ͻ� ���ڴ� �������Դϴ�.";
		}
		System.out.println(str);
		
		scanner.close();
	}
}
