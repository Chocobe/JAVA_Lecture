package before_starting_java;

public class OperatorEx1 {
	public static void main(String[] args) {
		int i = 5, j = 5;
		int res = ++i;
		int res2 = j++;
		
		System.out.println("i = " + i);
		System.out.println("res = " + res);
		System.out.println("j = " + j);
		System.out.println("res2 = " + res2);
		
		System.out.println("-----------------------------");
		
		i = 5;
		j = 0;
		j = i++;
		System.out.println("j = i++; 실행 후, i = " + i + ", j = " + j);
		
		i = 5;
		j = 0;
		j = ++i;
		System.out.println("j = ++i; 실행 후, i = " + i + ", j = " + j);
		
		
		
		
	}
}
