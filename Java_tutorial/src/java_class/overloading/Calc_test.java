package java_class.overloading;

public class Calc_test {
	public static void main(String[] args) {
		Calc calc = new Calc();
		
		int res_1 = calc.add(100, 200);
		long res_2 = calc.add(3,  9L);
		long res_3 = calc.add(9L, 9L);
		int res_4 = calc.add(1, 2, 3);
		
		System.out.println("res_1 : " + res_1 + ", res_2 : " + res_2 + ", res_3 : " + res_3 + ", res_4 : " + res_4);
	}
}
