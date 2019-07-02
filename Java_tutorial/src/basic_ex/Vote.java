package basic_ex;

import java.util.Scanner;

//	11. 시장에 입후보 2명이 각 구에 각 후보가 얻은 득표 수를 입력 받아 각 후보의 총 득표수와 득표율을 출력하고 덩선자를
//	출력하는 출력한다. 프로그램은 먼저 보고  할 구가 있으면 "yes"을 입력하고,없으면 "no"을 입력한다
//	보고할 구가 있는지를 물어보고 같은 과정을 반복한다.
//	
//	결과
//	보고  할 구가 있으면 "yes"을 입력하고,없으면 "no"을 입력 : yes
//	첫번째 후보 득표 수 입력 : 35382
//	두번째 후보 득표 수 입력 : 53287
//	
//	보고  할 구가 있으면 "yes"을 입력하고,없으면 "no"을 입력 : yes
//	첫번째 후보 득표 수 입력 : 39019
//	두번째 후보 득표 수 입력 : 29040
//	
//	보고  할 구가 있으면 "yes"을 입력하고,없으면 "no"을 입력 : yes
//	첫번째 후보 득표 수 입력 : 78569
//	두번째 후보 득표 수 입력 : 95209
//	
//	보고  할 구가 있으면 "yes"을 입력하고,없으면 "no"을 입력 : no
//	
//	첫번째 후보가 얻는 총득표수 152970이고 득표율은 46.3%이다
//	두번째 후보가 얻는 총득표수 177536이고 득표율은 53.7%이다
//	
//	두번째 후보가 당선 됨

public class Vote {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int first_vote = 0;
		int second_vote = 0;
		int total_vote = 0;
		
		double first_rate = 0F;
		double second_rate = 0F;
		
		String continue_answer = "";
		
		Main_loop : while(true) {
			while(true) {
				System.out.print("보고  할 구가 있으면 \"yes\"을 입력하고,없으면 \"no\"을 입력 : ");
				continue_answer = scanner.nextLine();
				
				
				if(continue_answer.equals("yes")) {
					break;
					
				} else if(continue_answer.equals("no")) {
					break Main_loop;
					
				} else {
					System.out.println("잘못된 입력입니다.");
				}
			} // while(true)
			
			System.out.print("첫번째 후보 득표 수 입력 : ");
			first_vote += scanner.nextInt();
			
			System.out.print("두번째 후보 득표 수 입력 : ");
			second_vote += scanner.nextInt();
			
			scanner.nextLine();			
		} // Main_loop
		
		total_vote = first_vote + second_vote;
		first_rate = ((double)first_vote / total_vote) * 100;
		second_rate = ((double)second_vote / total_vote) * 100;
		
		System.out.println("---------------------------------");
		System.out.printf("첫번째 후보가 얻는 총득표수 %d이고 득표율은 %.1f%%이다\n", first_vote, first_rate);
		System.out.printf("두번째 후보가 얻는 총듣표수 %d이고 득표율은 %.1f%%이다\n", second_vote, second_rate);
		
		scanner.close();
	} // main
}
