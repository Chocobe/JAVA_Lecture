package class_interface.vending_machine.machine;

import class_interface.vending_machine.products.IProduct;

public class Coin_machine implements ICalc {
	private int cur_money;

	public Coin_machine() {
		this.cur_money = 0;
	}
	
	// 돈 투입
	@Override
	public void input(int _money) {
		this.cur_money = _money;
	}

	
	// 돈 반환
	@Override
	public int output() {
		int return_money = this.cur_money;
		this.cur_money = 0;
		
		return return_money;
	}

	
	// 상품 계산
	@Override
	public boolean calc(IProduct _product) {
		String name = _product.get_name();
		int price = _product.get_price();
		
		if(price > this.cur_money) {
			System.out.println("금액이 부족합니다");
			
			return false;
			
		} else {
			this.cur_money -= price;
			System.out.println(name + "을 구매하셨습니다(잔액 : " + this.cur_money + ")");
			
			return true;
		}
	}
}
