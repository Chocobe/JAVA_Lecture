package basic_ex;

import java.util.Scanner;

// 4. 문자열을 입력하여 각 모음(a,e,i,o,u)의 수와 자음들의 수를 출력하는 프로그램을 작성하시오.

public class Count_char {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int consonant = 0;	// 자음 개수
		int vowel = 0;		// 모음 개수
		int digit = 0;		// 숫자 개수
		
		System.out.println("문제4] 문자열의 자음/모음 개수 구하기");

		String input_data = "";
		String single_string = "";
		int length = 0;
		
		String continuity = "";
		
		Main_loop : while(true) {
			System.out.println("-----------------------");
			System.out.print("조사할 문자열을 입력하세요 : ");
			input_data = scanner.nextLine();
			length = input_data.length();
			
			if(length == 0) {
				System.out.println("Error] 입력된 문자열이 없습니다.");
				continue;
			}
			
			for(int i = 0; i < length; i++) {
				single_string = input_data.substring(i, i + 1);

				switch(single_string) {
				case "a": case "e": case "i": case "o": case "u":
					vowel++;
					break;
				
				case "0": case "1": case "2": case "3": case "4":
				case "5": case "6": case "7": case "8": case "9":
					digit++;
					break;
					
				default :
					consonant++;
				}
			} // for(문자열 길이)
			
			System.out.println("입력문자 : " + input_data);
			System.out.println("자음 개수 : " + consonant);
			System.out.println("모음 개수 : " + vowel);
			System.out.println("숫자 개수 : " + digit + "\n");
			
			while(true) {
				System.out.print("계속진행 하시겠습니까? (y/n) : ");
				continuity = scanner.nextLine();
				
				if(continuity.equals("y")) {
					break;
					
				} else if(continuity.equals("n")) {
					break Main_loop;
					
				} else {
					System.out.println("잘못 입력했습니다.");
					continue;
				}
			} // while(true)
		} // Main_loop
	
		scanner.close();
	}
}
