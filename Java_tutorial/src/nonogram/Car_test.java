package nonogram;

public class Car_test {
	public static void main(String[] args) {
		Car car_1 = new Car();
		Car car_2 = new Car(4); 
		Car car_3 = new Car("Yellow");
		Car car_4 = new Car("Cyon", "수동");
		Car car_5 = new Car("Magenta", "반자동");
		Car car_6 = new Car("Sky blue", "반수동", 1);
		
		car_1.print_inform();
		car_2.print_inform();
		car_3.print_inform();
		car_4.print_inform();
		car_5.print_inform();
		car_6.print_inform();
	}
}
