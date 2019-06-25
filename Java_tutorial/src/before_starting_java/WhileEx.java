package before_starting_java;

import java.util.Scanner;

public class WhileEx {
	public static void main(String[] args) {
		System.out.println("-------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		int total_sum = 0;			// 점수 총 합
		int curr_val = 0;			// 현재 점수
		int data_cnt = 0;			// 점수 등록 개수
		
		double avg_score = 0F;		// 평균 점수
		int max_score = -10000;		// 최대 점수
		int min_score = 10000;		// 최저 점수
		
		while(true) {
			System.out.print("점수를 입력하세요(종료 : -99) : ");
			curr_val = scanner.nextInt();
			
			// 종료 조건 검사
			if(curr_val == -99)
				break;
			
			// 최고 점수 갱신
			if(max_score < curr_val)
				max_score = curr_val;
			
			// 최저 점수 갱신
			if(min_score > curr_val)
				min_score = curr_val;
			
			total_sum += curr_val;
			data_cnt++;
		}
		System.out.println();
		
		avg_score = total_sum / data_cnt;
		System.out.println("최고 점수 : " + max_score);
		System.out.println("최저 점수 : " + min_score);
		System.out.println("평균 점수 : " + avg_score);
		System.out.println("-------------------------------");
			
		scanner.close();
	}
}
