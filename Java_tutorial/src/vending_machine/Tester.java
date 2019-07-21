package vending_machine;

import java.util.HashMap;

import vending_machine.product.Ice_coffee;



public class Tester {
	enum tester {
		test_1, test_2
	}
	
	public static void main(String[] args) {
		HashMap<String, Ice_coffee> product = new HashMap<String, Ice_coffee>();
		Ice_coffee ice = new Ice_coffee();
		
		product.put("americano", ice);
		product.put("americano", ice);
		System.out.println("개수 : " + product.size());
		System.out.println(product.get("americano").get_kind_type());
		
		
		product.put("americano", ice);
		System.out.println("개수 : " + product.size());
		
		System.out.println(product.get("s"));
	}
}
