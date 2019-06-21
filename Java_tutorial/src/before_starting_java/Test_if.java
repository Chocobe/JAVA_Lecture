package before_starting_java;

import java.util.Scanner;

public class Test_if {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		
		//num = scanner.nextInt();
		num = Integer.parseInt(scanner.nextLine());
		System.out.println("입력된 값 : " + num);
		
		if(num < 100)
			num += 100;	//num = num + 100;
		else
			num -= 100;	//num = num - 100;
		
		System.out.println("num : " + num);
		System.out.println("---------------------------");
		
		
		// 두 수를 입력하여 큰 값을 출력하기
		//
		int num1, num2;
		String str = "";
		
		System.out.print("num1 입력 : ");		
		num1 = scanner.nextInt();
		System.out.print("num2 입력 : ");
		num2 = scanner.nextInt();
		
		if(num1 < num2) 
			str = "큰 수는 " + num2 + "입니다.";
		else 
			str = "큰 수는 " + num1 + "입니다.";
		
		System.out.println("비교결과 : " + str);
		System.out.println("---------------------------");
		
		
		// 두 과목의 점수를 입력받아, 180이면 "조건성립", 그 외에는 "조건 불일치"
		//
		int sub_1, sub_2, sum = 0;
		
		System.out.print("과목 1 : ");
		sub_1 = scanner.nextInt();
		System.out.print("과목2 : ");
		sub_2 = scanner.nextInt();
		
		sum = sub_1 + sub_2;
		
		if(sum == 180)
			System.out.println("조건성립");
		
		else
			System.out.println("조건 불일치");
		System.out.println("---------------------------");
		
		scanner.close();
	}
}
