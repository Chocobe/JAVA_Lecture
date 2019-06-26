package method;

import java.util.Scanner;

public class Method_Ex_3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int lhs = 10;
		int rhs = 0;
		int min = 0;
		
		lhs = setData(scanner, "좌측항");
		rhs = setData(scanner, "우측항");
		
		min = getMin(lhs, rhs);
		
		printLine();
		printNum(lhs, "좌측항");
		printNum(rhs, "우측항");
		printNum(min, "최소값");
		printLine();
		
		scanner.close();
	} // main
	
	
	// setData : 값 입력 메소드
	// @author	:	Chocobe
	// @param	:	Scanner _sc		: Scanner 객체
	//			:	String _name	: 데이터값의 이름
	// @return	:	(int)입력한 값
	public static int setData(Scanner _sc, String _name) {
		System.out.print(_name + "을(를) 입력하세요 : ");
		return _sc.nextInt();
	}
	
	
	// printLine : 가로선 출력 메소드
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public static void printLine() {
		System.out.println("----------------");
	}
	
	
	// printNum : 값을 콘솔에 출력하는 메소드
	// @author	:	Chocobe
	// @param	:	int _val		: 출력할 값
	//			:	String _name	: 값의 이름
	// @return	:	N/A
	public static void printNum(int _val, String _name) {
		System.out.println(_name + " : " + _val);
		
		return;
	}
	
	
	// getMin : 두 값을 비교하여 최소값을 구하는 메소드
	// @author	:	Chocobe
	// @param	:	int _lhs	: 좌측항
	//			:	int _rhs	: 우측항
	// @param	:	(int)두 값중 작은 값
	public static int getMin(int _lhs, int _rhs) {
		int min = 0;
		
		if(_lhs > _rhs) { min = _rhs; }
		else { min = _lhs; }
		
		return min;
	}
}
