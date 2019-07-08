package class_interface.vending_machine;

public class Vending_machine implements IInput, ICalc {
	private int add_coffee_sort;
	private int add_drink_sort;
	
	int current_money;
	IProduct[][] coffee_arr;
	IProduct[][] drink_arr;

	public Vending_machine() {
		this.current_money = 0;
		this.coffee_arr = new IProduct[0][0];
		this.drink_arr = new IProduct[0][0];
	}
	
	public void add_product(ICoffee _product) {
		if(_product instanceof Hot_coffee) {
			add_idx(coffee_arr[0], _product);
			
		} else if(_product instanceof Ice_coffee) {
			add_idx(coffee_arr[1], _product);
			
		} else if(_product instanceof Soda_drink) {
			add_idx(drink_arr[0], _product);
			
		} // 여기 추가 필요
	}
	
	public boolean add_idx(IProduct[] _arr, IProduct _product) {
		int len = _arr.length;
		IProduct[] temp_arr = new IProduct[len + 1];
		
		for(int i = 0; i < len; i++) {
			temp_arr[i] = _arr[i];
		}
		
		temp_arr[len] = _product;
		
		if(temp_arr.length == len + 1) {
			return true;
			
		} else {
			return false;
		}
	}
	
	

	@Override
	public boolean calc() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int output() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
