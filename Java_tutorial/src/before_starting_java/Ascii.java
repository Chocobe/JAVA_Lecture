package before_starting_java;

import java.util.Scanner;

public class Ascii {
	public static void main(String[] args) {
		
		final int MIN = (int)'a';	// a�� �ƽ�Ű�ڵ� ��
		final int MAX = (int)'z';	// b�� �ƽ�Ű�ڵ� ��
		
		Scanner scanner = new Scanner(System.in);
		
		char input_data = ' ';
		int input_data_ascii = 0;
		
		String answer = "";
		
		while(true) {
			System.out.println("---------------------------");
			System.out.print("���� �ϳ� �Է� : ");
			input_data = scanner.nextLine().charAt(0);
			input_data_ascii = (int)input_data;
			
			if(MIN <= input_data_ascii && input_data_ascii <= MAX) {
				System.out.println("���ĺ� �ҹ���");
				System.out.println(input_data + "�� �ƽ�Ű�� : " + input_data_ascii);
				
			} else {
				System.out.println("���ĺ� �ҹ��ڰ� �ƴմϴ�.");
			}
			
			System.out.print("����(y/n) : ");
			answer = scanner.nextLine();
			
			if(answer.equals("y")) {
				break;
			}
		}
				
		scanner.close();
	}
}
