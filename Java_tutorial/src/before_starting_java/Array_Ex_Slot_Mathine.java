package before_starting_java;

import java.util.Scanner;

public class Array_Ex_Slot_Mathine {
	
	public static final int CAN = 1;
	public static final int CANNOT = 0;
	public static final int STOP = -1;
	
	public static int g_my_money = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		// 1. 초기화
		init_my_money();
		
		run_game();
		
		scanner.close();
	}
	
	
	// 0. 게임 엔진
	public static void run_game() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			boolean proper_money = false;
			int batting_money = 0;
			
			// 2. 보유금 출력
			print_my_money();
			
			// 3. 배팅 입력
			batting_money = insert_coin(scanner);
			
			// 4. 종료 검사
			if(batting_money == 0) {
				break;	
			}
			
			// 5. 보유금 증감
			if(isRightToBatting(batting_money)) {
				update_my_money(batting_money, '-');
			}
			
			
			System.out.println("--------------------");
						
		}
		
		scanner.close();
	}
	
	
	// 1. 초기화
	// TESTed
	public static void init_my_money() {
		g_my_money = 1000;
	}
	
	
	// 2. 보유금 출력
	// TESTed
	public static void print_my_money() {
		System.out.println("현재 보유금 : " + g_my_money);
	}
	
	
	// 3. 배팅 입력
	// TESTed
	public static int insert_coin(Scanner _sc) {		
		System.out.print("배팅 금액을 입력하세요 : ");
		return _sc.nextInt();
	}
	
	
	// 4. 배팅 유효 검사
	// TESTed
	// 		1 : 유효
	// 		2 : 불가
	//		-1 : 종료
	public static boolean isRightToBatting(int _batting) {
		boolean isRightToBatting = false;
		
		if(_batting > g_my_money) {
			System.out.println("보유금이 부족합니다.");
			print_my_money();
			
		} else if(_batting < 0) {
			System.out.println("보유금은 0보다 커야 합니다.");
			
		} else {
			isRightToBatting = true;
		}
		
		return isRightToBatting;
	}
	
	
	// 5. 보유금 증감
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
