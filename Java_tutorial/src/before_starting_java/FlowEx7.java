package before_starting_java;

import java.util.Scanner;

public class FlowEx7 {
	public static void main(String[] args) {
		System.out.println("---가위, 바위, 보 게임---");
		System.out.println("가위(1), 바위(2), 보(3), 종료(0)");
		
		Scanner scanner = new Scanner(System.in);
		
		int user = 0;
		int com = 0;
		int result = 0;
		
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		while(true) { 
			System.out.print("값을 선택하세요 : ");
			user = scanner.nextInt();
			com = (int)(Math.random() * 3) + 1;
			result = user - com;
			
			if(user == 0) {
				break;
			}
		
			System.out.println("----------------------");
			System.out.println("유저 : " + user + ", com : " + com);
			
			switch(result) {
			case 0 :
				System.out.println("비겼습니다.");
				draw++;
				break;
				
			case 1 : case -2 :
				System.out.println("이겼습니다.");
				win++;
				break;
				
			case -1 : case 2 :
				System.out.println("졌습니다.");
				lose++;
				break;
				
			default : 
				System.out.println("잘못된 입력값");
				break;
			}
			
			System.out.println("승 : " + win + ", 패 : " + lose + ", 무승부 : " + draw);
			System.out.println("----------------------");
		}
		
		scanner.close();
	}
}
