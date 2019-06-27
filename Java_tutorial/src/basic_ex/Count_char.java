package basic_ex;

import java.util.Scanner;

// 4. ���ڿ��� �Է��Ͽ� �� ����(a,e,i,o,u)�� ���� �������� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

public class Count_char {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int consonant_cnt = 0;	// ���� ����
		int vowel_cnt = 0;		// ���� ����
		int digit_cnt = 0;		// ���� ����
		int others_cnt = 0;		// ��Ÿ ����
		
		System.out.println("����4] ���ڿ��� ����/���� ���� ���ϱ�");

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
			System.out.print("������ ���ڿ��� �Է��ϼ��� : ");
			input_data = scanner.nextLine();
			length = input_data.length();
			
			if(length == 0) {
				System.out.println("Error] �Էµ� ���ڿ��� �����ϴ�.");
				continue;
			}
			
			for(int i = 0; i < length; i++) {
				single_string = input_data.charAt(i);
				ascii_val = (int)single_string;
				
				// Ư������ �˻�
				if((0 <= ascii_val && ascii_val <= 47) ||
						(58 <= ascii_val && ascii_val <= 64) ||
						(91 <= ascii_val && ascii_val <= 96) ||
						(123 <= ascii_val && ascii_val <= 127)) {
					others_cnt++;
					
				// ���� �˻�
				} else if(48 <= ascii_val && ascii_val <= 57) {
					digit_cnt++;
					
				// ���� �˻�
				} else if(ascii_val == 'A' || ascii_val == 'E' ||
						  ascii_val == 'I' || ascii_val == 'O' ||
						  ascii_val == 'U' || ascii_val == 'a' ||
						  ascii_val == 'e' || ascii_val == 'i' ||
						  ascii_val == 'o' || ascii_val == 'u') {
					vowel_cnt++;
					
				// ���� �˻�
				} else {
					consonant_cnt++;
				}
				
			} // for(���ڿ� ����)
			
			System.out.println("�Է¹��� : " + input_data);
			System.out.println("���� ���� : " + consonant_cnt);
			System.out.println("���� ���� : " + vowel_cnt);
			System.out.println("���� ���� : " + digit_cnt);
			System.out.println("Ư�� ���� ���� : " + others_cnt + "\n");
			
			while(true) {
				System.out.print("������� �Ͻðڽ��ϱ�? (y/n) : ");
				continuity = scanner.nextLine();
				
				if(continuity.equals("y")) {
					break;
					
				} else if(continuity.equals("n")) {
					break Main_loop;
					
				} else {
					System.out.println("�߸� �Է��߽��ϴ�.");
					continue;
				}
			} // while(true)
		} // Main_loop
	
		scanner.close();
	}
}
