package before_starting_java;

import java.util.Scanner;

public class Test_if_1 {
	public static void main(String[] args) {
		// 평균이 70이고, 성별이 "남"이거나, 자격증이 있으면 "해외근무"
		
		Scanner scanner = new Scanner(System.in);
		
		int avg = 0;
		String sex = "";
		boolean isCertificate = false;
		
		System.out.print("평균점수 : ");
		avg = scanner.nextInt();
		
		scanner.nextLine();		// 버퍼 제거(Enter값)
		
		System.out.print("성별 : ");
		sex = scanner.nextLine();
		
		System.out.print("자격증(true/false) : ");
		isCertificate = scanner.nextBoolean();
		
		if(avg >= 70 && (sex.equals("남") || isCertificate)) {
			System.out.println("해외근무");
		}
		System.out.println("-------------------------------");
		
		
		// 계절 월 입력 :
		//			3, 4, 5 : 봄
		//			6, 7, 8 : 여름
		//			9, 10, 11 : 가을
		//			12, 1, 2 : 겨울
		String season = "";
		int month = 0;
		
		System.out.print("현재 월 : ");
		month = scanner.nextInt();
		
		if(3 <= month && month <= 5)
			season = "봄";
		
		else if(6 <= month && month <= 8)
			season = "여름";
		
		else if(9 <= month && month <= 11)
			season = "가을";
		
		else
			season = "겨울";
		
		System.out.println("현재 계절은 " + season + "입니다.");
		System.out.println("-------------------------------");
		
		
		scanner.close();
	}
}
