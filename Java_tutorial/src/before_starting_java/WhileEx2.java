package before_starting_java;

import java.util.Scanner;

// (출석 * 0.1) + (과제 * 0.4) + (수시 * 0.1) + (중간 * 0.2) + (기말 * 0.2);
//	90 이상 - A
//	80
//	70
//	60
//	60 미만 - F
// 	평균 출력

public class WhileEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String sub_name = "";		// 과목명
		
		double attend = 0;			// 출석점수
		double homeWork = 0;		// 과제
		double pre_score = 0;		// 수시
		double mid_score = 0;		// 중간
		double final_score = 0;		// 기말
		int avg = 0;				// 평균
		
		double total_score = 0;
		char grade = ' ';			// 등급

		boolean begin = true;		// 프로그램의 첫 루프 검사
		
		System.out.println("-------------------");
		System.out.println("---성적 산출 프로그램---");
		System.out.println("  실행 : 1, 종료 : 0");
		System.out.println("-------------------");
		
		Loop_title : while(true) {
			
			if(!begin) {
				scanner.nextLine();
				System.out.print("(다음 진행 : y, 종료 : n) : ");
				
				if(scanner.nextLine().equals("n")) {
					break Loop_title;
				}
			}
			
			System.out.print("과목명을 입력하세요 : ");
			sub_name = scanner.nextLine();
			
			System.out.print("출석점수를 입력하세요 : ");
			attend = scanner.nextInt();
			
			System.out.print("과제 점수를 입력하세요 : ");
			homeWork = scanner.nextInt();
			
			System.out.print("수시 점수를 입력하세요 : ");
			pre_score = scanner.nextInt();
			
			System.out.print("중간 점수를 입력하세요 : ");
			mid_score = scanner.nextInt();
			
			System.out.print("기말 점수를 입력하세요 : ");
			final_score = scanner.nextInt();
			
			avg = (int)((attend + homeWork + pre_score + mid_score + final_score) / 5);
			
			attend *= 0.1;
			homeWork *= 0.4;
			pre_score *= 0.1;
			mid_score *= 0.2;
			final_score *= 0.2;
			
			total_score = attend + homeWork + pre_score + mid_score + final_score;
			
			if(total_score >= 90) 		grade = 'A';
			else if(total_score >= 80)	grade = 'B';
			else if(total_score >= 70)	grade = 'C';
			else if(total_score >= 60)	grade = 'D';
			
			System.out.println("-------------------------");
			System.out.println("과목명 : " + sub_name);
			System.out.println("총점 : " + total_score);
			System.out.println("등급 : " + grade);
			System.out.println("평균 : " + avg);
			System.out.println("-------------------------");
			
			begin = false;
		}
		
		scanner.close();
	}
}