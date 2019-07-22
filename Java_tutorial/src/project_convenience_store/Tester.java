package project_convenience_store;

import project_convenience_store.gui.Main_frame;
import project_convenience_store.product.Hot_coffee;
import project_convenience_store.product.NotEnoughProductException;
import project_convenience_store.product.Product;


public class Tester {	
	public static void main(String[] args) {
		Product_manager manager = Product_manager.get_manager();
		
		Hot_coffee hot_1 = new Hot_coffee();
		hot_1.set_name("milk tee");
		hot_1.set_origin_price(1000);
		hot_1.set_sales_price(2000);
		hot_1.supply_product(10);
		
		manager.insert_product(hot_1);
		
		try {
			manager.get_product("milk tee").sales_product(11);
			
		} catch(NotEnoughProductException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			manager.get_product("milk tee").sales_product(9);
			
		} catch(NotEnoughProductException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("-------------------------");
		Product cur_product = manager.get_product("milk tee");
		System.out.println(cur_product.get_name());
		System.out.println(cur_product.get_kind_type());
		System.out.println(cur_product.get_origin_price());
		System.out.println(cur_product.get_sales_price());
		System.out.println(cur_product.get_profit());
		System.out.println(cur_product.get_remain_number());
		System.out.println("-------------------------");
		
		manager.sales_product("milk tee", 2);
		
		manager.print_product_info("milk tee");
		
		System.out.println("-----------------------------");
		
		@SuppressWarnings("unused")
		Main_frame frame = new Main_frame();
	}
}
