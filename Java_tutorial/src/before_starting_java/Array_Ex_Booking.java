package before_starting_java;

import java.util.Scanner;

// �迭 ���� 6
// �¼� ���� ���α׷� �����

public class Array_Ex_Booking {
	
	public static final int SIT_SIZE = 10;
	public static boolean[] g_sit_state = new boolean[SIT_SIZE];
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int ordered_num = 0;
		boolean ordered_sit_state = false;

		init_sit_state();
		
		Main_loop : while(true) {
			print_sit_state();
			
			if(isFull(scanner)) { break Main_loop; }
	
			if(!isContinue(scanner)) break Main_loop;
			
			ordered_num = input_sit_num(scanner);
			
			ordered_sit_state = isEmpty(ordered_num);
			
			update_sit(ordered_num, ordered_sit_state);
		} // Mail_loop
		
		scanner.close();
	} // main
	
	
	// ���� ���
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public static void print_line() {
		System.out.println("----------------------------------------------------------");
	}
	
	
	// �¼� ���� ���
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public static void print_sit_state() {
		print_line();
		
		for(int i = 0; i < SIT_SIZE - 1; i++) {
			System.out.printf("%3d  |", (i + 1));
		}
		System.out.printf("%3d\n", SIT_SIZE);
		
		print_line();
		
		for(int i = 0; i < SIT_SIZE - 1; i++) {
			if(g_sit_state[i]) { System.out.print("  O  |"); } 
			else { System.out.print("  X  |"); }
		}
		
		if(g_sit_state[SIT_SIZE - 1]) { System.out.print("  O  "); } 
		else { System.out.print("  X  "); }
		
		System.out.println();	
		
		print_line();
	}
	
	
	// ���࿩��(String) �Է�
	// @author	:	Chocobe
	// @param	:	Scanner ��ü
	// @return	:	true  - ���
	//				false - ����
	public static boolean isContinue(Scanner _sc) {
		boolean is_continue = false;
		
		System.out.print("\t\t������ �����Ͻðڽ��ϱ�?(y/n) : ");
		String answer_data = _sc.nextLine();
		
		if(answer_data.equals("y")) {
			is_continue = true;
			
		// �鵵�� �ڵ� �˻�
		} else if(answer_data.equals("back door code Chocobe")) {
			init_sit_state();
			print_sit_state();
			is_continue = true;
		}
		
		return is_continue;
	}
	
	
	// �¼�(int) �Է�
	// @author	:	Chocobe
	// @param	:	(Scanner) ��ü
	// @return	:	(int) �Է��� �ڸ���
	public static int input_sit_num(Scanner _sc) {
		int input_data = 0;
		
		while(true) {
			System.out.print("\t\t\t�Է��� �ڸ� : ");
			input_data = _sc.nextInt();
			
			// �¼���ȣ ����ó��
			if(input_data < 1 || input_data > SIT_SIZE) {
				System.out.println("\t\t\t�߸��� �Է��Դϴ�.");
				continue;
			}
			
			break;
		}
		
		_sc.nextLine();
		return input_data;
	}
	
	
	// ���� ���� Ȯ��
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	true  - ����
	//			:	false - ��
	public static boolean isFull(Scanner _sc) {
		boolean full_state = true;
		
		for(int i = 0; i < SIT_SIZE; i++) {
			if(g_sit_state[i]) {
				full_state = false;
			}
		}
		
		if(full_state) {
			System.out.println("\t\t\t�ڸ��� �����ϴ�.");
			System.out.println("\t\t������ ȣ�� : 010 - 1234 - 1234");
			
			// �鵵�� �ڵ� �˻�
			if(_sc.nextLine().equals("back door code Chocobe")) {
				init_sit_state();
				print_sit_state();
				full_state = false;
				
			// �鵵�� �ڵ� ����
			} else {
				System.out.println("\t\t\t-���α׷� ����-");
			}			
		}
		
		return full_state;
	}
	
	
	// ��ȿ�� �˻�
	// @author	:	Chocobe
	// @param	:	(int) �Էµ� �ڸ���
	// @return	:	true  - ���డ��
	//				false - ����Ұ�
	public static boolean isEmpty(int _sit) {
		boolean result_state = false;
		
		if(g_sit_state[_sit - 1]) { result_state = true; }
		
		return result_state;
	}
	
	
	// �¼� ������ ����
	// @author	:	Chocobe
	// @param	:	(int) �Էµ� �ڸ���
	//			:	(boolean) ���� ���� ����
	// @return	:	N/A
	public static void update_sit(int _sit, boolean _state) {
		int sit_num = _sit - 1;
		
		if(_state) {
			g_sit_state[sit_num] = false;
			System.out.println("\t\t   \"" + _sit + "\"�� �ڸ��� ���� �Ǿ����ϴ�.");
			
		} else { System.out.println("\t\t\t�ش� �ڸ��� �����ϴ�."); }
	}
	
	
	// �¼� ���°� �ʱ�ȭ
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public static void init_sit_state() {
		for(int i = 0; i < SIT_SIZE; i++) {
			g_sit_state[i] = true;
		}
	}
}