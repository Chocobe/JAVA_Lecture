package before_starting_java;

// 배열 요소들의 값의 총합, 평균, 최대, 최소 구하기

public class Array_Ex_3 {
	public static void main(String[] args) {
		int[] score = {90, 89, 94, 100, 96};
		
		int sum = 0;
		int max = -10000;
		int min = 10000;
		double avg = 0F;
		
		int len = score.length;
		
		for(int i = 0; i < len; i++) {
			sum += score[i];
			
			if(max < score[i]) {
				max = score[i];	
			}
			
			if(min > score[i]) {
				min = score[i];
			}
		}
		
		avg = (double)sum / len;
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("최대 : " + max);
		System.out.println("최소 : " + min);
	}
}
