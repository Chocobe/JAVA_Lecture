package vending_machine.product;

public interface ISoda {
	public final static String SUB_SORT = Product_type.SODA.toString();
	
	public abstract String get_sub_sort();
}
