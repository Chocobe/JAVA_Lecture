# Java_polymorphism

* [up_down_cast](#up_down_cast) - 업케스팅과 다운케스팅 예제


* [instanceof_test](#instanceof_test) - ``instanceof``연산자로 참조변수의 형변환 가능 여부 검사하기


* [ex_TV](#ex_tv) - TV 클래스를 이용한 객체 생성 예제


* [polymorphism_1](#polymorphism_1) - 다형성 예제_1


* [polymorphism_2](#polymorphism_2) - 다형성 예제_2

---
---

### up_down_cast

업케스팅과 다운케스팅 예제

* 업 케스팅``(자식클래스 -> 부모클래스)`` : 형변환``(부모 클래스)``을 생략할 수 있다.

* 다운 케스팅``(부모클래스 -> 자식클래스)`` : 형변환``(자식 클래스)``를 무조건 명시해야 한다.

:camel:[top](#java_polymorphism)

---
---

### instanceof_test

``instanceof 연산자``를 사용하여 해당 참조변수(객체)의 형변환 가능 여부를 검사할 수 있다.

``검사할 객체 instanceof 형변환할 타입``

:camel:[Top](#java_polymorphism)

---
---

### ex_TV

TV 클래스를 이용한 객체 생성 예제

:camel:[Top](#java_polymorphism)

---
---

### polymorphism_1

다형성 예제_1

업케스팅 된 객체의 메소드 호출 테스트

업케스팅 된 객체의 메소드를 호출하게 되더라도, 해당 객체에 할당된 자식 클래스의 메소드가 호출된다.

만약, 부모 클래스의 메소드를 호출하고 싶다면, ``super.메소드``를 통해 부모 클래스의 메소드를 호출할 수 있다.

---
---

### polymorphism_2

다형성 예제_2