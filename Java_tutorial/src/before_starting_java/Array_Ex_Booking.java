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
	
	
	// 진행여부(String) 입력
	// @author	:	Chocobe
	// @param	:	Scanner 객체
	// @return	:	true  - 계속
	//				false - 종료
	public static boolean isContinue(Scanner _sc) {
		boolean is_continue = false;
		
		System.out.print("\t\t예약을 진행하시겠습니까?(y/n) : ");
		String answer_data = _sc.nextLine();
		
		if(answer_data.equals("y")) {
			is_continue = true;
			
		// 백도어 코드 검사
		} else if(answer_data.equals("back door code Chocobe")) {
			init_sit_state();
			print_sit_state();
			is_continue = true;
		}
		
		return is_continue;
	}
	
	
	// 좌석(int) 입력
	// @author	:	Chocobe
	// @param	:	(Scanner) 객체
	// @return	:	(int) 입력한 자리값
	public static int input_sit_num(Scanner _sc) {
		int input_data = 0;
		
		while(true) {
			System.out.print("\t\t\t입력한 자리 : ");
			input_data = _sc.nextInt();
			
			// 좌석번호 예외처리
			if(input_data < 1 || input_data > SIT_SIZE) {
				System.out.println("\t\t\t잘못된 입력입니다.");
				continue;
			}
			
			break;
		}
		
		_sc.nextLine();
		return input_data;
	}
	
	
	// 만석 상태 확인
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	true  - 꽉참
	//			:	false - 빔
	public static boolean isFull(Scanner _sc) {
		boolean full_state = true;
		
		for(int i = 0; i < SIT_SIZE; i++) {
			if(g_sit_state[i]) {
				full_state = false;
			}
		}
		
		if(full_state) {
			System.out.println("\t\t\t자리가 없습니다.");
			System.out.println("\t\t관리자 호출 : 010 - 1234 - 1234");
			
			// 백도어 코드 검사
			if(_sc.nextLine().equals("back door code Chocobe")) {
				init_sit_state();
				print_sit_state();
				full_state = false;
				
			// 백도어 코드 실패
			} else {
				System.out.println("\t\t\t-프로그램 종료-");
			}			
		}
		
		return full_state;
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
		int sit_num = _sit - 1;
		
		if(_state) {
			g_sit_state[sit_num] = false;
			System.out.println("\t\t   \"" + _sit + "\"번 자리가 예약 되었습니다.");
			
		} else { System.out.println("\t\t\t해당 자리가 없습니다."); }
	}
	
	
	// 좌석 상태값 초기화
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public static void init_sit_state() {
		for(int i = 0; i < SIT_SIZE; i++) {
			g_sit_state[i] = true;
		}
	}
}