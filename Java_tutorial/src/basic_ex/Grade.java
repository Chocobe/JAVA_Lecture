package basic_ex;

import java.util.Scanner;

//	12. �л����� ������ �Է��Ͽ� ���� ������ ���� A�� 90-100, B�� 80-89, C�� 70-79 ���̿� ������ D�� �ش�.
//	���
//	����(����� -999�Է�) �Է� : 90
//	����(����� -999�Է�) �Է� : 86
//	����(����� -999�Է�) �Է� : 96
//	����(����� -999�Է�) �Է� : 89
//	����(����� -999�Է�) �Է� : 75
//	����(����� -999�Է�) �Է� : 72
//	����(����� -999�Է�) �Է� : 87
//	����(����� -999�Է�) �Է� : 96
//	����(����� -999�Է�) �Է� : -99
//	
//	A : 3
//	B : 3
//	C : 2

public class Grade {
	
	final static int EXIT = -999;
	final static int MIN_A_GRADE = 90;
	final static int MIN_B_GRADE = 80;
	final static int MIN_C_GRADE = 70;
	
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		
		int cur_score = 0;		// ���� ����
		int cur_grade = 0;		// ���� ���
		
		int a_grade_cnt = 0;	// A��� ��
		int b_grade_cnt = 0;	// B��� ��
		int c_grade_cnt = 0;	// C��� ��
		
		Main_loop : while(true) {
			// �Է�
			cur_score = inputScore(scanner);
			
			// ���� �˻�
			if(isFinish(cur_score)) {
				break Main_loop;
			}
			
			// ��� ����
			cur_grade = makeGrade(cur_score);
			
			// ��� ī����
			switch(cur_grade) {
			case MIN_A_GRADE :
				a_grade_cnt++;
				break;
				
			case MIN_B_GRADE :
				b_grade_cnt++;
				break;
				
			case MIN_C_GRADE :
				c_grade_cnt++;
				break;
			} // switch(cur_grade)
		} // Main_loop
		
		System.out.println();
		System.out.println("A : " + a_grade_cnt);
		System.out.println("B : " + b_grade_cnt);
		System.out.println("C : " + c_grade_cnt);
		
		scanner.close();
	}
	
	
	// inputScore : ���� �Է� �޼ҵ�
	// @aouthor : Chocobe
	// @param (Scanner _sc)	: Scanner Ŭ���� ��ü
	// @return	: (int)�Է°�
	public static int inputScore(Scanner _sc) {
		System.out.print("����(����� -999�Է�) : ");
		int score = _sc.nextInt();
		
		return score;
	}
	
	
	// isFinish : ����˻� �޼ҵ�
	// @Author : Chocobe
	// @param (int _score) : ���� ����
	// @return : (boolean)���� - true, ��� - false
	public static boolean isFinish(int _score) {
		boolean continuity = false;
		
		if(_score == EXIT) {
			continuity = true;
		}
		
		return continuity;
	}
	
	
	// makeGrade : ��� ���� �޼ҵ�
	// @Author : Chocobe
	// @param (int _score) : ���� ����
	// @return : (int)��޺� �ּҰ�
	public static int makeGrade(int _score) {
		int grade_val = 0;
		
		// A���
		if(_score >= MIN_A_GRADE) {
			grade_val = MIN_A_GRADE;
			
		// B���
		} else if(_score >= MIN_B_GRADE) {
			grade_val = MIN_B_GRADE;
			
		// C���
		} else {
			grade_val = MIN_C_GRADE;
		}
		
		return grade_val;
	}
}
