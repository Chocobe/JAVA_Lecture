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
		
		scanner.nextLine();
		
		System.out.print("성별 : ");
		sex = scanner.nextLine();
		
		System.out.print("자격증 : ");
		isCertificate = scanner.nextBoolean();
		
		if(avg >= 70 && (sex.equals("남") || isCertificate)) {
			System.out.println("해외근무");
		}
		
		scanner.close();
	}
}
