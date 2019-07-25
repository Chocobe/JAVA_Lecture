package project_cafe_suda_bugs;

import project_cafe_suda_bugs.gui.Main_frame;
import project_cafe_suda_bugs.product.Hot_coffee;
import project_cafe_suda_bugs.product.Ice_coffee;
import project_cafe_suda_bugs.product.Soda_drink;
import project_cafe_suda_bugs.product.Sports_drink;

public class Suda_bugs {	
	public static void main(String[] args) {
		Product_manager manager = Product_manager.get_manager();		
		Suda_bugs.set_test_product(manager);

		Main_frame.get_frame();
	}
	
	
// 테스트용 제품 등록
	public static void set_test_product(Product_manager _manager) {
		Hot_coffee hot_1 = new Hot_coffee();
		hot_1.set_name("아메리카노");
		hot_1.set_origin_price(1000);
		hot_1.set_sales_price(2000);
		hot_1.supply_product(10);
		
		_manager.insert_product(hot_1);
		
		hot_1 = new Hot_coffee();
		hot_1.set_name("아인 슈페너");
		hot_1.set_origin_price(2000);
		hot_1.set_sales_price(3000);
		hot_1.supply_product(10);
		
		_manager.insert_product(hot_1);
		
		hot_1 = new Hot_coffee();
		hot_1.set_name("플렛 화이트");
		hot_1.set_origin_price(3000);
		hot_1.set_sales_price(4000);
		hot_1.supply_product(10);
		
		_manager.insert_product(hot_1);
		
		Ice_coffee ice_1 = new Ice_coffee();
		ice_1.set_name("Chocobe_black");
		ice_1.set_origin_price(3000);
		ice_1.set_sales_price(5000);
		ice_1.supply_product(10);
		
		_manager.insert_product(ice_1);
		
		ice_1 = new Ice_coffee();
		ice_1.set_name("Chocobe_magenta");
		ice_1.set_origin_price(4000);
		ice_1.set_sales_price(6000);
		ice_1.supply_product(10);
		
		_manager.insert_product(ice_1);
		
		ice_1 = new Ice_coffee();
		ice_1.set_name("Chocobe_blue");
		ice_1.set_origin_price(5000);
		ice_1.set_sales_price(7000);
		ice_1.supply_product(10);
		
		_manager.insert_product(ice_1);
		
		Soda_drink soda = new Soda_drink();
		soda.set_name("사이다");
		soda.set_origin_price(1000);
		soda.set_sales_price(2000);
		soda.supply_product(10);
		
		_manager.insert_product(soda);
		
		soda = new Soda_drink();
		soda.set_name("콜라");
		soda.set_origin_price(2000);
		soda.set_sales_price(3000);
		soda.supply_product(10);
		
		_manager.insert_product(soda);
		
		soda = new Soda_drink();
		soda.set_name("밀키스");
		soda.set_origin_price(3000);
		soda.set_sales_price(4000);
		soda.supply_product(10);
		
		_manager.insert_product(soda);
		
		Sports_drink sports = new Sports_drink();
		sports.set_name("게토레이");
		sports.set_origin_price(1000);
		sports.set_sales_price(2000);
		sports.supply_product(10);
		
		_manager.insert_product(sports);
		
		sports = new Sports_drink();
		sports.set_name("파워웨이드");
		sports.set_origin_price(2000);
		sports.set_sales_price(3000);
		sports.supply_product(10);
		
		_manager.insert_product(sports);
		
		sports = new Sports_drink();
		sports.set_name("소금물");
		sports.set_origin_price(3000);
		sports.set_sales_price(4000);
		sports.supply_product(10);
		
		_manager.insert_product(sports);
	}
}
