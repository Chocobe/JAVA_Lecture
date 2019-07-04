# Java_inheritance

* [point](#point) - 상속 받은 클래스 만들기


* [person](#person) - ``private`` 접근 제어자 사용하기


* [constructor](#constructor) - 자식 클래스의 객체를 생성시, 호출되는 부모 클래스 알아보기

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

업케스팅은 자식클래스의 객체를 부모클래스 형으로 바꾸는 것을 말한다.

기본 자료형의 케스팅과 다른점은..

``(부모클래스형)자식클래스 객체``의 형식으로 사용할 수 없고,

```java
Student student = new Student();
Person person = student;
```
의 형식으로 형변환을 한다. (업케스팅)

위의 문장에서 ``person``은 부모클래스의 객체이지만, 자식클래스가 업케스팅된 형태이다. 

:camel:[Top](#java_inheritance)