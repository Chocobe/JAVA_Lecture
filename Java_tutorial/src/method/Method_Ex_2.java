package method;

import java.util.Scanner;

// 두 과목의 점수를 입력 받아 합계, 평균을 구하시오
// 메소드 : 
// 		입력 메소드
// 		처리 메소드 : 합계, 평균
//		출력 메소드

public class Method_Ex_2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int kor_score = 0;
		int math_score = 0;
		int total_score = 0;
		
		double avg = 0F;
			
		kor_score = inputScore(scanner, "국어");
		total_score = outputSum(total_score, kor_score);
		math_score = inputScore(scanner, "수학");
		total_score = outputSum(total_score, math_score);
		avg = outputAvg(total_score);
		
		System.out.println("---------------------------");
		System.out.println("국어 : " + kor_score);
		System.out.println("수학 : " + math_score);
		System.out.println("총합 : " + total_score);
		System.out.println("평균 : " + avg);
		System.out.println("---------------------------");
		
		scanner.close();
	}
	
	
	public static int inputScore(Scanner _sc, String _sub) {
		System.out.print(_sub + " 점수를 입력하세요 : ");
		int score = _sc.nextInt();
		
		return score;
	}
	
	
	public static int outputSum(int _totalScore, int _curScore) {
		int sum = _totalScore + _curScore;
		
		return sum;
	}
	
	
	public static double outputAvg(int _totalScore) {
		double avg = (double)_totalScore / 2;
		
		return avg;
	}
}
