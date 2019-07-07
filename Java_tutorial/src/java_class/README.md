# Java_class

---

객체와 객체 간의 상호작용 - 메소드

* 클래스 설계 시 고려할 사항은,

	* 각 클래스의 속성에 대한 메소드
	
	* 각 객체간의 상호관계 방법 (전달할 매개변수와 반환할 데이터에 대한 고찰)
	
	* 클래스 설계는 ``고객 - 상품`` 간의 관계 라고 생각하자.

---

* [book](#book) - 클래스 만들기 1


* [tv](#tv) - 클래스 만들기 2


* [constructor](#constructor) - 생성자 사용하기


* [constructor_this_method](#constructor_this_method) - 클래스 자신의 생성자 호출 ``this()``


* [overloading](#overloading) - 한 클래스 내에 다수의 동일한 이름 메소드 만들기 


* [recursive](#recursive) - 자기 자신을 호출하는 메소드


* [reference_param](#reference_param) - 매개변수로 참조변수를 취하는 메소드 만들기


* [save_time](#save_time) - getter / setter 개념


* [getter_setter_ex_1](#getter_setter_ex_1) - getter / setter 예제_1


* [getter_setter_ex_2](#getter_setter_ex_2) - getter / setter 예제_2

---
---

### book

"책" 클래스를 생성, 속성값 저장, 속성값 반환 하기

---

클래스의 속성들은 ``private``을 사용하여, 캡슐화를 시키자.

각 객체의 속성에는 ``메소드``를 통해서만 수행하자. (메소드명에 접두사 get, set으로 명시)

:camel:[Top](#java_class)

---
---

### tv

클래스 TV를 통해 객체 생성하기 - 맴버 변수, 메소드 사용하기

---

클래스의 정보 은닉.

멤버변수의 의도하지 않은 변경을 막기 위해

멤버변수를 ``private``으로 만들고,

이 멤버변수의 접근은 getter / setter 메소드를 통해서만 수행한다.

:camel:[Top](#java_class)

---
---

### constructor

객체를 생성할 시, 객체의 멤버변수를 초기화 시켜주는 생성자

:camel:[Top](#java_class)

---
---

### constructor_this_method

생성자에서 다른 생성자를 호출 하는 메소드 ``this()``

:camel:[Top](#java_class)

---
---

### overloading

같은 클래스 내에서 동일한 이름의 메소드 만들기 - 메소드의 활용성을 높이는 방법 

:camel:[Top](#java_class)

---
---

### recursive

메소드가 자기 자신을 다시 호출하는 방식의 활용법

:camel:[Top](#java_class)

---
---

### reference_param

매개변수로 기본 자료형이 아닌, 참조형 사용하기

:camel:[Top](#java_class)

---
---

### save_time

정보은닉을 위한 getter/setter 만들기

---

``String.format(매개변수)`` 활용하기

:camel:[Top](#java_class)

---
---

### getter_setter_ex_1

정보 은닉을 위해 클래스의 멤버변수의 ``접근 제어자``를 ``private``으로  선언한 경우,

해당 멤버변수에 접근하기 위한 메소드 만들기 예제_1

:camel:[Top](#java_class)

---
---

### getter_setter_ex_2

정보 은닉을 위해 클래스의 멤버변수의 ``접근 제어자``를 ``private``으로  선언한 경우,

해당 멤버변수에 접근하기 위한 메소드 만들기 예제_2

(입력``(Scanner 객체)``에 대한 예외 처리 하기)

:camel:[Top](#java_class)