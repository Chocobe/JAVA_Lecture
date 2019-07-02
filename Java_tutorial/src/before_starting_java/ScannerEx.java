package before_starting_java;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("---성적 입력---");
		System.out.print("국어 : ");
		int kor = scanner.nextInt();
		System.out.print("수학 : ");
		int math = scanner.nextInt();
		
		System.out.println();
		System.out.println("---입력된 값---");
		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + math);
		
		int sum = kor + math;
		double avg = sum / 2F;
		System.out.printf("평균 : %.2f\n", avg);
		System.out.println(kor + math);
		System.out.println("" + kor + math);
		
		scanner.close();
	}
}
