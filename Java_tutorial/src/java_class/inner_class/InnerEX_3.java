package java_class.inner_class;

public class InnerEX_3 {
	private int outer_val = 3;
	private static int outer_static_val = 4;
	
	// 내부 인스턴스 클래스
	class InstanceInner {
		// 외부 클래스의 private 멤버 변수도, 내부 클래스에서 접근 가능
		int inner_val = outer_val;
		int inner_static_val = outer_static_val;
	}
	
	
	// 내부 스테틱 클래스
	static class StaticInner {
		// 내부 스테틱 클래스에서는, 외부의 인스턴스 멤버에 접근 불가
		// int inner_val = outer_val;
		int inner_static_val = outer_static_val;
	}
	
	
	void method() {
		int lv = 2;
		final int LV = 2;
		
		// 지역 클래스
		class LocalInner {
			// 외부 클래스의 private 멤버도 접근 가능
			int liv_1 = outer_val;
			int liv_2 = outer_static_val;
			
			// 지역 클래스가 포함된 메소드의 지역변수는, final(상수) 변수만 접근 가능
			// 만약, final(상수) 변수가 아닌데 접근했다면, 컴파일러가 final을 붙여서 사용하게 된다.
			// final 변수로 변경됬기 때문에, 이 변수를 변경하려 한다면, 에러가 발생한다.
			// 결국, 지역 클래스는 자신을 포함한 메소드의 final 변수만 사용할 것을 인지해야 한다.
			
			// int liv_3 = lv;
			int liv_4 = LV;
		}
	}
}
