# Constructor_this

* 생성자에서 다른 생성자를 호출하는 메서드 ``this()`` 이다.

* 생성자 호출을 ``this()``로 할 수 있다.

* 한 생성자에서 다른 생성자를 호출할 때(``this()``), 반드시 첫 줄에서만 호출할 수 있다.

```java
public Car() {
	this(설정할 기본값, 설정할 기본값);
}

public Car(int _a) {
	this(a, 설정할 기본값);
	// this(설정할 기본값, a); 도 가능	
}

public Car(int _a, int _b) {
	this.a = _a;
	this.b = _b;
}