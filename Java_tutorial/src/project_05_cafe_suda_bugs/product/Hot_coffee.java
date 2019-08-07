package project_05_cafe_suda_bugs.product;

public final class Hot_coffee extends Product implements IHot, ICoffee {
// 생성자
	public Hot_coffee() {
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
