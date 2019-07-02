package method;

import java.util.Scanner;

public class Method_Ex_1 {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		
		final int MAX = 3;
		String name = "";
		
		for(int i = 0; i < MAX; i++) {
			printLine();
			name = inputName(scanner);
			printName(name);
		}
		
		printLine();
		System.out.println("프로그램 종료");
		
		scanner.close();
	}
	
	
	public static void printLine() {
		System.out.println("-----------------------------");
		
		return;
	}
	
	
	public static String inputName(Scanner _sc) {
		System.out.print("이름 : ");
		return _sc.nextLine();
	}
	
	
	public static void printName(String _name) {
		System.out.println("입력된 이름 : " + _name);
		
		return;
	}
}
