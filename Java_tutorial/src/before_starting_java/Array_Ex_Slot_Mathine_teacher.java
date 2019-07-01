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
	
	
	// 게임 엔진
	// @author	:	teacher
	// @param	:	N/A
	// @return	:	N/A
	public static void run_game() {
		
		Scanner sc = new Scanner(System.in);
		
		int current_money = DEFAULT_MONEY;
		int bet_money = 0;
		
		run_machine();
		
		do {
			System.out.printf("현재 갖고 있는 돈 : %d\n", current_money);
			bet_money = betting(current_money, sc);
			System.out.printf("배팅한 돈 : %d\n", bet_money);
			run_machine();
			current_money -= bet_money;
			
		} while(current_money > 0);
		
		sc.close();
	}
	
	
	// 배팅 금액 입력
	// @author	:	teacher
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
				
			} else if(bet_money < 0) {
				System.out.println("베팅할 돈은 0보다 커야 합니다.");
				
			} else if(bet_money == 0) {
				System.out.println("게임 종료");
				System.exit(0);
				
			} else { flag = true; }
		} while(!flag);
		
		return bet_money;
	}
	
	
	// 난수를 생성하여, 해당 기호를 반환
	// @author	:	teacher
	// @param	:	N/A
	// @return	:	(char) 슬롯 기호
	public static char generate_symbol() {
		// 7, #, @, *, ! 생성하기
		final int NUMBER_OF_SYMBOLS = 5;		
		
		String symbols = "7#@*!";
		char new_symbol = ' ';
		int random_num = (int)(Math.random() * NUMBER_OF_SYMBOLS);
		
		new_symbol = symbols.charAt(random_num);
		
		return new_symbol;
	}
	
	
	// 슬롯머신을 실행하고, 그 결과에 따라 얻은 돈/잃은 돈을 리턴
	// @author	:	teacher
	// @param	:	N/A
	// @return	:	N/A
	public static int run_machine() {
		
		char symbol_1 = generate_symbol();
		char symbol_2 = generate_symbol();
		char symbol_3 = generate_symbol();
		
		int machine_result = 0;
		
		System.out.println("Enter 키를 누르세요");
		pause();
		display_machine(symbol_1, symbol_2, symbol_3);
		
		// 슬롯머신의 기호에 따라 결과 출력 & 갱신
		// 계산부분은 따로 분리한다.
		// 7, #, @, *, !
		
		if(symbol_1 == '7' && symbol_2 == '7' && symbol_3 == '7') {
			machine_result = PLAYER_WIN_1;	// 계산 = 배팅금액 * 50
			
		} else if(symbol_1 == '*' && symbol_2 == '*' && symbol_3 == '*') {
			machine_result = PLAYER_WIN_2;	// 계산 = 배팅금액 * 10
			
		} else if(symbol_1 == '@' && symbol_2 == '@' && symbol_3 == '@') {
			machine_result = PLAYER_WIN_3; // 계산 = 배팅금액 * 5
			
		} else if(symbol_1 == '!' && symbol_2 == '!' ||
				  symbol_1 == '!' && symbol_3 == '!' ||
				  symbol_2 == '!' && symbol_3 == '!') 
		{			
			machine_result = PLAYER_WIN_4; // 계산 = 배팅금액 * 3
			
		} else { // 플래이어가 진 경우
			machine_result = PLAYER_WIN_0;
		}
		
		return machine_result;
	}
	
	
	// 정지 (엔터키 입력 처리)
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
	
	
	// 결과 계산
	// @author	:	teacher
	// @param	:	int _machine_result	: 슬롯의 결과값
	//			:	int _my_money		: 현재 보유금
	//			:	int _bet_money		: 배팅 금액
	// @return	:	(int)갱신된 보유금
	public static int calculate_money(int _machine_result, int _my_money, int _bet_money) {
		
		int result_money = 0;
		
		switch(_machine_result) {
		case PLAYER_WIN_0:	// 실패
			result_money = _my_money;
			break;
			
		case PLAYER_WIN_1:	// '7'성공
			result_money = _my_money + (_bet_money * 50);
			break;
			
		case PLAYER_WIN_2:	// '#'성공
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
	
	
	// 7, #, @, *, ! 생성하기
	
	
	// 심볼 출력
	// @author	:	teacher
	// @param	:	char _symbol_1	: 1번 심볼
	//			:	char _symbol_2	: 2번 심볼
	//			:	char _symbol_3	: 3번 심볼
	// @return	:	N/A
	public static void display_machine(char _symbol_1, char _symbol_2, char _symbol_3) {
		System.out.printf("%5c%5c%5c", _symbol_1, _symbol_2, _symbol_3);
	}
}










































