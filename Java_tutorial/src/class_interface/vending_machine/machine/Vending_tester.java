package class_interface.vending_machine.machine;

import java.util.Scanner;

public class Vending_tester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Vending_machine machine = new Vending_machine(scanner);
		machine.sequence();
		
		scanner.close();
	}
}
