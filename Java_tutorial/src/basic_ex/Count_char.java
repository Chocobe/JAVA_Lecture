package basic_ex;

import java.util.Scanner;

// 4. ���ڿ��� �Է��Ͽ� �� ����(a,e,i,o,u)�� ���� �������� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

public class Count_char {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int consonant = 0;	// ���� ����
		int vowel = 0;		// ���� ����
		int digit = 0;		// ���� ����
		
		System.out.println("����4] ���ڿ��� ����/���� ���� ���ϱ�");

		String input_data = "";
		String single_string = "";
		int length = 0;
		
		String continuity = "";
		
		Main_loop : while(true) {
			System.out.println("-----------------------");
			System.out.print("������ ���ڿ��� �Է��ϼ��� : ");
			input_data = scanner.nextLine();
			length = input_data.length();
			
			if(length == 0) {
				System.out.println("Error] �Էµ� ���ڿ��� �����ϴ�.");
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
			} // for(���ڿ� ����)
			
			System.out.println("�Է¹��� : " + input_data);
			System.out.println("���� ���� : " + consonant);
			System.out.println("���� ���� : " + vowel);
			System.out.println("���� ���� : " + digit + "\n");
			
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
