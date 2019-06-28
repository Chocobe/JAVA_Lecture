package before_starting_java;

import java.util.Scanner;

// 배열 예제 6
// 좌석 예약 프로그램 만들기

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
			scanner.nextLine();	// 버퍼 비우기
			
			ordered_sit_state = isEmpty(ordered_num);
			
			update_sit(ordered_num, ordered_sit_state);
		} // Mail_loop
		
		scanner.close();
	}
	
	
	// 라인 출력
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public static void print_line() {
		System.out.println("----------------------------------------------------------");
	}
	
	
	// 좌석 상태 출력
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
	
	
	// 만석 상태 확인
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	true  - 꽉참
	//			:	false - 빔
	public static boolean isFull() {
		boolean full_state = true;
		
		for(int i = 0; i < SIT_SIZE; i++) {
			if(g_sit_state[i]) {
				full_state = false;
			}
		}
		
		if(full_state) {
			System.out.println("\t\t\t자리가 없습니다.");
			System.out.println("\t\t\t-프로그램 종료-");
		}
		
		return full_state;
	}
	
	
	// 진행여부(String) 입력
	// @author	:	Chocobe
	// @param	:	Scanner 객체
	// @return	:	true  - 계속
	//				false - 종료
	public static boolean isContinue(Scanner _sc) {
		boolean answer = false;
		
		System.out.print("\t\t예약을 진행하시겠습니까?(y/n) : ");
		
		if(_sc.nextLine().equals("y")) {
			answer = true;
		}
		
		return answer;
	}
	
	
	// 좌석(int) 입력
	// @author	:	Chocobe
	// @param	:	(Scanner) 객체
	// @return	:	(int) 입력한 자리값
	public static int input_sit_num(Scanner _sc) {
		System.out.print("\t\t\t입력한 자리 : ");
		int input_data = _sc.nextInt();
		return input_data;
	}
	
	
	// 유효값 검사
	// @author	:	Chocobe
	// @param	:	(int) 입력된 자리값
	// @return	:	true  - 예약가능
	//				false - 예약불가
	public static boolean isEmpty(int _sit) {
		boolean result_state = false;
		
		if(g_sit_state[_sit - 1]) { result_state = true; }
		
		return result_state;
	}
	
	
	// 좌석 데이터 갱신
	// @author	:	Chocobe
	// @param	:	(int) 입력된 자리값
	//			:	(boolean) 예약 가능 여부
	// @return	:	N/A
	public static void update_sit(int _sit, boolean _state) {
		if(_state) {
			g_sit_state[_sit - 1] = false;
			System.out.println("\t\t\t예약 되었습니다.");
			
		} else { System.out.println("\t\t\t해당 자리가 없습니다."); }
	}
}