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
		System.out.println("���α׷� ����");
		
		scanner.close();
	}
	
	
	public static void printLine() {
		System.out.println("-----------------------------");
		
		return;
	}
	
	
	public static String inputName(Scanner _sc) {
		System.out.print("�̸� : ");
		return _sc.nextLine();
	}
	
	
	public static void printName(String _name) {
		System.out.println("�Էµ� �̸� : " + _name);
		
		return;
	}
}
