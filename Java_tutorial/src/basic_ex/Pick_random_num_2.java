package basic_ex;

import java.util.Random;
import java.util.Scanner;

//	10.  숫자 1에서 100 사의 임의의 선택한다. 1과 100도 선택될 수  있다. 추축한 숫자를 맞출때까지 계속하고, 맞출 때까지 
//	횟수를 세고, 맞고 난 후 횟수를 출력하시오. 게임이 끝난 후에 맞추기 게임을 계속하기를 원하는지 알아보라.

public class Pick_random_num_2 {
	public static void main(String[] args) {
		System.out.println("문제10] 1부터 100까지의 랜덤 숫자 맞추기");
		
		Scanner scanner = new Scanner(System.in);
		Random random_obj = new Random(System.currentTimeMillis());
		
		final int MIN_NUM = 1;
		final int MAX_NUM = 100;
		
		int input_num = 0;
		int random_num = 0;
		int try_cnt = 0;
		
		String continue_answer = "";
		
		Main_loop : while(true) {
			System.out.println("----------------------------------");
			try_cnt++;
			
			System.out.print("정수를 입력하세요 (시도회차 : " + try_cnt + ") : ");
			input_num = scanner.nextInt();
			random_num = random_obj.nextInt(MAX_NUM) + MIN_NUM;
			
			if(input_num > random_num) {
				System.out.println("틀렸습니다. 입력값이 큽니다.");
				continue;
				
			} else if(input_num < random_num) {
				System.out.println("틀렸습니다. 작습니다.");
				continue;
				
			} else {
				System.out.println("정답입니다. (시도횟수 : " + try_cnt + ")");
			}
			
			scanner.nextLine();
			System.out.println();
			
			while(true) {
				System.out.print("더 하시겠습니까? (y/n) : ");
				continue_answer = scanner.nextLine();
				
				if(continue_answer.equals("y")) {
					break;
					
				} else if(continue_answer.equals("n")) {
					break Main_loop;
					
				} else {
					System.out.println("잘못 입력했습니다.");
				}				
			} // while(true)			
		} // Main_loop
		
		scanner.close();
	} // main
}
