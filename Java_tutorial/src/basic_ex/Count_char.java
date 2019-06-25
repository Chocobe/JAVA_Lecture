package basic_ex;

import java.util.Scanner;

// 4. 문자열을 입력하여 각 모음(a,e,i,o,u)의 수와 자음들의 수를 출력하는 프로그램을 작성하시오.

public class Count_char {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int consonant = 0;	// 자음 개수
		int vowel = 0;		// 모음 개수
		
		System.out.println("문자열의 자음/모음 개수 구하기");
		System.out.print("문자열을 입력하세요 : ");

		String input_data = scanner.nextLine();
		String temp_string = input_data;
		String single_string = "";
		int length = input_data.length();
		
		while(length != 0) {
			// 문자하나 추출
			single_string = temp_string.substring(0, 1);
			// 문자열 길이 갱신
			length = temp_string.length();
			
			if(length > 0) {
				temp_string = temp_string.substring(1, length - 1);
			}
			
			switch(single_string) {
			case "a": case "e": case "i": case "o": case "u":
				vowel++;
				
			default :
				consonant++;
			}
		}
		
		System.out.println("입력문자 : " + input_data);
		System.out.println("자음 개수 : " + consonant);
		System.out.println("모음 개수 : " + vowel);
		
				
		scanner.close();
	}
}
