package class_interface.vending_machine.machine;

import java.util.Scanner;

import class_interface.vending_machine.products.ICoffee;
import class_interface.vending_machine.products.IDrink;
import class_interface.vending_machine.products.IProduct;

public class Screen implements IScreen {
		
	
	@Override
	public int insert_coin_message(Scanner _scanner) {
		int inserted_money = 0;
		
		while(true) {
			try {
				System.out.print("Insert Coin : ");	
				inserted_money = _scanner.nextInt();
				break;
				
			} catch(Exception e) {
				_scanner.nextLine();
				System.out.println("잘못된 입력입니다");
				continue;
			}
		}// while(true)
		
		return inserted_money;
	}

	
	@Override
	public void main_menu_message(IProduct[] _product) {
		
		boolean is_printed_coffee = false;
		boolean is_printed_drink = false;
		
		for(int i = 0; i < _product.length; i++) {
			if(_product[i] instanceof ICoffee && !is_printed_coffee) {
				is_printed_coffee = true;
				
				System.out.print("1. " + ICoffee.SORT);
				
			} else if(_product[i] instanceof IDrink && !is_printed_drink) {
				is_printed_drink = true;
				
				System.out.print("2. " + IDrink.SORT);
			}
		}
	}
	

	@Override
	public void sort_menu_message() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detail_menu_message() {
		// TODO Auto-generated method stub
		
	}

}
