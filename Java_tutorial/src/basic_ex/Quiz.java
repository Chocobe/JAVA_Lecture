package basic_ex;

import java.util.Scanner;

// 6. 퀴즈의 점수를 입력하여 최대 점수와 최소 점수와 평균 점수를 구하는 프로그램을 작성하시오.
// 입력 점수 종료는 -999 가 입력하면 종료 함.

public class Quiz {
	public static void main(String[] args) {
		System.out.println("문제6] 퀴즈점수를 입력받아, 최대, 최저, 평균 구하기");
		
		Scanner scanner = new Scanner(System.in);
		
		int curr_score = 0;
		int max_score = -10000;
		int min_score = 10000;
		
		int total_score = 0;
		int total_cnt = 0;
		
		double avg_score = 0F;
		
		Main_loop : while(true) {
			System.out.println("-------------------------");
			System.out.print("점수를 입력하세요(종료 : -99) : ");
			curr_score = scanner.nextInt();
			
			if(curr_score == -99) {
				break Main_loop;
			}
			
			total_score += curr_score;
			total_cnt++;
			
			if(curr_score > max_score)	max_score = curr_score;
			if(curr_score < min_score)	min_score = curr_score;
			
			scanner.nextLine();
			
			
		} // Main_loop
		
		avg_score = (double)total_score / total_cnt;
		
		System.out.println("-------------------------");
		System.out.println("총 입력수 : " + total_cnt);
		System.out.println("최대 점수 : " + max_score);
		System.out.println("최저 점수 : " + min_score);
		System.out.printf("평균 점수 : %.2f\n", avg_score);
		System.out.println("-------------------------");
		
		scanner.close();
	} // main
}
