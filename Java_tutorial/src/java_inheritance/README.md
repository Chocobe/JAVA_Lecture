# Java_inheritance

* 상속에 대한 예문

	* 원은 좌표상에 존재한다.
	
	* 좌표는 x, y의 두 점이다.
	
	* x, y상에 원이 존재한다.
	
	* x, y : 점이다.
	
	* 원 : x, y, 반지름 을 가진다.
	
	* 사각형 : x, y 가로변, 세로변 을 가진다.
	
	* 공통부분 : x, y
	
	* 기능 : ``도형을 그리다``
	
	* 위의 내용을 상속, 관계로 표현을 하면
	
		* Class 좌표
		
		* Class 모양(추상적 의미)
		
		* Class 도형
		
			* 도형 is a 모양
			
			* 도형 has a 좌표
			
---
---

* [point](#point) - 상속 받은 클래스 만들기


* [person](#person) - ``private`` 접근 제어자 사용하기


* [constructor](#constructor) - 자식 클래스의 객체를 생성시, 호출되는 부모 클래스 알아보기


* [up_casting](#up_casting) - ``자식클래스 형 객체 -> 부모 클래스 형 객체``로 형변환 하기


* [down_casting](#down_casting) - ``부모 클래스 형 객체 -> 자식 클래스 형 객체``로 형변환 하기


* [class_relationship_1](#class_relationship_1) - 클래스의 상속과 포함 관계 예제_1


* [class_relationship_2](#class_relationship_2) - 클래스의 상속과 포함 관계 예제_2


* [super_test](#super_test) - ``멤버변수의 이름``, ``this.멤버변수 이름``, ``super.멤버변수 이름`` 구분하기

---
---

### point

상속 받은 클래스 만들기

:camel:[Top](#java_inheritance)

---
---

### person

``private`` 접근 제어자 사용하기

``private`` 접근 제어자는 자기 자신 이외, 상속받은 클래스에서 조차 접근이 불가능 하다.

때문에 ``private``멤버변수는 getter/setter 메소드를 통해서 접근하게 된다.

:camel:[Top](#java_inheritance)

---
---

### constructor

자식 클래스의 객체를 생성시, 호출되는 부모 클래스 알아보기

자식 클래스의 생성자에서 부모클래스의 특정 생성자를 지정할 수 있다.

``super(매개변수)``메소드(부모 클래스 생성자 호출 키워드)를 사용함으로써, 매개변수와 동일한 부모클래스의 생성자를 호출해 주는 것이다. 

주의할 점은, ``this(매개변수)``의 사용과 같이 **첫 줄**에서만 사용할 수 있다는 것이다.

:camel:[Top](#java_inheritance)

---
---

### up_casting

업케스팅은 자식클래스의 객체를 부모클래스 형으로 형변환 하는 것을 말한다.

기본 자료형의 케스팅과 다른점은..

``(부모클래스형)자식클래스 객체``의 형식으로 **사용할 수 없고**,

``부모 클래스 형 객체 = 자식 클래스 객체``의 방식으로 사용한다.

```java
Student student = new Student();
Person person = student;
```
의 형식으로 형변환을 한다. (대입)

위의 문장에서 ``person``은 부모클래스의 객체이지만, 자식클래스가 업케스팅된 형태이다. 

:camel:[Top](#java_inheritance)

---
---

### down_casting

다운 케스팅은 부모클래스 형인 객체를 자식 클래스 형으로 형변환 하는 것이다.

다운 케스팅의 경우는 명시적 형변환과 유사한 문법으로 사용한다.

``부모 클래스 형인 객체 = (부모 클래스 형)자식 클래스 객체``

다운 케스팅의 중요한 조건은...

해당 객체가 **업케스팅 된 객체**여야 한다는 점이다.

:camel:[Top](#java_inheritance)

---
---

### class_relationship_1

클래스의 상속과 포함 관계 예제_1

도형 만들기

:camel:[Top](#java_inheritance)

---
---

### class_relationship_2

클래스의 상속과 포함 관계 예제_2

카드 랜덤으로 뽑기

:camel:[Top](#java_inheritance)

---
---

### super_test

``멤버변수의 이름``으로 호출하기, ``this.멤버변수 이름``으로 호출하기, ``super.멤버변수 이름``으로 호출하기 구분하기

``멤버변수의 이름``은 ``this.멤버변수 이름``으로 호출하는 것과 같고, 객체 자신의 멤버변수를 호출하게 된다.

``super.멤버변수 이름``으로 호출하게 되면, 부모 객체의 멤버변수를 호출하게 된다. 