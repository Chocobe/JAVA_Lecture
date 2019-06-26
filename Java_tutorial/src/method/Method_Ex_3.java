package method;

import java.util.Scanner;

public class Method_Ex_3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int lhs = 10;
		int rhs = 0;
		int min = 0;
		
		lhs = setData(scanner, "������");
		rhs = setData(scanner, "������");
		
		min = getMin(lhs, rhs);
		
		printLine();
		printNum(lhs, "������");
		printNum(rhs, "������");
		printNum(min, "�ּҰ�");
		printLine();
		
		scanner.close();
	} // main
	
	
	// setData : �� �Է� �޼ҵ�
	// @author	:	Chocobe
	// @param	:	Scanner _sc		: Scanner ��ü
	//			:	String _name	: �����Ͱ��� �̸�
	// @return	:	(int)�Է��� ��
	public static int setData(Scanner _sc, String _name) {
		System.out.print(_name + "��(��) �Է��ϼ��� : ");
		return _sc.nextInt();
	}
	
	
	// printLine : ���μ� ��� �޼ҵ�
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public static void printLine() {
		System.out.println("----------------");
	}
	
	
	// printNum : ���� �ֿܼ� ����ϴ� �޼ҵ�
	// @author	:	Chocobe
	// @param	:	int _val		: ����� ��
	//			:	String _name	: ���� �̸�
	// @return	:	N/A
	public static void printNum(int _val, String _name) {
		System.out.println(_name + " : " + _val);
		
		return;
	}
	
	
	// getMin : �� ���� ���Ͽ� �ּҰ��� ���ϴ� �޼ҵ�
	// @author	:	Chocobe
	// @param	:	int _lhs	: ������
	//			:	int _rhs	: ������
	// @param	:	(int)�� ���� ���� ��
	public static int getMin(int _lhs, int _rhs) {
		int min = 0;
		
		if(_lhs > _rhs) { min = _rhs; }
		else { min = _lhs; }
		
		return min;
	}
}
