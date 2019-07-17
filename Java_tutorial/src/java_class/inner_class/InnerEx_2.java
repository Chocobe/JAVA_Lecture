package java_class.inner_class;

public class InnerEx_2 {
	// 내부 인스턴스 클래스
	class InstanceInner { }
	
	// 내부 스테틱 클래스
	static class StaticInner { }
	
	// 외부 클래스의 멤버로 만들기 - 내부 인스턴스 클래스, 내부 스테틱 클래스 모두 가능
	InstanceInner iv = new InstanceInner();
	StaticInner cv = new StaticInner();
	
	
	// 외부 클래스의 스테틱 메소드에서는, 내부 스테틱 클래스만 접근 가능
	@SuppressWarnings("unused")
	public static void static_method() {
		
		// 스테틱 메소드 내부에서는, 내부 인스턴스 메소드에 접근 불가
		// InstanceInner obj_1 = new InstanceInner();
		
		// 스테틱 메소드 내부에서는, 내부 스테틱 메소드만 접근 가능
		StaticInner obj_2 = new StaticInner();
	}
	
	
	// 외부 클래스의 인스턴스 메소드에서는, 내부 인스턴스 클래스 / 내부 스테틱 클래스 모두 접근 가능
	public void instance_method() {
		
		@SuppressWarnings("unused")
		InstanceInner obj_1 = new InstanceInner();
		@SuppressWarnings("unused")
		StaticInner obj_2 = new StaticInner();
	}
	
	
	public static void main(String[] args) {
		// 지역 클래스
		class LocalInner { }
		
		// 지역 클래스는 동일한 지역에서만 접근 가능
		
		@SuppressWarnings("unused")
		LocalInner lv = new LocalInner();
	}
}
