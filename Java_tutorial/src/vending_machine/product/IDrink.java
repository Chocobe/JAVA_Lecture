package vending_machine.product;

public interface IDrink {
	public final static String MAIN_SORT = Product_type.DRINK.toString();
	
	public abstract String get_main_sort();
	
}
