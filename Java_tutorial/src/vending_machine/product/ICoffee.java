package vending_machine.product;

public interface ICoffee {
	public final static String MAIN_SORT = Main_sort_type.COFFEE.toString();
	
	public abstract String get_main_sort();
}
