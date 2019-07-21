package vending_machine.product;

public abstract class Product {
	private String name;
	private int origin_price;
	private int sales_price;
	private int profit;
	private String kind_type;
	private int remain_number;
	
	
// name
	public String get_name() {
		return this.name;
	}
	
	public void set_name(String _name) {
		this.name = _name;
	}
	
	
// origin_price
	public int get_origin_price() {
		return this.origin_price;
	}
	
	public void set_origin_price(int _origin_price) {
		this.origin_price = _origin_price;
	}
	
	
// sales_price
	public int get_sales_price() {
		return this.sales_price;
	}
	
	public void set_sales_price(int _sales_price) {
		this.sales_price = _sales_price;
	}
	
	
// profit
	public int get_profit() {
		return this.profit;
	}
	
	public void sales_product(int _sales_number) throws NotEnoughProductException {
		if(_sales_number > this.get_remain_number()) {
			throw new NotEnoughProductException(
					this.get_name() + 
					"의 재고량이 부족합니다" +
					" (재고량 : " +
					this.get_remain_number() +
					")");
		}
		
		int profit = this.get_sales_price() - this.get_origin_price();
		this.profit += profit * _sales_number;
		this.sub_product(_sales_number);
	}
	
	
// kind_type
	public String get_kind_type() {
		return this.kind_type;
	}
	
	void set_kind_type(String _kind_type) {
		this.kind_type = _kind_type;
	}
	
	abstract void set_kind_type();
	
	
// remain_number
	public int get_remain_number() {
		return this.remain_number;
	}
	
	public void supply_product(int _number) {
		this.remain_number += _number;
	}
	
	private void sub_product(int _number) {
		this.remain_number -= _number;
	}
}
