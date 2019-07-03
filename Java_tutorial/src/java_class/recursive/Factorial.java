package java_class.recursive;

public class Factorial {
	public static void main(String[] args) {
		
		int target_num = 10;
		int factorial_num = 0;
		System.out.print(target_num + "! = ");
		
		factorial_num = factorial(target_num);
		System.out.println(factorial_num);
	}
	
	
	// factorial
	public static int factorial(int _target_num) {
		if(_target_num == 1) {
			System.out.print("1 = ");
			return 1;			
		}
		
		System.out.print(_target_num + " * ");
		return _target_num * factorial(_target_num - 1);
	}
}
