package basic_ex;

import java.util.Scanner;

//	11. ���忡 ���ĺ� 2���� �� ���� �� �ĺ��� ���� ��ǥ ���� �Է� �޾� �� �ĺ��� �� ��ǥ���� ��ǥ���� ����ϰ� �����ڸ�
//	����ϴ� ����Ѵ�. ���α׷��� ���� ����  �� ���� ������ "yes"�� �Է��ϰ�,������ "no"�� �Է��Ѵ�
//	������ ���� �ִ����� ����� ���� ������ �ݺ��Ѵ�.
//	
//	���
//	����  �� ���� ������ "yes"�� �Է��ϰ�,������ "no"�� �Է� : yes
//	ù��° �ĺ� ��ǥ �� �Է� : 35382
//	�ι�° �ĺ� ��ǥ �� �Է� : 53287
//	
//	����  �� ���� ������ "yes"�� �Է��ϰ�,������ "no"�� �Է� : yes
//	ù��° �ĺ� ��ǥ �� �Է� : 39019
//	�ι�° �ĺ� ��ǥ �� �Է� : 29040
//	
//	����  �� ���� ������ "yes"�� �Է��ϰ�,������ "no"�� �Է� : yes
//	ù��° �ĺ� ��ǥ �� �Է� : 78569
//	�ι�° �ĺ� ��ǥ �� �Է� : 95209
//	
//	����  �� ���� ������ "yes"�� �Է��ϰ�,������ "no"�� �Է� : no
//	
//	ù��° �ĺ��� ��� �ѵ�ǥ�� 152970�̰� ��ǥ���� 46.3%�̴�
//	�ι�° �ĺ��� ��� �ѵ�ǥ�� 177536�̰� ��ǥ���� 53.7%�̴�
//	
//	�ι�° �ĺ��� �缱 ��

public class Vote {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int first_vote = 0;
		int second_vote = 0;
		int total_vote = 0;
		
		double first_rate = 0F;
		double second_rate = 0F;
		
		String continue_answer = "";
		
		Main_loop : while(true) {
			while(true) {
				System.out.print("����  �� ���� ������ \"yes\"�� �Է��ϰ�,������ \"no\"�� �Է� : ");
				continue_answer = scanner.nextLine();
				
				
				if(continue_answer.equals("yes")) {
					break;
					
				} else if(continue_answer.equals("no")) {
					break Main_loop;
					
				} else {
					System.out.println("�߸��� �Է��Դϴ�.");
				}
			} // while(true)
			
			System.out.print("ù��° �ĺ� ��ǥ �� �Է� : ");
			first_vote += scanner.nextInt();
			
			System.out.print("�ι�° �ĺ� ��ǥ �� �Է� : ");
			second_vote += scanner.nextInt();
			
			scanner.nextLine();			
		} // Main_loop
		
		total_vote = first_vote + second_vote;
		first_rate = ((double)first_vote / total_vote) * 100;
		second_rate = ((double)second_vote / total_vote) * 100;
		
		System.out.println("---------------------------------");
		System.out.printf("ù��° �ĺ��� ��� �ѵ�ǥ�� %d�̰� ��ǥ���� %.1f�̴�\n", first_vote, first_rate);
		System.out.printf("�ι�° �ĺ��� ��� �ѵ�ǥ�� %d�̰� ��ǥ���� %.1f�̴�\n", second_vote, second_rate);
		
		scanner.close();
	} // main
}
