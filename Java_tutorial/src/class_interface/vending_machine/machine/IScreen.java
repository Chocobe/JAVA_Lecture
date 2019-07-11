package class_interface.vending_machine.machine;

import java.util.Scanner;

import class_interface.vending_machine.products.IProduct;

public interface IScreen {
	public abstract int insert_coin_message(Scanner _scanner);
	public abstract void main_menu_message(IProduct[] _product);
	public abstract void sort_menu_message();
	public abstract void detail_menu_message();
}
