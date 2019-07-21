package vending_machine.product;

public class Soda_drink extends Product implements IDrink, ISoda {
	
// 생성자
	public Soda_drink() {
		this.set_kind_type();
	}
	
	
// sub_sort	
	@Override
	public String get_sub_sort() {
		return SUB_SORT;
	}


// main_sort
	@Override
	public String get_main_sort() {
		return MAIN_SORT;
	}
	
	
// kind_type
	private void set_kind_type() {
		String kind_type = this.get_sub_sort() + " " + this.get_main_sort();
		super.set_kind_type(kind_type);
	}
}








































