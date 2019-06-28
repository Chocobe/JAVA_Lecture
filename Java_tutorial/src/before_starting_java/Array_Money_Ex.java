package before_starting_java;

import java.util.Scanner;

// �迭 ���� 5
// �Է��� �ݾ��� 50000��, 10000��, 5000��, 1000��, 500��, 100��, 50��, 1�� ���� ȯ�� ����ϱ�

public class Array_Money_Ex {
	
	public static int[] money_unit = {50000, 10000, 5000, 1000, 500, 100, 50, 1};
	public static int MONEY_UNIT_LEN = money_unit.length;
	public static int[] money_unit_cnt = new int[MONEY_UNIT_LEN];
	
	public final static int PAPER_MONEY = 4;
	public final static int COIN_MONEY = 4;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int cur_money = 0;
		
		while(true) {
			print_line();
			print_intro();
			
			cur_money = input_money(scanner);
			money_unit_cnt = exchange_unit(cur_money);
			
			print_unit_cnt();
			
			if(isEXIT(scanner)) { 
				print_ending();
				break; }
		} // while(true)
		
		scanner.close();
	} //main
	
	
	// ��Ʈ�� �޼ҵ�
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public static void print_intro() {
		System.out.print("����� �ݾ��� �Է��ϼ��� : ");
	}
	
	
	// ���� �޼ҵ�
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public static void print_ending() {
		System.out.println("----------------�����մϴ�----------------");
	}
	
	
	// ���� �޼ҵ�
	// @author	:	Chocobe
	// @param	:	Scanner _sc	: Scanner ��ü
	// @return	:	true	: ����
	//			:	false	: ���
	public static boolean isEXIT(Scanner _sc) {
		String answer = "";
		boolean return_answer = false;		
		
		System.out.println("\n");
		System.out.print("�����Ͻðڽ��ϱ�?(y/n) : ");
		
		_sc.nextLine();
		answer = _sc.nextLine();
		
		if(answer.equals("y")) {
			return_answer = true;
			
		} else {
			return_answer = false;
		}
		
		return return_answer;
	}
	
	
	// ���� �Է� �޼ҵ�
	// @author	:	Chocobe
	// @param	:	Scanner _sc	: Scanner ��ü
	// @return	:	(int)�Էµ� �ݾ�
	public static int input_money(Scanner _sc) {
		return _sc.nextInt();
	}
	
	
	// �� ȭ������� ȯ���ϴ� �޼ҵ�
	// @author	:	Chocobe
	// @param	:	int _money	: ����� �ݾ�
	// @return	:	(int[])ȭ�� ȯ��� ����
	public static int[] exchange_unit(int _money) {
		int cur_money = _money;
		int[] temp_unit = new int[MONEY_UNIT_LEN];
		
		for(int i = 0; i < MONEY_UNIT_LEN; i++) {
			temp_unit[i] = cur_money / money_unit[i];
			cur_money = cur_money - (temp_unit[i] * money_unit[i]);
		}
		
		return temp_unit;
	}
	
	
	// ȯ��� ��� ��� �޼ҵ�
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public static void print_unit_cnt() {
		System.out.println();
		
		for(int i = 0; i < PAPER_MONEY; i++) {
			System.out.printf("%7d��    : %2d ��\t", money_unit[i], money_unit_cnt[i]);
		}
		
		System.out.println();
		
		for(int i = PAPER_MONEY; i < MONEY_UNIT_LEN; i++) {
			System.out.printf("%7d��    : %2d ��\t", money_unit[i], money_unit_cnt[i]);
		}
	}
	
	
	// ���� ���
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public static void print_line() {
		System.out.println("----------------------------------------");
	}
}
