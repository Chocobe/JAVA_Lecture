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
		
		if(lhs < rhs) {
			int temp = lhs;
			lhs = rhs;
			rhs = temp;
		}
		
		sub = lhs - rhs;
		
		if(sum > sub) {
			System.out.println("�� > ��");
			
		} else if(sum < sub) {
			System.out.println("�� < ��");
			
		} else {
			System.out.println("����");
		}
		
		System.out.println("�� : " + sum + ", �� : " + sub);
		System.out.println("---------------------------");
		
		// �Է� :
		//		�� �ο��� : xxx
		//		�� �Ļ�� : xxx
		// �� �ο����� 4�� �̻��̸�, "�� �Ļ�� * 0.1"�� �����Ͽ�, �� ���Ҿ��� ����Ѵ�.
		//
		int member = 0;
		int cost = 0;
		
		System.out.print("�� �ο����� �Է��ϼ��� : ");
		member = scanner.nextInt();
		System.out.print("�� �Ļ�� �Է��ϼ��� : ");
		cost = scanner.nextInt();
		
		if(member >= 4) {
			cost = cost - (int)(cost * 0.1);
		}
		
		System.out.println("�� �ο��� : " + member);
		System.out.println("�� �Ļ�� : " + cost);
		System.out.println("---------------------------");
		
		// ������ ���� 30�̻��̸� "�ֻ�����" ���
		// 20�̻��̸� "��������",
		// 10�̻��̸� "�������" ���
		//
		// �Է����� :
		//			���� : xxx
		//			�ǸŰ� : xxx
		//			���� = �ǸŰ� - ����
		//			���� = ���� / �ǸŰ� * 100
		//
		int origin_price = 0;
		int sale_price = 0;
		int profit = 0;
		double rate = 0.0F;
		int res = 0;
		
		System.out.print("��ǰ�� ���� : ");
		origin_price = scanner.nextInt();
		System.out.print("��ǰ�� �ǸŰ� : ");
		sale_price = scanner.nextInt();
		
		profit = sale_price - origin_price;
		rate = ((double)profit / sale_price) * 100;
		res = (int)rate;

		System.out.println("�ǸŰ� : " + sale_price + ", ���� : " + origin_price);
		
		System.out.print("������ : ");
		if(res >= 30)
			System.out.println("�ֻ�����");
		
		else if(res >= 20)
			System.out.println("��������");
		
		else
			System.out.println("�������");
		
		System.out.printf("���� : %d\n", res);
		System.out.println("---------------------------");
		
		
		// 2������ ����, �������� �Է�
		// ��� >= 70 �̰ų�, �������� >= 700�̸� �հ�, not ���հ�
		int kor_score = 0;
		int eng_score = 0;
		
		System.out.print("�������� : ");
		kor_score = scanner.nextInt();
		System.out.print("�������� : ");
		eng_score = scanner.nextInt();
		
		if(kor_score >= 70 || eng_score >= 700)
			System.out.println("�հ�");
		
		else
			System.out.println("���հ�");
		
		System.out.println("---------------------------");
		
		
		// ����� 70�̰� ������ "man"�̸� "�ؿܱٹ�"
		int work_score = 0;
		String sex = "";
		
		System.out.print("������ : ");
		work_score = scanner.nextInt();
		scanner.nextLine();		// ��������
		
		System.out.print("���� : ");
		sex = scanner.nextLine();
		
		if(work_score >= 70 && sex.equals("��"))
			System.out.println("�ؿܱٹ�");
		
		System.out.println("---------------------------");
		
		
		scanner.close();
	}
}
