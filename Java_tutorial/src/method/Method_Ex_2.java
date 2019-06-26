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
		
		printData(kor_score, math_score, total_score, avg);
		
		scanner.close();
	} // main
	
	
	// printData : ������ ��� �޼ҵ�
	// @author	:	Chocobe
	// @param	:	int _kor	: ��������
	//			:	int _math	: ��������
	//			:	int _total	: ����
	//			:	double _avg	: ���
	// @return	:	N/A
	public static void printData(int _kor, int _math, int _total, double _avg) {
		System.out.println("---------------------------");
		System.out.println("���� : " + _kor);
		System.out.println("���� : " + _math);
		System.out.println("���� : " + _total);
		System.out.println("��� : " + _avg);
		System.out.println("---------------------------");
	}
	
	
	// inputScore : �����Է� �޼ҵ�
	// @author	:	Chocobe
	// @param	:	Scanner _sc	: Scanner ��ü
	//			:	String _sub	: �����
	// @return	:	(int)�Է��� ����
	public static int inputScore(Scanner _sc, String _sub) {
		System.out.print(_sub + " ������ �Է��ϼ��� : ");
		int score = _sc.nextInt();
		
		return score;
	}
	
	
	// outputSum : �� ���� ���� ���ϴ� �޼ҵ�
	// @author	:	Chocobe
	// @param	:	int _totalScore	: ����
	//	 		:	int _curScore	: ���� ����
	// @return	:	(int) �� ������ ��
	public static int outputSum(int _totalScore, int _curScore) {
		int sum = _totalScore + _curScore;
		
		return sum;
	}
	
	
	// outputAvg : ����� ���ϴ� �޼ҵ�
	// @author	:	Chocobe
	// @param	:	int _totalScore : ���� �� ��
	// @return	:	(double)2������ ��հ�
	public static double outputAvg(int _totalScore) {
		double avg = (double)_totalScore / 2;
		
		return avg;
	}
}
