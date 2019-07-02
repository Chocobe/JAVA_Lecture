package basic_ex;

import java.util.Scanner;

// 5. 자바 점수을 읽어 60이상 받은 학생들의 수와 60점 미만를 받은 학생들의 수를 계산하는 프로그램을 작성하시오.

public class Count_score {
	public static void main(String[] args) {
		System.out.println("문제5] 60점 이상 학생, 60점 미만 학생의 수를 계산하기");
		
		Scanner scanner = new Scanner(System.in);
		
		int total_num = 0;		// 총 학생수
		int pass_num = 0;		// 60점 이상 학생수
		int fail_num = 0;		// 60점 미만 학생수
		int curr_score = 0;		// 현재 학생 점수
		
		String continuity = "";	// 계속 진행 여부
		
		Main_loop : while(true) {
			System.out.println("-----------------------------");
			System.out.print("점수를 입력하세요 : " );
			curr_score = scanner.nextInt();
			total_num++;
			
			if(curr_score < 60) {
				fail_num++;
				
			} else {
				pass_num++;
			}
			
			scanner.nextLine();
			
			while(true) {
				System.out.print("추가 입력 하시겠습니까? (y/n) : ");
				continuity = scanner.nextLine();
				
				if(continuity.equals("y")) {
					break;
					
				} else if(continuity.equals("n")) {
					break Main_loop;
					
				} else {
					System.out.println("잘못 입력했습니다.");
				}
			} // while(true) - EXIT
		} // Main_loop - EXIT
		
		System.out.println("-----------------------------");
		System.out.println("총 학생수 : " + total_num);
		System.out.println("60점 이상 학생수 : " + pass_num);
		System.out.println("60점 미만 학생수 : " + fail_num);
		System.out.println("-----------------------------");
		
		scanner.close();
	} // main - EXIT 
}
