package java_class.constructor;

public class Car_test {
	public static void main(String[] args) {
		Car car_1 = new Car();
		car_1.color = "White";
		car_1.gearType = "auto";
		car_1.door = 4;
		
		Car car_2 = new Car("White", "auto", 4);
		
		System.out.println("car_1의 color : " + car_1.color + ", gear : " + car_1.gearType + ", door : " + car_1.door);
		System.out.println("car_2의 color : " + car_2.color + ", gear : " + car_2.gearType + ", door : " + car_2.door);
	}
}
