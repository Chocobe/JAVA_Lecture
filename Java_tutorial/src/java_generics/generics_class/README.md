# generics_1

* Generics란?

	* Generics는 메서드나 클래스에서 다루는 **타입**을 컴파일 시에 **타입체크(compile-time type check)**를 해주는 기능이다.

		1. **타입의 안정성**을 제공한다.
	
		1. 타입체크와 형변환을 생략할 수 있어서, **코드가 간결**해 진다.
	
---

* Generics의 제한

	1. ``static``변수에는 Generics를 사용할 수 없다.
	(타입변수(Generics)는 **인스턴스 변수**이기 때문이다. - ``static``변수는 인스턴스변수를 참조할 수 없다)
	
	1. 타입변수(Generics)의 배열은 선언만 가능하고, 생성(할당, new)는 불가능 하다.
	(new 연산자는 컴파일 시에 자료형을 정확히 알아야 하기 때문이다)
	
	1. instanceof 연산자 역시, new 연산자와 동일한 이유로 타입변수(Generics)를 사용할 수 없다.
	
:camle:[Top](#generics_1)

---

* [FruitBoxEx1](#fruitboxex1)

---

### FruitBoxEx1

Generic 예제_1

:camel:[Top](#generics_1)