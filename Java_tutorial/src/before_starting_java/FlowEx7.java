package before_starting_java;

import java.util.Scanner;

public class FlowEx7 {
	public static void main(String[] args) {
		System.out.println("---����, ����, �� ����---");
		System.out.println("����(1), ����(2), ��(3), ����(0)");
		
		Scanner scanner = new Scanner(System.in);
		
		int user = 0;
		int com = 0;
		int result = 0;
		
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		while(true) { 
			System.out.print("���� �����ϼ��� : ");
			user = scanner.nextInt();
			com = (int)(Math.random() * 3) + 1;
			result = user - com;
			
			if(user == 0) {
				break;
			}
		
			System.out.println("----------------------");
			System.out.println("���� : " + user + ", com : " + com);
			
			switch(result) {
			case 0 :
				System.out.println("�����ϴ�.");
				draw++;
				break;
				
			case 1 : case -2 :
				System.out.println("�̰���ϴ�.");
				win++;
				break;
				
			case -1 : case 2 :
				System.out.println("�����ϴ�.");
				lose++;
				break;
				
			default : 
				System.out.println("�߸��� �Է°�");
				break;
			}
			
			System.out.println("�� : " + win + ", �� : " + lose + ", ���º� : " + draw);
			System.out.println("----------------------");
		}
		
		scanner.close();
	}
}
