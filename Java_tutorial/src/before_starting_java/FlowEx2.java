package before_starting_java;

import java.util.Scanner;

public class FlowEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		
		System.out.print("정수를 입력하세요 : ");
		input = Integer.parseInt(scanner.nextLine());
		
		// if문 두개를 사용
		if(input == 0)
			System.out.println("입력한 숫자는 0입니다.");
		
		if(input != 0) {
			System.out.print("입력한 숫자는 0이 아니고, ");
			System.out.println(input + "입니다.");
		}
		
		System.out.println("---------------------------");
		
		// if ~ else를 사용
		if(input == 0) {
			System.out.println("입력한 숫자는 0입니다.");
			
		} else {
			System.out.print("입력한 숫자는 0이 아니고, ");
			System.out.println(input + "입니다.");
		}
		
		scanner.close();
	}
}
