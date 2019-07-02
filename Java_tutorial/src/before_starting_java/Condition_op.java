package before_starting_java;

import java.util.Scanner;

public class Condition_op {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int gender = -1;
		String res = "";
		
		System.out.println("성별을 입력하세요 :");
		System.out.println("남성 : 1, 여성 : 2");
		
		gender = scanner.nextInt();
		
		res = (gender == 1) ? "남성입니다." : "여성입니다.";
		System.out.println(res);
		
		scanner.close();
	}
}
