package basic_ex;

import java.util.Scanner;

// 4. ���ڿ��� �Է��Ͽ� �� ����(a,e,i,o,u)�� ���� �������� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

public class Count_char {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int consonant = 0;	// ���� ����
		int vowel = 0;		// ���� ����
		
		System.out.println("���ڿ��� ����/���� ���� ���ϱ�");
		System.out.print("���ڿ��� �Է��ϼ��� : ");

		String input_data = scanner.nextLine();
		String temp_string = input_data;
		String single_string = "";
		int length = input_data.length();
		
		while(length != 0) {
			// �����ϳ� ����
			single_string = temp_string.substring(0, 1);
			// ���ڿ� ���� ����
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
		
		System.out.println("�Է¹��� : " + input_data);
		System.out.println("���� ���� : " + consonant);
		System.out.println("���� ���� : " + vowel);
		
				
		scanner.close();
	}
}
