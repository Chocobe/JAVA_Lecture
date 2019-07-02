package basic_ex;

import java.util.Scanner;

// 1. 사용자로 부터 암호룰 입력받아 암호가 맞으면 "환영합니다" 라는 메세지를 출력하여 종료하고 암호가 틀리면 "암호가 틀림
// 입니다" 메세지를 출력한다.암호를  3번 잘못 입력하면 접속을 "거부합니다" 출력하고 종료한다. 암호는 koreajava로 한다

public class Authorization_Ex1 {
	public static void main(String[] args) {
		
		System.out.println("문제1] 인증 프로그램");
		
		Scanner scanner = new Scanner(System.in);
		
		String password = "koreajava";
		String input_pass = "";
		int try_cnt = 0;
		
		while(true) {
			System.out.println("-----------------------------------");
			System.out.print("비밀번호를 입력하세요 (틀린횟수 : " + try_cnt + ") : ");
			
			input_pass = scanner.nextLine();
			
			if(input_pass.equals(password)) {
				System.out.println("환영합니다.");
				System.out.println("-----------------------------------");
				break;
				
			} else {
				try_cnt++;
				
				if(try_cnt < 3) {
					System.out.println("경고] " + try_cnt + "회 인증 실패");
				
				} else {
					System.out.println("\n틀린횟수 : " + try_cnt);
					System.out.println("거부합니다.");
					System.out.println("-----------------------------------");
					break;
				}
			}
		} // while(true)
		
		scanner.close();
	} // main
}
