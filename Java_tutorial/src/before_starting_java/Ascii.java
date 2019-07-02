package before_starting_java;

import java.util.Scanner;

public class Ascii {
	public static void main(String[] args) {
		
		final int MIN = (int)'a';	// a의 아스키코드 값
		final int MAX = (int)'z';	// b의 아스키코드 값
		
		Scanner scanner = new Scanner(System.in);
		
		char input_data = ' ';
		int input_data_ascii = 0;
		
		String answer = "";
		
		while(true) {
			System.out.println("---------------------------");
			System.out.print("문자 하나 입력 : ");
			input_data = scanner.nextLine().charAt(0);
			input_data_ascii = (int)input_data;
			
			if(MIN <= input_data_ascii && input_data_ascii <= MAX) {
				System.out.println("알파벳 소문자");
				System.out.println(input_data + "의 아스키값 : " + input_data_ascii);
				
			} else {
				System.out.println("알파벳 소문자가 아닙니다.");
			}
			
			System.out.print("종료(y/n) : ");
			answer = scanner.nextLine();
			
			if(answer.equals("y")) {
				break;
			}
		}
				
		scanner.close();
	}
}
