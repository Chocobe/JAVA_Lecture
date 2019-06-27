package before_starting_java;

public class Array_Ex_1 {
	public static void main(String[] args) {
		int[] score_1 = new int[5];
		int k = 1;
		
		score_1[0] = 50;
		score_1[1] = 60;
		score_1[k + 1] = 70;
		score_1[3] = 80;
		score_1[4] = 90;
		
		int temp = score_1[k + 2] + score_1[4];
		System.out.println("temp : " + temp);
		
		for(int i : score_1) {
			System.out.print(i + " ");
		}
		System.out.println("\n----------------------------");
		
		
		int[] score_2 = {50, 60, 70, 80, 90};
		int length_2 = score_2.length;
		
		for(int i = 0; i < length_2; i++) {
			System.out.println("score_2[" + i + "] : " + score_2[i]);
		}
	} // main
}
