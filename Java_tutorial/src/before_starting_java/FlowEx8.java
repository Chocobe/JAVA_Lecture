package before_starting_java;

import java.util.Scanner;

public class FlowEx8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String ID = "";
		char gender = ' ';
		
		System.out.print("�ֹε�Ϲ�ȣ�� �Է��ϼ��� : ");
		ID = scanner.nextLine();
		gender = ID.charAt(7);
		
		switch(gender) {
		case '1' : case '3':
			System.out.println("�����Դϴ�.");
			break;
			
		case '2' : case '4' :
			System.out.println("�����Դϴ�.");
			break;
			
		default :
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		
		scanner.close();
	}
}
