package basic_ex;

import java.util.Scanner;

//	7. 택시 운전사가 10명을 태우면 그 날 영업을 중단하고 그날의 수입을 계산하는 프로그램을 작성하시오.
//	수입은 손님이 낸 요금을 읽어 들여 합을 구한다.

public class Texi_1 {
	public static void main(String[] args) {
		System.out.println("문제7] 택시 손님 10명에 대한 수입 계산하기");
		Scanner scanner = new Scanner(System.in);
		
		int MAX_NUM = 10;

		int curr_charge = 0;
		int total_profit = 0;
		
		for(int i = 0; i < MAX_NUM; i++) {
			System.out.println("----------------------------");
			System.out.print("요금을 입력하세요(현재건수 : " + i + ") : ");
			curr_charge = scanner.nextInt();
			
			total_profit += curr_charge;
		}
		
		System.out.println("----------------------------");
		System.out.println("총 수익금 : " + total_profit);
		
		scanner.close();
	} // main
}
