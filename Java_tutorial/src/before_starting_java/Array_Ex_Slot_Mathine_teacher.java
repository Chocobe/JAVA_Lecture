package before_starting_java;

import java.util.Scanner;

public class Array_Ex_Slot_Mathine_teacher {	
	
	public static final int DEFAULT_MONEY = 1000;
	
	public static void main(String[] args) {
		
		run_game();
	}
	
	
	// 게임 엔진
	public static void run_game() {
		
		Scanner sc = new Scanner(System.in);
		
		int current_money = DEFAULT_MONEY;
		int bet_money = 0;
		
		do {
			System.out.printf("현재 갖고 있는 돈 : %d\n", current_money);
			bet_money = betting(current_money, sc);
			System.out.printf("배팅한 돈 : %d\n", bet_money);
			current_money -= bet_money;
			
		} while(current_money > 0);
		
		sc.close();
	}
	
	
	// 배팅 금액 입력
	// @param	:	int _current_money	: 현재 보유 금액
	//			:	Scanner _sc	:	Scanner 객체
	// @return	:	(int) 사용자가 베팅한 돈
	public static int betting(int _current_money, Scanner _sc) {
		
		int bet_money = 0;
		boolean flag = false;
		do {
			System.out.print("베팅할 돈을 입력하세요.(종료하시려면 0을 입력하세요) : ");
			bet_money = _sc.nextInt();
			
			if(bet_money > _current_money) {
				System.out.println("갖고 있는 돈이 부족합니다.");
				flag = true;			
				
			} else if(bet_money < 0) {
				System.out.println("베팅할 돈은 0보다 커야 합니다.");
				flag = true;
				
			} else if(bet_money == 0) {
				System.out.println("게임 종료");
				System.exit(0);
				
			} else { flag = false; }
		} while(!flag);
		
		return bet_money;
	}
}










































