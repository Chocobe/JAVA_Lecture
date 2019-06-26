package basic_ex;

import java.util.Scanner;

//	12. 학생들의 점수를 입력하여 최종 점수에 따라 A은 90-100, B은 80-89, C은 70-79 그이외 점수는 D로 준다.
//	출력
//	점수(종료는 -999입력) 입력 : 90
//	점수(종료는 -999입력) 입력 : 86
//	점수(종료는 -999입력) 입력 : 96
//	점수(종료는 -999입력) 입력 : 89
//	점수(종료는 -999입력) 입력 : 75
//	점수(종료는 -999입력) 입력 : 72
//	점수(종료는 -999입력) 입력 : 87
//	점수(종료는 -999입력) 입력 : 96
//	점수(종료는 -999입력) 입력 : -99
//	
//	A : 3
//	B : 3
//	C : 2

public class Grade {
	
	final static int EXIT = -999;
	final static int MIN_A_GRADE = 90;
	final static int MIN_B_GRADE = 80;
	final static int MIN_C_GRADE = 70;
	
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		
		int cur_score = 0;		// 현재 점수
		int cur_grade = 0;		// 현재 등급
		
		int a_grade_cnt = 0;	// A등급 수
		int b_grade_cnt = 0;	// B등급 수
		int c_grade_cnt = 0;	// C등급 수
		
		Main_loop : while(true) {
			// 입력
			cur_score = inputScore(scanner);
			
			// 종료 검사
			if(isFinish(cur_score)) {
				break Main_loop;
			}
			
			// 등급 결정
			cur_grade = makeGrade(cur_score);
			
			// 등급 카운팅
			switch(cur_grade) {
			case MIN_A_GRADE :
				a_grade_cnt++;
				break;
				
			case MIN_B_GRADE :
				b_grade_cnt++;
				break;
				
			case MIN_C_GRADE :
				c_grade_cnt++;
				break;
			} // switch(cur_grade)
		} // Main_loop
		
		System.out.println();
		System.out.println("A : " + a_grade_cnt);
		System.out.println("B : " + b_grade_cnt);
		System.out.println("C : " + c_grade_cnt);
		
		scanner.close();
	}
	
	
	// inputScore : 점수 입력 메소드
	// @aouthor : Chocobe
	// @param (Scanner _sc)	: Scanner 클래스 객체
	// @return	: (int)입력값
	public static int inputScore(Scanner _sc) {
		System.out.print("점수(종료는 -999입력) : ");
		int score = _sc.nextInt();
		
		return score;
	}
	
	
	// isFinish : 종료검사 메소드
	// @Author : Chocobe
	// @param (int _score) : 현재 점수
	// @return : (boolean)종료 - true, 계속 - false
	public static boolean isFinish(int _score) {
		boolean continuity = false;
		
		if(_score == EXIT) {
			continuity = true;
		}
		
		return continuity;
	}
	
	
	// makeGrade : 등급 결정 메소드
	// @Author : Chocobe
	// @param (int _score) : 현재 점수
	// @return : (int)등급별 최소값
	public static int makeGrade(int _score) {
		int grade_val = 0;
		
		// A등급
		if(_score >= MIN_A_GRADE) {
			grade_val = MIN_A_GRADE;
			
		// B등급
		} else if(_score >= MIN_B_GRADE) {
			grade_val = MIN_B_GRADE;
			
		// C등급
		} else {
			grade_val = MIN_C_GRADE;
		}
		
		return grade_val;
	}
}
