package before_starting_java;

import java.util.Random;
import java.util.Scanner;

public class Test_for_1 {
	public static void main(String[] args) {
		// 1부터 3까지 출력
		//
		for(int i = 1; i <= 3; i++) {
			System.out.println("Hello Java");
		}
		System.out.println("-----------------------------");

		
		// 1부터 100까지의 정수 중, 5로 나누어 떨어지는 수 출력, 합을 구하시오
		//
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 5 == 0) {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("5의 배수의 총 합 : " + sum);		
		System.out.println("-----------------------------");
		
		
		// *를 이용한 직각삼각형 출력
		//
		Scanner scanner = new Scanner(System.in);
		int height = 0;
		
		System.out.print("출력할 높이를 입력하세요 : ");
		height = scanner.nextInt();
		
		for(int i = 1; i <= height; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
		
		
		// 입력 :
		//		첫번째 수
		//		두번째 수
		//		배수
		// 출력 :
		//		첫번째 수에서 두번째 수 까지 사이의 배수의 합
		//
		int num_1 = 0;
		int num_2 = 0;
		int multiple = 0;
		int multiple_sum = 0;
		
		System.out.print("첫번째 수 : ");
		num_1 = scanner.nextInt();
		
		System.out.print("두번째 수 : ");
		num_2 = scanner.nextInt();
		
		System.out.print("배수 : ");
		multiple = scanner.nextInt();
		
		if(num_1 > num_2) {
			int temp = num_1;
			num_1 = num_2;
			num_2 = temp;
		}
		
		for(int i = num_1; i <= num_2; i++) {
			if(i % multiple == 0) 				
				multiple_sum += i;
		}
		System.out.println();
		System.out.println("num_1 : " + num_1 + ", num_2 : " + num_2);
		System.out.println(multiple + "배수의 총 합 : " + multiple_sum);
		System.out.println("-----------------------------");
		
		
		
		scanner.close();
	}
}






























