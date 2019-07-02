package before_starting_java;

import java.util.Scanner;

// 동적으로 공간 할당이 가능하다.

public class Array_DynamicArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] x = null;
		int num = 0;
		String str = "";
		
		System.out.print("문자열 입력 : ");
		str = scanner.nextLine();
		
		System.out.print("배열 크기 : ");
		num = scanner.nextInt();
		
		x = new int[num];
		
		System.out.println(str);
		
		for(int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "] : " + x[i]);
		}
		
		scanner.close();
	}
}
