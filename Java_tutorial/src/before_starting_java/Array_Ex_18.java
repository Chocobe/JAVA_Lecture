package before_starting_java;

public class Array_Ex_18 {
	public static void main(String[] args) {
		int[][] score = {{ 100, 100, 100},
						   { 20,  20,  20 },
						   { 30,  30,  30 },
						   { 40,  40,  40 }};
		
		int sum = 0;
		
		// 2차원 배열을 향상된 for문으로 사용
		for(int[] i : score) {
			for(int j : i) {
				sum += j;
			}			
		}
		
		// 2차원 배열을 중첩 반복문으로 사용
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.println("arr_num[" + i + "][" + j + "] : " + score[i][j]);
			}
		}
		
		System.out.println("sum : " + sum);
		
		
		print_line();
		
		
		int kor_sum = 0;
		int eng_sum = 0;
		int math_sum = 0;
		int each_sum = 0;
		float sub_avg = 0F;
		
		for(int i = 0; i < score.length; i++) {
			
			
			kor_sum += score[i][0];
			math_sum += score[i][1];
			eng_sum += score[i][2];
			
			System.out.printf("%3d", i + 1);
			
			for(int j = 0; j < score[i].length; j++) {
				each_sum += score[i][j];
				System.out.printf("%5d", score[i][j]);
			}
			
			sub_avg = (float)each_sum / score[i].length;
			System.out.printf("%5d %5.1f\n", each_sum, sub_avg);
		}
		System.out.printf("총점:%4d %4d %4d", kor_sum, math_sum, eng_sum);
	}
	
	
	// 라인 출력
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public static void print_line() {
		System.out.println("----------------------------------");
	}
}





























