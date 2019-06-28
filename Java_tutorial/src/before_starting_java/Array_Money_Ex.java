package before_starting_java;

import java.util.Scanner;

// 배열 예제 5
// 입력한 금액을 50000원, 10000원, 5000원, 1000원, 500원, 100원, 50원, 1원 으로 환산 출력하기

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
	
	
	// 인트로 메소드
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public static void print_intro() {
		System.out.print("계산할 금액을 입력하세요 : ");
	}
	
	
	// 엔딩 메소드
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public static void print_ending() {
		System.out.println("----------------종료합니다----------------");
	}
	
	
	// 종료 메소드
	// @author	:	Chocobe
	// @param	:	Scanner _sc	: Scanner 객체
	// @return	:	true	: 종료
	//			:	false	: 계속
	public static boolean isEXIT(Scanner _sc) {
		String answer = "";
		boolean return_answer = false;		
		
		System.out.println("\n");
		System.out.print("종료하시겠습니까?(y/n) : ");
		
		_sc.nextLine();
		answer = _sc.nextLine();
		
		if(answer.equals("y")) {
			return_answer = true;
			
		} else {
			return_answer = false;
		}
		
		return return_answer;
	}
	
	
	// 숫자 입력 메소드
	// @author	:	Chocobe
	// @param	:	Scanner _sc	: Scanner 객체
	// @return	:	(int)입력된 금액
	public static int input_money(Scanner _sc) {
		return _sc.nextInt();
	}
	
	
	// 각 화폐단위로 환산하는 메소드
	// @author	:	Chocobe
	// @param	:	int _money	: 계산할 금액
	// @return	:	(int[])화폐별 환산된 개수
	public static int[] exchange_unit(int _money) {
		int cur_money = _money;
		int[] temp_unit = new int[MONEY_UNIT_LEN];
		
		for(int i = 0; i < MONEY_UNIT_LEN; i++) {
			temp_unit[i] = cur_money / money_unit[i];
			cur_money = cur_money - (temp_unit[i] * money_unit[i]);
		}
		
		return temp_unit;
	}
	
	
	// 환산된 결과 출력 메소드
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public static void print_unit_cnt() {
		System.out.println();
		
		for(int i = 0; i < PAPER_MONEY; i++) {
			System.out.printf("%7d원    : %2d 장\t", money_unit[i], money_unit_cnt[i]);
		}
		
		System.out.println();
		
		for(int i = PAPER_MONEY; i < MONEY_UNIT_LEN; i++) {
			System.out.printf("%7d원    : %2d 개\t", money_unit[i], money_unit_cnt[i]);
		}
	}
	
	
	// 라인 출력
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public static void print_line() {
		System.out.println("----------------------------------------");
	}
}
