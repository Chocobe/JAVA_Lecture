package vending_machine.product;

public interface IDrink {
	public final static String MAIN_SORT = Main_sort_type.DRINK.toString();
	
	public abstract String get_main_sort();
	
}
