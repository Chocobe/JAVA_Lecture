package before_starting_java;

public class Array_Ex_18 {
	public static void main(String[] args) {
		int[][] score = {{ 100, 100, 100},
						   { 20,  20,  20 },
						   { 30,  30,  30 },
						   { 40,  40,  40 }};
		
		int sum = 0;
		
		// 2���� �迭�� ���� for������ ���
		for(int[] i : score) {
			for(int j : i) {
				sum += j;
			}			
		}
		
		// 2���� �迭�� ��ø �ݺ������� ���
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
		
		for(int i = 0; i < score.length; i++) {
			kor_sum += score[i][0];
		}
	}
	
	
	// ���� ���
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public static void print_line() {
		System.out.println("----------------------------------");
	}
}





























