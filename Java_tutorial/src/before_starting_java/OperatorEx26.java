package before_starting_java;

public class OperatorEx26 {
	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
		System.out.printf("a = %d, b = %d%n", a, b);
		System.out.printf("a != 0 || ++b != 0 = %b%n%n", a != 0, ++b != 0);
		System.out.printf("a = %d, b = %d%n", a, b);
		System.out.printf("a == 0 && ++b != 0 = %b%n%n",  a == 0, ++b != 0);
		System.out.printf("a = %d, b = %d%n",  a, b);
	}
}
