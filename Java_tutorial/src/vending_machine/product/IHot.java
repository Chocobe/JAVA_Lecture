package vending_machine.product;

public interface IHot {
	public final static String SUB_SORT = Sub_sort_type.HOT.toString();
	
	public abstract String get_sub_sort();
}
