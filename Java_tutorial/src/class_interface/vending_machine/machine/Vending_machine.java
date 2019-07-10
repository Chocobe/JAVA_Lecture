package class_interface.vending_machine.machine;

import java.util.Scanner;

import class_interface.vending_machine.products.Hot_coffee;
import class_interface.vending_machine.products.IProduct;
import class_interface.vending_machine.products.Ice_coffee;
import class_interface.vending_machine.products.Soda_drink;
import class_interface.vending_machine.products.Sports_drink;

public class Vending_machine {
	
	private Scanner scanner;
	
	public IProduct[] product;
	
	public Coin_machine coin_machine;
	public Screen screen;
	
	public Vending_machine(Scanner _scanner) {
		this.scanner = _scanner;
		
		this.coin_machine = new Coin_machine();
		this.screen = new Screen();
		
		IProduct[] product = new IProduct[12];
		
		product[0] = new Soda_drink("콜라", 600);
		product[1] = new Soda_drink("사이다", 600);
		product[2] = new Soda_drink("환타", 500);
		
		product[3] = new Sports_drink("게토레이", 800);
		product[4] = new Sports_drink("파워웨이드", 800);
		product[5] = new Sports_drink("우롱차", 1000);
		
		product[6] = new Hot_coffee("아메리카노", 300);
		product[7] = new Hot_coffee("밀크", 300);
		product[8] = new Hot_coffee("라떼", 400);
		
		product[9] = new Ice_coffee("아메리카노", 300);
		product[10] = new Ice_coffee("초코", 500);
		product[11] = new Ice_coffee("밀크", 400);
	}
	
	
	public void sequence() {
		while(true) {
			screen.insert_coin_message(this.scanner);
			screen.main_menu_message(this.product);
		}
	}
}
