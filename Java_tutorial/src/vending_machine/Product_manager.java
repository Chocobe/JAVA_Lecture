package vending_machine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import vending_machine.product.Hot_coffee;
import vending_machine.product.Ice_coffee;
import vending_machine.product.NotEnoughProductException;
import vending_machine.product.Product;
import vending_machine.product.Product_type;
import vending_machine.product.Soda_drink;
import vending_machine.product.Sports_drink;

public final class Product_manager {
	private static Product_manager manager = new Product_manager();
	
	private HashMap<String, Product> soda_drink;
	private HashMap<String, Product> sports_drink;
	private HashMap<String, Product> hot_coffee;
	private HashMap<String, Product> ice_coffee;
	
	private ArrayList<HashMap<String, Product>> all_product;
	
	
// 생성자
	private Product_manager() {
		
		this.soda_drink 	= new HashMap<String, Product>();
		this.sports_drink 	= new HashMap<String, Product>();
		this.hot_coffee 	= new HashMap<String, Product>();
		this.ice_coffee 	= new HashMap<String, Product>();
		
		this.all_product 	= new ArrayList<HashMap<String, Product>>();
		this.all_product.add(this.soda_drink);
		this.all_product.add(this.sports_drink);
		this.all_product.add(this.hot_coffee);
		this.all_product.add(this.ice_coffee);
	}
	
	
// 싱글톤 페턴
	public static Product_manager get_manager() {
		return Product_manager.manager;
	}
	
	
// 상품 추가
	public <T extends Product> boolean insert_product(T _product) {
		String product_name = _product.get_name();
		int before_total_data_num = 0;
		boolean operation_result = false;
		
		if(_product instanceof Soda_drink) {
			before_total_data_num = this.soda_drink.size();
			this.soda_drink.put(product_name, (Soda_drink)_product);
			
			if(this.soda_drink.size() > before_total_data_num) {
				this.all_product.get(
						Product_type.SODA_DRINK.ordinal()).put(product_name, _product);
				
				operation_result = true;
			}// end if
			
		} else if(_product instanceof Sports_drink) {
			before_total_data_num = this.sports_drink.size();			
			this.sports_drink.put(product_name, (Sports_drink)_product);
			
			if(this.sports_drink.size() > before_total_data_num) {
				this.all_product.get(
						Product_type.SPORTS_DRINK.ordinal()).put(product_name, _product);
				
				operation_result = true;
			}// end if
			
		} else if(_product instanceof Hot_coffee) {
			before_total_data_num = this.hot_coffee.size();
			this.hot_coffee.put(product_name, (Hot_coffee)_product);
			
			if(this.hot_coffee.size() > before_total_data_num) {
				this.all_product.get(
						Product_type.HOT_COFFEE.ordinal()).put(product_name, _product);
				
				operation_result = true;
			}// end if
			
		} else if(_product instanceof Ice_coffee) {
			before_total_data_num = this.ice_coffee.size();
			this.ice_coffee.put(product_name, (Ice_coffee)_product);
			
			if(this.ice_coffee.size() > before_total_data_num) {
				this.all_product.get(
						Product_type.ICE_COFFEE.ordinal()).put(product_name, _product);
				
				operation_result = true;
			}// end if
		}// if ~ else
		
		return operation_result;
	}
	
	
// 상품 삭제
	public boolean delete_product(String _name) {
		boolean operation_result = false;
		Product cur_product = this.get_product(_name);
		String cur_product_name = cur_product.get_name();
		
		if(cur_product != null) {
			if(cur_product instanceof Soda_drink) {
				this.soda_drink.remove(cur_product_name);
				this.all_product.get(
						Product_type.SODA_DRINK.ordinal()).remove(cur_product_name);
				
			} else if(cur_product instanceof Sports_drink) {
				this.sports_drink.remove(cur_product_name);
				this.all_product.get(
						Product_type.SPORTS_DRINK.ordinal()).remove(cur_product_name);
				
			} else if(cur_product instanceof Hot_coffee) {
				this.hot_coffee.remove(cur_product_name);
				this.all_product.get(
						Product_type.HOT_COFFEE.ordinal()).remove(cur_product_name);
				
			} else if(cur_product instanceof Ice_coffee) {
				this.ice_coffee.remove(cur_product_name);
				this.all_product.get(
						Product_type.ICE_COFFEE.ordinal()).remove(cur_product_name);
			}// end if ~ else
			
			operation_result = true;
		}// end if
		
		return operation_result;
	}
	
	
// 상품 검색
	public Product get_product(String _name) {
		Product cur_product = null;
		Iterator<HashMap<String, Product>> iterator = this.all_product.iterator();
		
		while(iterator.hasNext()) {
			cur_product = iterator.next().get(_name);
			
			if(cur_product != null) {
				break;
			}
		}// end while()
		
		return cur_product;
	}
	
	
// 상품 판매
	public void sales_product(String _name, int _sales_number) {
		Product cur_product = this.get_product(_name);
		
		if(cur_product != null) {
			try {
				cur_product.sales_product(_sales_number);
				
			} catch(NotEnoughProductException e) {
				System.err.println(e.getMessage());
			}
		}
	}
	
	
// 상품 정보 출력
	public void print_product_info(String _name) {
		Product cur_product = this.get_product(_name);
		
		if(cur_product != null) {
			System.out.println(cur_product.get_name());
			System.out.println(cur_product.get_kind_type());
			System.out.println(cur_product.get_origin_price());
			System.out.println(cur_product.get_sales_price());
			System.out.println(cur_product.get_profit());
			System.out.println(cur_product.get_remain_number());
		}
	}
}
