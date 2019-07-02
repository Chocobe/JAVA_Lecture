package basic_ex;

import java.util.Scanner;

// 4. 문자열을 입력하여 각 모음(a,e,i,o,u)의 수와 자음들의 수를 출력하는 프로그램을 작성하시오.

public class Count_char {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int consonant_cnt = 0;	// 자음 개수
		int vowel_cnt = 0;		// 모음 개수
		int digit_cnt = 0;		// 숫자 개수
		int others_cnt = 0;		// 기타 개수
		
		System.out.println("문제4] 문자열의 자음/모음 개수 구하기");

		String input_data = "";
		char single_string = ' ';
		int ascii_val = 0;
		int length = 0;
		
		String continuity = "";
		
		Main_loop : while(true) {
			
			consonant_cnt = 0;
			vowel_cnt = 0;
			digit_cnt = 0;
			others_cnt = 0;
			
			System.out.println("-----------------------");
			System.out.print("조사할 문자열을 입력하세요 : ");
			input_data = scanner.nextLine();
			length = input_data.length();
			
			if(length == 0) {
				System.out.println("Error] 입력된 문자열이 없습니다.");
				continue;
			}
			
			for(int i = 0; i < length; i++) {
				single_string = input_data.charAt(i);
				ascii_val = (int)single_string;
				
				// 특수문자 검사
				if((0 <= ascii_val && ascii_val <= 47) ||
						(58 <= ascii_val && ascii_val <= 64) ||
						(91 <= ascii_val && ascii_val <= 96) ||
						(123 <= ascii_val && ascii_val <= 127)) {
					others_cnt++;
					
				// 숫자 검사
				} else if(48 <= ascii_val && ascii_val <= 57) {
					digit_cnt++;
					
				// 모음 검사
				} else if(ascii_val == 'A' || ascii_val == 'E' ||
						  ascii_val == 'I' || ascii_val == 'O' ||
						  ascii_val == 'U' || ascii_val == 'a' ||
						  ascii_val == 'e' || ascii_val == 'i' ||
						  ascii_val == 'o' || ascii_val == 'u') {
					vowel_cnt++;
					
				// 자음 검사
				} else {
					consonant_cnt++;
				}
				
			} // for(문자열 길이)
			
			System.out.println("입력문자 : " + input_data);
			System.out.println("자음 개수 : " + consonant_cnt);
			System.out.println("모음 개수 : " + vowel_cnt);
			System.out.println("숫자 개수 : " + digit_cnt);
			System.out.println("특수 문자 개수 : " + others_cnt + "\n");
			
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
