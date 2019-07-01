package before_starting_java;

import java.util.Scanner;

public class Array_Ex_Slot_Mathine_teacher {	
	
	public static final int DEFAULT_MONEY = 1000;
	
	public static void main(String[] args) {
		
		run_game();
	}
	
	
	// ���� ����
	public static void run_game() {
		
		Scanner sc = new Scanner(System.in);
		
		int current_money = DEFAULT_MONEY;
		int bet_money = 0;
		
		do {
			System.out.printf("���� ���� �ִ� �� : %d\n", current_money);
			bet_money = betting(current_money, sc);
			System.out.printf("������ �� : %d\n", bet_money);
			current_money -= bet_money;
			
		} while(current_money > 0);
		
		sc.close();
	}
	
	
	// ���� �ݾ� �Է�
	// @param	:	int _current_money	: ���� ���� �ݾ�
	//			:	Scanner _sc	:	Scanner ��ü
	// @return	:	(int) ����ڰ� ������ ��
	public static int betting(int _current_money, Scanner _sc) {
		
		int bet_money = 0;
		boolean flag = false;
		do {
			System.out.print("������ ���� �Է��ϼ���.(�����Ͻ÷��� 0�� �Է��ϼ���) : ");
			bet_money = _sc.nextInt();
			
			if(bet_money > _current_money) {
				System.out.println("���� �ִ� ���� �����մϴ�.");
				flag = true;			
				
			} else if(bet_money < 0) {
				System.out.println("������ ���� 0���� Ŀ�� �մϴ�.");
				flag = true;
				
			} else if(bet_money == 0) {
				System.out.println("���� ����");
				System.exit(0);
				
			} else { flag = false; }
		} while(!flag);
		
		return bet_money;
	}
}










































