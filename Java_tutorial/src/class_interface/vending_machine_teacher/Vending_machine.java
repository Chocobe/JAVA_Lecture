package class_interface.vending_machine_teacher;

import java.util.Scanner;

public class Vending_machine {
	Scanner scanner = new Scanner(System.in);
	String coin;
	int input_num;
	
	public void menu_select(int _money) {
		System.out.println("현재 자판기 잔액 : " + _money + "원");
		
		if(_money >= 500) {
			System.out.println("커피와 암료수를 선택하세요.");
			System.out.println("1. 커피\n2. 음료수\n3. 종료");
			System.out.print("메뉴를 선택하세요 : ");
			input_num = scanner.nextInt();
			scanner.nextLine();
			
		} else if(_money <= 300) {
			System.out.println("커피만 선택 .....");
			System.out.println("1. 커피\n2. 음료수\n3. 끝내기");
			System.out.print("메뉴를 선택하세요 : ");
			input_num = scanner.nextInt();
			
		} else {
			System.out.println("최소 300원을 투입하세요.. 잔액부족");
			
			switch(input_num) {
			case 1:
				// 커피 클래스
				Coffee coffee = new Coffee();
				coffee.menu_select(_money);
				
			case 2:
				// 음료수 클래스
				Beverage beverage = new Beverage();
				beverage.menu_select();
				
			case 3 :
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		}
	}
	
	
	public void main_menu() {		
		System.out.println("돈을 투입하세요.!!!!");
		coin = scanner.nextLine();
		int money = Integer.parseInt(coin);
		
		this.menu_select(money);
	}
}
