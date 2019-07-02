package basic_ex;

import java.util.Scanner;

//	3. 할인마트의 모든 상품의 가격은 500이하다. 물건 한개를 사면 500원을 낼 때 거스름돈을 계산하는 프로그램을 작성하시오.
//	출력
//	구매금액을 입력하시오(0-500) : 122
//	378원의 거스름 돈은 다음과 같다
//	100원 동전 : 3개
//	10원 동전 :  7개
//	1원 동전  :  8개

public class Coin {
	public static void main(String[] args) {
		System.out.println("문제3] 거스름돈 구하기");
		
		Scanner scanner = new Scanner(System.in);
		
		final int MY_MONEY = 500;
		
		int coin_1 = 0;
		int coin_10 = 0;
		int coin_100 = 0;
		
		int price = 0;

		String user_answer = "";
		
		Main_loop : while(true) {
			
			System.out.print("물건값을 입력하세요(500원 이하) : ");			
			price = scanner.nextInt();

			int remain_money = MY_MONEY - price;
			
			coin_100 = remain_money / 100;
			remain_money %= 100;
			
			coin_10 = remain_money / 10;
			coin_1 = remain_money % 10;
			
			System.out.println("100원 동전 : " + coin_100);
			System.out.println("10원 동전 : " + coin_10);
			System.out.println("1원 동전 : " + coin_1);
			
			scanner.nextLine();
			
			while(true) {				
				System.out.print("계속 진행 하시겠습니까? (y/n) : ");
				user_answer = scanner.nextLine();
				
				if(user_answer.equals("y")) {
					break;
					
				} else if(user_answer.equals("n")) {
					break Main_loop;
					
				} else {
					System.out.println("Error] 잘못 입력했습니다.");
				}
			}// while(true) - EXIT
			
			System.out.println("---------------------------");
		}// Main_loop : while - EXIT
		
		scanner.close();
	}// main - EXIT
}
