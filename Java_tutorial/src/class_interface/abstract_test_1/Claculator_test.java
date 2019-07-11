package class_interface.abstract_test_1;

public class Claculator_test {
	public static void main(String[] args) {
		Good_calc calculator = new Good_calc();
		
		int lhs = 10;
		int rhs = 5;
		
		int[] val_arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		int sum = calculator.add(lhs, rhs);
		int sub = calculator.subtract(lhs, rhs);
		double avg = calculator.average(val_arr);
		
		System.out.println(lhs + " + " + rhs + " = " + sum);
		System.out.println(lhs + " - " + rhs + " = " + sub);
		System.out.println("average of val_arr : " + avg);
	}
}
