package basic_ex;

import java.util.Scanner;

//	3. ���θ�Ʈ�� ��� ��ǰ�� ������ 500���ϴ�. ���� �Ѱ��� ��� 500���� �� �� �Ž������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//	���
//	���űݾ��� �Է��Ͻÿ�(0-500) : 122
//	378���� �Ž��� ���� ������ ����
//	100�� ���� : 3��
//	10�� ���� :  7��
//	1�� ����  :  8��

public class Coin {
	public static void main(String[] args) {
		System.out.println("����3] �Ž����� ���ϱ�");
		
		Scanner scanner = new Scanner(System.in);
		
		final int MY_MONEY = 500;
		
		int coin_1 = 0;
		int coin_10 = 0;
		int coin_100 = 0;
		
		int price = 0;

		String user_answer = "";
		
		Main_loop : while(true) {
			
			System.out.print("���ǰ��� �Է��ϼ���(500�� ����) : ");			
			price = scanner.nextInt();

			int remain_money = MY_MONEY - price;
			
			coin_100 = remain_money / 100;
			remain_money %= 100;
			
			coin_10 = remain_money / 10;
			coin_1 = remain_money % 10;
			
			System.out.println("100�� ���� : " + coin_100);
			System.out.println("10�� ���� : " + coin_10);
			System.out.println("1�� ���� : " + coin_1);
			
			scanner.nextLine();
			
			while(true) {				
				System.out.print("��� ���� �Ͻðڽ��ϱ�? (y/n) : ");
				user_answer = scanner.nextLine();
				
				if(user_answer.equals("y")) {
					break;
					
				} else if(user_answer.equals("n")) {
					break Main_loop;
					
				} else {
					System.out.println("Error] �߸� �Է��߽��ϴ�.");
				}
			}// while(true) - EXIT
			
			System.out.println("---------------------------");
		}// Main_loop : while - EXIT
		
		scanner.close();
	}// main - EXIT
}
