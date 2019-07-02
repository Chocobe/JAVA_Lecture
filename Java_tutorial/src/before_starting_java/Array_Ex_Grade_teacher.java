package before_starting_java;

import java.util.Scanner;

public class Array_Ex_Grade_teacher {
	public static void main(String[] args) {
		
		if(args.length < 1) {
			System.out.println("사용법 : java ArrayScore 인원수");
			System.exit(0);
			
		}
		
		int count = Integer.parseInt(args[0]);
		
		Scanner scaner = new Scanner(System.in);
		
		String[] name = new String[count];
		int[] kor = new int[count];
		int[] math = new int[count];
		int[] eng = new int[count];
		int[] tot = new int[count];
		double[] avg = new double[count];
		int[] rank = new int[count];
	}
}
