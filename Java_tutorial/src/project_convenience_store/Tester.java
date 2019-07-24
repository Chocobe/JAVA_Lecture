package project_convenience_store;

import java.util.ArrayList;
import java.util.Iterator;

import project_convenience_store.gui.Main_frame;
import project_convenience_store.product.Hot_coffee;
import project_convenience_store.product.Ice_coffee;
import project_convenience_store.product.NotEnoughProductException;
import project_convenience_store.product.Product;
import project_convenience_store.product.Soda_drink;


public class Tester {	
	public static void main(String[] args) {
		Product_manager manager = Product_manager.get_manager();
		
		Hot_coffee hot_1 = new Hot_coffee();
		hot_1.set_name("Milk tee");
		hot_1.set_origin_price(1000);
		hot_1.set_sales_price(2000);
		hot_1.supply_product(10);
		
		manager.insert_product(hot_1);
		
		hot_1 = new Hot_coffee();
		hot_1.set_name("Americano_1");
		hot_1.set_origin_price(500);
		hot_1.set_sales_price(5100);
		hot_1.supply_product(3);
		
		manager.insert_product(hot_1);
		
		hot_1 = new Hot_coffee();
		hot_1.set_name("Americano_2");
		hot_1.set_origin_price(600);
		hot_1.set_sales_price(5000);
		hot_1.supply_product(7);
		
		manager.insert_product(hot_1);
		
		Ice_coffee ice_1 = new Ice_coffee();
		ice_1.set_name("Chocobe_1");
		ice_1.set_origin_price(400);
		ice_1.set_sales_price(3000);
		ice_1.supply_product(11);
		
		manager.insert_product(ice_1);
		
		ice_1 = new Ice_coffee();
		ice_1.set_name("Chocobe_2");
		ice_1.set_origin_price(300);
		ice_1.set_sales_price(4100);
		ice_1.supply_product(45);
		
		manager.insert_product(ice_1);
		
		ice_1 = new Ice_coffee();
		ice_1.set_name("Chocobe_3");
		ice_1.set_origin_price(1000);
		ice_1.set_sales_price(3000);
		ice_1.supply_product(33);
		
		manager.insert_product(ice_1);
		
		Soda_drink soda = new Soda_drink();
		soda.set_name("SODA_1");
		soda.set_origin_price(123);
		soda.set_sales_price(321);
		soda.supply_product(21);
		
		manager.insert_product(soda);
		
		soda = new Soda_drink();
		soda.set_name("SODA_2");
		soda.set_origin_price(1123);
		soda.set_sales_price(3121);
		soda.supply_product(211);
		
		manager.insert_product(soda);
		
		soda = new Soda_drink();
		soda.set_name("SODA_3");
		soda.set_origin_price(500);
		soda.set_sales_price(5000);
		soda.supply_product(2);
		
		manager.insert_product(soda);
		
		try {
			manager.get_product("Milk tee").sales_product(11);
			
		} catch(NotEnoughProductException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			manager.get_product("Milk tee").sales_product(9);
			manager.get_product("SODA_3").sales_product(1);
			
		} catch(NotEnoughProductException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("-------------------------");
		Product cur_product = manager.get_product("Milk tee");
		System.out.println(cur_product.get_name());
		System.out.println(cur_product.get_kind_type());
		System.out.println(cur_product.get_origin_price());
		System.out.println(cur_product.get_sales_price());
		System.out.println(cur_product.get_profit());
		System.out.println(cur_product.get_remain_number());
		System.out.println("-------------------------");
		
		manager.sales_product("Milk tee", 2);
		
		manager.print_product_info("Milk tee");
		
		System.out.println("-----------------------------");
		
		Main_frame.get_frame();
		
		
		ArrayList<String> list = new ArrayList<String>();
		list = manager.get_all_product_name();
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
