package class_interface.vending_machine.machine;

import class_interface.vending_machine.products.IProduct;

public interface ICalc {
	public abstract void input(int _money);	// 돈 투입
	public abstract int output();	// 돈 반환
	public abstract boolean calc(IProduct _product);	// 계산	
}
