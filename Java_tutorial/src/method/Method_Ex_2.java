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
		
		printData(kor_score, math_score, total_score, avg);
		
		scanner.close();
	} // main
	
	
	// printData : 데이터 출력 메소드
	// @author	:	Chocobe
	// @param	:	int _kor	: 국어점수
	//			:	int _math	: 수학점수
	//			:	int _total	: 총합
	//			:	double _avg	: 평균
	// @return	:	N/A
	public static void printData(int _kor, int _math, int _total, double _avg) {
		System.out.println("---------------------------");
		System.out.println("국어 : " + _kor);
		System.out.println("수학 : " + _math);
		System.out.println("총합 : " + _total);
		System.out.println("평균 : " + _avg);
		System.out.println("---------------------------");
	}
	
	
	// inputScore : 점수입력 메소드
	// @author	:	Chocobe
	// @param	:	Scanner _sc	: Scanner 객체
	//			:	String _sub	: 과목명
	// @return	:	(int)입력한 점수
	public static int inputScore(Scanner _sc, String _sub) {
		System.out.print(_sub + " 점수를 입력하세요 : ");
		int score = _sc.nextInt();
		
		return score;
	}
	
	
	// outputSum : 두 수의 합을 구하는 메소드
	// @author	:	Chocobe
	// @param	:	int _totalScore	: 총합
	//	 		:	int _curScore	: 현재 점수
	// @return	:	(int) 두 인자의 합
	public static int outputSum(int _totalScore, int _curScore) {
		int sum = _totalScore + _curScore;
		
		return sum;
	}
	
	
	// outputAvg : 평균을 구하는 메소드
	// @author	:	Chocobe
	// @param	:	int _totalScore : 점수 총 합
	// @return	:	(double)2과목의 평균값
	public static double outputAvg(int _totalScore) {
		double avg = (double)_totalScore / 2;
		
		return avg;
	}
}
