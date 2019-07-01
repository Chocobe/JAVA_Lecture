package before_starting_java;

import java.io.IOException;
import java.util.Scanner;

public class Array_Ex_Slot_Mathine_teacher {	
	
	public static final int DEFAULT_MONEY = 1000;
	
	public static final int PLAYER_WIN_0 = 0;
	public static final int PLAYER_WIN_1 = 1;
	public static final int PLAYER_WIN_2 = 2;
	public static final int PLAYER_WIN_3 = 3;
	public static final int PLAYER_WIN_4 = 4;
	
	public static void main(String[] args) {
		
		run_game();
	} //main
	
	
	// ���� ����
	// @author	:	teacher
	// @param	:	N/A
	// @return	:	N/A
	public static void run_game() {
		
		Scanner sc = new Scanner(System.in);
		
		int current_money = DEFAULT_MONEY;
		int bet_money = 0;
		
		run_machine();
		
		do {
			System.out.printf("���� ���� �ִ� �� : %d\n", current_money);
			bet_money = betting(current_money, sc);
			System.out.printf("������ �� : %d\n", bet_money);
			run_machine();
			current_money -= bet_money;
			
		} while(current_money > 0);
		
		sc.close();
	}
	
	
	// ���� �ݾ� �Է�
	// @author	:	teacher
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
				
			} else if(bet_money < 0) {
				System.out.println("������ ���� 0���� Ŀ�� �մϴ�.");
				
			} else if(bet_money == 0) {
				System.out.println("���� ����");
				System.exit(0);
				
			} else { flag = true; }
		} while(!flag);
		
		return bet_money;
	}
	
	
	// ������ �����Ͽ�, �ش� ��ȣ�� ��ȯ
	// @author	:	teacher
	// @param	:	N/A
	// @return	:	(char) ���� ��ȣ
	public static char generate_symbol() {
		// 7, #, @, *, ! �����ϱ�
		final int NUMBER_OF_SYMBOLS = 5;		
		
		String symbols = "7#@*!";
		char new_symbol = ' ';
		int random_num = (int)(Math.random() * NUMBER_OF_SYMBOLS);
		
		new_symbol = symbols.charAt(random_num);
		
		return new_symbol;
	}
	
	
	// ���Ըӽ��� �����ϰ�, �� ����� ���� ���� ��/���� ���� ����
	// @author	:	teacher
	// @param	:	N/A
	// @return	:	N/A
	public static int run_machine() {
		
		char symbol_1 = generate_symbol();
		char symbol_2 = generate_symbol();
		char symbol_3 = generate_symbol();
		
		int machine_result = 0;
		
		System.out.println("Enter Ű�� ��������");
		pause();
		display_machine(symbol_1, symbol_2, symbol_3);
		
		// ���Ըӽ��� ��ȣ�� ���� ��� ��� & ����
		// ���κ��� ���� �и��Ѵ�.
		// 7, #, @, *, !
		
		if(symbol_1 == '7' && symbol_2 == '7' && symbol_3 == '7') {
			machine_result = PLAYER_WIN_1;	// ��� = ���ñݾ� * 50
			
		} else if(symbol_1 == '*' && symbol_2 == '*' && symbol_3 == '*') {
			machine_result = PLAYER_WIN_2;	// ��� = ���ñݾ� * 10
			
		} else if(symbol_1 == '@' && symbol_2 == '@' && symbol_3 == '@') {
			machine_result = PLAYER_WIN_3; // ��� = ���ñݾ� * 5
			
		} else if(symbol_1 == '!' && symbol_2 == '!' ||
				  symbol_1 == '!' && symbol_3 == '!' ||
				  symbol_2 == '!' && symbol_3 == '!') 
		{			
			machine_result = PLAYER_WIN_4; // ��� = ���ñݾ� * 3
			
		} else { // �÷��̾ �� ���
			machine_result = PLAYER_WIN_0;
		}
		
		return machine_result;
	}
	
	
	// ���� (����Ű �Է� ó��)
	// @author	:	teacher
	// @param	:	N/A
	// @return	:	N/A
	public static void pause() {
		try {
			System.in.read();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	// ��� ���
	// @author	:	teacher
	// @param	:	int _machine_result	: ������ �����
	//			:	int _my_money		: ���� ������
	//			:	int _bet_money		: ���� �ݾ�
	// @return	:	(int)���ŵ� ������
	public static int calculate_money(int _machine_result, int _my_money, int _bet_money) {
		
		int result_money = 0;
		
		switch(_machine_result) {
		case PLAYER_WIN_0:	// ����
			result_money = _my_money;
			break;
			
		case PLAYER_WIN_1:	// '7'����
			result_money = _my_money + (_bet_money * 50);
			break;
			
		case PLAYER_WIN_2:	// '#'����
			result_money = _my_money + (_bet_money * 10);
			break;
			
		case PLAYER_WIN_3:	// 
			result_money = _my_money + (_bet_money * 5);
			break;
			
		case PLAYER_WIN_4:
			result_money = _my_money + (_bet_money * 3);
			break;
			
		default:
			result_money = _my_money;
		}
		
		return result_money;
	}
	
	
	// 7, #, @, *, ! �����ϱ�
	
	
	// �ɺ� ���
	// @author	:	teacher
	// @param	:	char _symbol_1	: 1�� �ɺ�
	//			:	char _symbol_2	: 2�� �ɺ�
	//			:	char _symbol_3	: 3�� �ɺ�
	// @return	:	N/A
	public static void display_machine(char _symbol_1, char _symbol_2, char _symbol_3) {
		System.out.printf("%5c%5c%5c", _symbol_1, _symbol_2, _symbol_3);
	}
}










































