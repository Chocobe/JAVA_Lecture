package java_polymorphism.ex_TV;

public class TV_test {
	public static void main(String[] args) {
		// 삼성 TV
		// 1.
		TV tv_1 = new TV();
		// 2.
		tv_1.set_brand_name("삼성");
		// 3.
		tv_1.set_power(true);
		
		// 4.
		tv_1.set_channel(1);
		// 5.
		tv_1.set_volume(6);
		// 6.
		tv_1.print_inform();
		
		// 7.
		tv_1.down_channel();
		// 8.
		tv_1.up_volume();
		// 9.
		tv_1.print_inform();
		
		print_line();
		
		// 엘지 TV
		// 1.
		TV tv_2 = new TV();
		// 2.
		tv_2.set_brand_name("엘지");
		// 3.
		tv_2.set_power(true);
		
		// 4.
		tv_2.set_channel(98);
		// 5.
		tv_2.set_volume(10);
		// 6.
		tv_2.print_inform();
		
		// 7.
		tv_2.up_channel();
		// 8.
		tv_2.up_volume();
		// 9.
		tv_2.print_inform();
		
		print_line();
		
		tv_1.set_power(false);
		tv_1.print_inform();
		tv_1.set_channel(1);
		tv_1.set_volume(2);
	}
	
	public static void print_line() {
		System.out.println("---------------------\n");
	}
}
