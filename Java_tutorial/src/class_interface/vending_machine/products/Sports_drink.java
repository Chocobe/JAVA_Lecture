package class_interface.vending_machine.products;

public class Sports_drink implements IDrink {
	private String sort;
	private String name;
	private int price;
	
	public Sports_drink(String _name, int _price) {
		this.sort = "이온" + SORT;
		this.name = _name;
		this.price = _price;
	}
	
	@Override
	public String get_name() {
		return this.name;
	}

	@Override
	public int get_price() {
		return this.price;
	}
	
	public String get_sort() {
		return this.sort;
	}
}
