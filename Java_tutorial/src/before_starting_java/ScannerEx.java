package before_starting_java;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("---���� �Է�---");
		System.out.print("���� : ");
		int kor = scanner.nextInt();
		System.out.print("���� : ");
		int math = scanner.nextInt();
		
		System.out.println();
		System.out.println("---�Էµ� ��---");
		System.out.println("���� : " + kor);
		System.out.println("���� : " + math);
		
		int sum = kor + math;
		double avg = sum / 2F;
		System.out.printf("��� : %.2f\n", avg);
		System.out.println(kor + math);
		System.out.println("" + kor + math);
		
		scanner.close();
	}
}
