package java_polymorphism.up_down_cast;

public class Casting_test {
	public static void main(String[] args) {
		Car car_1 = new Car();
		car_1.color = "Magenta";
		car_1.door = 3;
		car_1.drive();
		car_1.stop();
		
		print_line();
		
		Car car_2 = null;
		Fire_engine fire_engine_1 = new Fire_engine();

		fire_engine_1.water();
		
		print_line();
		
		car_2 = fire_engine_1;
//		car_2.water(); <- Fire_engine(자식 클래스) 클래스의 메소드는 접근 불가
		car_2.drive();
		car_2.stop();
		
		print_line();
		
		Fire_engine fire_engine_2 = null;
//		fire_engine_2 = car_2; <- 다운케스팅은 타입(Fire_engine)을 지정해 주어야 한다.
		fire_engine_2 = (Fire_engine)car_2;		// 다운 케스팅
		fire_engine_2.drive();
		fire_engine_2.stop();
		fire_engine_2.water();
		
	}
	
	public static void print_line() {
		System.out.println("----------------------------");
	}
}
