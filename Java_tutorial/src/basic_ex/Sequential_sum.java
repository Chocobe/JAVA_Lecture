package basic_ex;

//	2. 1~10 까지 합을 아래와 같이 출력하시오.
//	값	합
//	1	1
//	2	3
//	3	6
//	4	10
//	5	15

public class Sequential_sum {
	public static void main(String[] args) {
		int sum = 0;
		
		System.out.println("문제2] 1~10까지의 합 구하기");
		System.out.println("값\t합");
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
			System.out.print(i + "\t");
			System.out.println(sum);
		}
	}
}
