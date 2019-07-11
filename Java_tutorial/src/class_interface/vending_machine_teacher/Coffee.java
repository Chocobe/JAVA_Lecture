package class_interface.vending_machine_teacher;

public class Coffee {
	public void menu_select(int _money) {
		System.out.println("현재 자판기잔액 : " + _money);
		System.out.println("1. 뜨거운 커피\n2. 차가운 커피\n3. 이전으로");
		System.out.print("번호를 선택 : ");
	}
}
