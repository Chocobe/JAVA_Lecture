package method;

import java.util.Scanner;

// �� ������ ������ �Է� �޾� �հ�, ����� ���Ͻÿ�
// �޼ҵ� : 
// 		�Է� �޼ҵ�
// 		ó�� �޼ҵ� : �հ�, ���
//		��� �޼ҵ�

public class Method_Ex_2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int kor_score = 0;
		int math_score = 0;
		int total_score = 0;
		
		double avg = 0F;
			
		kor_score = inputScore(scanner, "����");
		total_score = outputSum(total_score, kor_score);
		math_score = inputScore(scanner, "����");
		total_score = outputSum(total_score, math_score);
		avg = outputAvg(total_score);
		
		System.out.println("---------------------------");
		System.out.println("���� : " + kor_score);
		System.out.println("���� : " + math_score);
		System.out.println("���� : " + total_score);
		System.out.println("��� : " + avg);
		System.out.println("---------------------------");
		
		scanner.close();
	}
	
	
	public static int inputScore(Scanner _sc, String _sub) {
		System.out.print(_sub + " ������ �Է��ϼ��� : ");
		int score = _sc.nextInt();
		
		return score;
	}
	
	
	public static int outputSum(int _totalScore, int _curScore) {
		int sum = _totalScore + _curScore;
		
		return sum;
	}
	
	
	public static double outputAvg(int _totalScore) {
		double avg = (double)_totalScore / 2;
		
		return avg;
	}
}
