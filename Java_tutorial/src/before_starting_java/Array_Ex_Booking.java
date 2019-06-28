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
		
		Main_loop : while(true) {
			print_sit_state();
			
			if(isFull()) { break Main_loop; }
	
			if(!isContinue(scanner)) break Main_loop;
			
			ordered_num = input_sit_num(scanner);
			scanner.nextLine();	// ���� ����
			
			ordered_sit_state = isEmpty(ordered_num);
			
			update_sit(ordered_num, ordered_sit_state);
		} // Mail_loop
		
		scanner.close();
	}
	
	
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
	
	
	// ���� ���� Ȯ��
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	true  - ����
	//			:	false - ��
	public static boolean isFull() {
		boolean full_state = true;
		
		for(int i = 0; i < SIT_SIZE; i++) {
			if(g_sit_state[i]) {
				full_state = false;
			}
		}
		
		if(full_state) {
			System.out.println("\t\t\t�ڸ��� �����ϴ�.");
			System.out.println("\t\t\t-���α׷� ����-");
		}
		
		return full_state;
	}
	
	
	// ���࿩��(String) �Է�
	// @author	:	Chocobe
	// @param	:	Scanner ��ü
	// @return	:	true  - ���
	//				false - ����
	public static boolean isContinue(Scanner _sc) {
		boolean answer = false;
		
		System.out.print("\t\t������ �����Ͻðڽ��ϱ�?(y/n) : ");
		
		if(_sc.nextLine().equals("y")) {
			answer = true;
		}
		
		return answer;
	}
	
	
	// �¼�(int) �Է�
	// @author	:	Chocobe
	// @param	:	(Scanner) ��ü
	// @return	:	(int) �Է��� �ڸ���
	public static int input_sit_num(Scanner _sc) {
		System.out.print("\t\t\t�Է��� �ڸ� : ");
		int input_data = _sc.nextInt();
		return input_data;
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
		if(_state) {
			g_sit_state[_sit - 1] = false;
			System.out.println("\t\t\t���� �Ǿ����ϴ�.");
			
		} else { System.out.println("\t\t\t�ش� �ڸ��� �����ϴ�."); }
	}
}