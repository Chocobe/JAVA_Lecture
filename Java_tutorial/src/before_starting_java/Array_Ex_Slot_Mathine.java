package before_starting_java;

import java.util.Scanner;

public class Array_Ex_Slot_Mathine {
	
	public static final int CAN = 1;
	public static final int CANNOT = 0;
	public static final int STOP = -1;
	
	public static int g_my_money = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		// 1. �ʱ�ȭ
		init_my_money();
		
		run_game();
		
		scanner.close();
	}
	
	
	// 0. ���� ����
	public static void run_game() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			boolean proper_money = false;
			int batting_money = 0;
			
			// 2. ������ ���
			print_my_money();
			
			// 3. ���� �Է�
			batting_money = insert_coin(scanner);
			
			// 4. ���� �˻�
			if(batting_money == 0) {
				break;	
			}
			
			// 5. ������ ����
			if(isRightToBatting(batting_money)) {
				update_my_money(batting_money, '-');
			}
			
			
			System.out.println("--------------------");
						
		}
		
		scanner.close();
	}
	
	
	// 1. �ʱ�ȭ
	// TESTed
	public static void init_my_money() {
		g_my_money = 1000;
	}
	
	
	// 2. ������ ���
	// TESTed
	public static void print_my_money() {
		System.out.println("���� ������ : " + g_my_money);
	}
	
	
	// 3. ���� �Է�
	// TESTed
	public static int insert_coin(Scanner _sc) {		
		System.out.print("���� �ݾ��� �Է��ϼ��� : ");
		return _sc.nextInt();
	}
	
	
	// 4. ���� ��ȿ �˻�
	// TESTed
	// 		1 : ��ȿ
	// 		2 : �Ұ�
	//		-1 : ����
	public static boolean isRightToBatting(int _batting) {
		boolean isRightToBatting = false;
		
		if(_batting > g_my_money) {
			System.out.println("�������� �����մϴ�.");
			print_my_money();
			
		} else if(_batting < 0) {
			System.out.println("�������� 0���� Ŀ�� �մϴ�.");
			
		} else {
			isRightToBatting = true;
		}
		
		return isRightToBatting;
	}
	
	
	// 5. ������ ����
	// TESTed
	public static void update_my_money(int _money, char _operator) {
		switch(_operator) {
		case '+':
			g_my_money += _money;
			break;
			
		case '-':
			g_my_money -= _money;
			break;
		}
	}
}
