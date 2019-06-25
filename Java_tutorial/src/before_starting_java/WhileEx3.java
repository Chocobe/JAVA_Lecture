package before_starting_java;

import java.util.Scanner;

// 입력 :
//		점수
//		(입력한 점수 개수가 학생수가 된다)
//
//		합격 - 60점 이상
//		낙제 - 60점 미만
//
// 출력 :
//		학생수
//		통과 학생수
//		낙제 학생수

public class WhileEx3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int student_cnt = 0;				// 학생수
		int pass_cnt = 0;					// 통과 학생수
		int fail_cnt = 0;					// 낙제 학생수
		int student_score = 0;				// 점수
		
		String continuity = "";			
		
		Main_loop : while(true) {
			System.out.print("점수를 입력하세요 : ");
			student_score = scanner.nextInt();
			student_cnt++;
			
			if(student_score < 60) 
				fail_cnt++;
			
			else
				pass_cnt++;
			
			while(true) {
				System.out.print("종료하시겠습니까?(Y/N) : ");
				
				scanner.nextLine();
				continuity = scanner.nextLine();
				
				if(continuity.equals("y")) {
					break Main_loop;
					
				} else if(continuity.equals("n")) {
					System.out.println();
					break;
					
				} else {
					System.out.println("Error] 잘못 입력했습니다.");
				}
			}
		}
		
		System.out.println("----------------------");
		System.out.println("총 학생수 : " + student_cnt);
		System.out.println("통과 학생수 : " + pass_cnt);
		System.out.println("낙제 학생수 : " + fail_cnt);
		System.out.println("----------------------");
		
		scanner.close();
	}
}
