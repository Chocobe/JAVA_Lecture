package before_starting_java;

// �迭 ��ҵ��� ���� ����, ���, �ִ�, �ּ� ���ϱ�

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
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
		System.out.println("�ִ� : " + max);
		System.out.println("�ּ� : " + min);
	}
}
