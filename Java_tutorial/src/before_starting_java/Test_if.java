package before_starting_java;

import java.util.Scanner;

public class Test_if {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		
		//num = scanner.nextInt();
		num = Integer.parseInt(scanner.nextLine());
		System.out.println("�Էµ� �� : " + num);
		
		if(num < 100)
			num += 100;	//num = num + 100;
		else
			num -= 100;	//num = num - 100;
		
		System.out.println("num : " + num);
		System.out.println("---------------------------");
		
		
		// �� ���� �Է��Ͽ� ū ���� ����ϱ�
		//
		int num1, num2;
		String str = "";
		
		System.out.print("num1 �Է� : ");		
		num1 = scanner.nextInt();
		System.out.print("num2 �Է� : ");
		num2 = scanner.nextInt();
		
		if(num1 < num2) 
			str = "ū ���� " + num2 + "�Դϴ�.";
		else 
			str = "ū ���� " + num1 + "�Դϴ�.";
		
		System.out.println("�񱳰�� : " + str);
		System.out.println("---------------------------");
		
		
		// �� ������ ������ �Է¹޾�, 180�̸� "���Ǽ���", �� �ܿ��� "���� ����ġ"
		//
		int sub_1, sub_2, sum = 0;
		
		System.out.print("���� 1 : ");
		sub_1 = scanner.nextInt();
		System.out.print("����2 : ");
		sub_2 = scanner.nextInt();
		
		sum = sub_1 + sub_2;
		
		if(sum == 180)
			System.out.println("���Ǽ���");
		
		else
			System.out.println("���� ����ġ");
		System.out.println("---------------------------");
		
		
		// �̸�, ���� �Է�
		// ��� :
		//		�̸� : �հ�(70�� �̻��� ���)
		//		�̸� : ���հ�(70�� �̸�)
		//
		String name = "";
		int score = 0;
		
		scanner.nextLine();	// ���� ����
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = scanner.nextLine();
		System.out.print("������ �Է��ϼ��� : ");
		score = scanner.nextInt();
		
		System.out.print("�̸� : " + name + ", ");
		if(score < 70) 
			System.out.println("���հ� ���� : " + score);
		
		else {
			System.out.println("�հ� ���� : " + score);
		}
		System.out.println("---------------------------");
		
		
		// �� ������ �Է��Ͽ�, �հ� ���� ���Ͽ� ��� ���
		// ��� :
		//		"�� > ��" �Ǵ� "�� < ��" "����"
		//		�� = xxx
		//		�� = xxx
		int lhs, rhs, sub = 0;
		System.out.println("�� ���� �Է��ϼ���");
		
		System.out.print("������ : ");
		lhs = scanner.nextInt();
		System.out.print("������ : ");
		rhs = scanner.nextInt();
		
		sum = lhs + rhs;
		sub = lhs - rhs;
		
		if(sum > sub) {
			System.out.println("�� > ��");
			
		} else if(sum < sub)
			System.out.println("�� < ��");
			
		else
			System.out.println("����");
		
		System.out.println("�� : " + sum + ", �� : " + sub);
				
		
		scanner.close();
	}
}
