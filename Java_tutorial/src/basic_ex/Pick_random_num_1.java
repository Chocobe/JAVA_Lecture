package basic_ex;

import java.util.Random;
import java.util.Scanner;

//	9. 난수를 이용하여 1부터 10 사이의 숫자를 생성하여 숫자를 맞추는 프로그램을 작성하시오
//	추측 숫자를 입력 : 5
//	추축한 숫자가 틀렸습니다
//	추축한 숫자가 너무 큽니다
//	추측 숫자를 입력 : 3
//	추축한 숫자가 틀렸습니다
//	추축한 숫자가 너무 작습니다
//	추측 숫자를 입력 : 4
//	추축한 숫자가 맞습니다

public class Pick_random_num_1 {
	public static void main(String[] args) {
		System.out.println("문제9] 1부터 10까지의 난수 맞추기");
		System.out.println("-----------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		Random random_obj = new Random(System.currentTimeMillis());
		
		int input_num = 0;
		int random_num = 0;
		int try_cnt = 0;
		
		Main_loop : while(true) {
			System.out.println("-----------------------------------");
			
			try_cnt++;
			System.out.print("1~10 사이의 정수를 입력하세요 (시도회차 : " + try_cnt + ") : ");
			input_num = scanner.nextInt();
			random_num = random_obj.nextInt(10) + 1;
			
			if(input_num > random_num) {
				System.out.println("추측이 틀렸습니다 - 입력값이 큽니다.");
				
			} else if(input_num < random_num) {
				System.out.println("추측이 틀렸습니다. - 입력값이 큽니다.");
				
			} else {
				System.out.println("정답입니다.");
				System.out.println("총 시도 횟수 : " + try_cnt);
				
				break Main_loop;
			}
						
		} // Main_loop
		
		
		scanner.close();
	}
}
