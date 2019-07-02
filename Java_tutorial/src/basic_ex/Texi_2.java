package basic_ex;

import java.util.Scanner;

//	8. 택시 운전사가 "자바"라는 손님을 태우고 목적지까지 데려다 주면  영업을 중단하고 그 날 수입을 계산하는 프로그램을 작성 
//	하시오. 각 손님의 이름과 요금을 읽어 손님들이 요금을 낸 요금의  합을 구한다
//	출력
//	손님의 이름을 입력 : QQQQ
//	요금 :  7000
//	손님의 이름을 입력 : WWWW
//	요금 :  5000
//	손님의 이름을 입력 : 자바
//	요금 : 10000
//	
//	총합은 22000원이다

public class Texi_2 {
	public static void main(String[] args) {
		System.out.println("문제8] \"자바\"라는 손님을 태울때 까지 영업하여, 총 수익금 출력하기");
		
		Scanner scanner = new Scanner(System.in);
		
		String curr_name = "";
		int curr_charge = 0;
		
		int total_profit = 0;
		int total_cnt = 0;
		
		Main_loop : while(true) {
			System.out.println("----------------------------------");
			
			System.out.print("손님이름 : ");
			curr_name = scanner.nextLine();
			
			System.out.print("요금 : " );
			curr_charge = scanner.nextInt();
			scanner.nextLine();
			
			total_profit += curr_charge;
			total_cnt++;
			
			if(curr_name.equals("자바")) {
				break Main_loop;
			}
		} // Main_loop
		
		System.out.println("----------------------------------");
		System.out.println("총 수익금 (총 " + total_cnt + "명) : " + total_profit);
		
		scanner.close();		
	} // main
}
