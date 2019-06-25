package before_starting_java;

public class Tenacity_number {
	public static void main(String[] args) {
		// 고집수 구하기
		// 조건 1 : 10부터 99까지의 정수를 사용
		// 조건 2 : 10의 자리 수 * 1의 자리수 
		// 조건 3 : 1과 2의 과정 한번을 고집수가 한번 카운트된다.
		// 조건 4 : 결과값이 1의 자리수가 되면 연산은 종료된다.
		// 출력 : 고집수가 4 이상인 수를 모두 출력한다.
		
		final int BEGIN_NUM = 10;	// 최소값
		final int END_NUM = 100;	// 한계값
		
		int current_count = 0;		// 현재 대상값의 고집수 횟수
		int current_val = 0;		// 현재 대상값
		int total_count = 0;		// 조건을 만족하는 고집수 개수
		int lhs = 0;				// 10의 자리 숫자
		int rhs = 0;				// 1의 자리 숫자
		
		for(int i = BEGIN_NUM; i < END_NUM; i++) {
			current_val = i;
			current_count = 0;
			
			while(current_val > 10) {
				lhs = current_val / 10;
				rhs = current_val % 10;
				current_val = lhs * rhs;
				
				current_count++;
			}
			
			if(current_count >= 4) {
				total_count++;
				System.out.println(i);
			}
		}
		System.out.println("고집수 개수 : " + total_count);
	}
}
