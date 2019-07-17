package java_class.inner_class;

import static java.lang.System.out;

public class InnerEx_1 {
// 내부 클래스	
	
	// 인스턴스 클래스
	class Instance_inner {
		int vi = 100;
		// static int cv = 100;		<- 내부 클래스 중, 인스턴스 클래스는 static 변수를 가질 수 없다.
		final static int CONST = 100;
	}
	
	// 스테틱 클래스
	static class Static_inner {
		int iv = 200;
		static int cv= 200;		// 스테틱 클래스는 static 변수 사용 가능
	}
	
	void method() {
		// 지역 클래스
		@SuppressWarnings("unused")
		class Local_inner {
			int vi = 300;
			// static int cv = 300;	<- 내부 클래스는 스테틱 클래스만 static 변수를 가질 수 있다.
			final static int CONST = 300;
		}
	}
	
	
	public static void main(String[] args) {		
		out.println("Instance_inner의 CONST : " + Instance_inner.CONST);
		out.println("Static_inner의 static 변수 : " + Static_inner.cv);		
	}
}
