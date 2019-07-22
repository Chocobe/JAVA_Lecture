package project_convenience_store.product;

public final class Sports_drink extends Product implements ISports, IDrink {

// 생성자
	public Sports_drink() {
		this.set_kind_type();
	}
	
	
// main_sort
	@Override
	public String get_main_sort() {
		return MAIN_SORT;
	}

	
// sub_sort
	@Override
	public String get_sub_sort() {
		return SUB_SORT;
	}
	
	
// kind_type
	@Override
	void set_kind_type() {
		String kind_type = this.get_sub_sort() + " " + this.get_main_sort();
		super.set_kind_type(kind_type);
	}
}
