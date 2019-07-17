# inner_class

클래스 내부에 작성한 새로운 클래스를 내부 클래스 라고 한다.

내부 클래스는 외부 클래스(원래의 클래스)의 멤버로써 취급된다.

그러므로, 외부 클래스의 ``static 메소드``에서는 ``static 클래스``만 사용할 수 있고,

``인스턴스 메소드``에서는 ``인스턴스 클래스``와 ``static 클래스`` 모두 사용가능하다.

* 내부 클래스 종류

	* 인스턴스 클래스 
	
	* 스테틱 클래스
	
	* 지역 클래스
	
	* 익명(무명) 클래스

---

* [InnerEx_1](#innerex_1)


* [InnerEx_2](#innerex_2)


* [InnerEx_3](#innerex_3)


* [anonymous_class](#anonymous_class)

---
---

### InnerEx_1

내부 클래스 예제_1

:camel:[Top](#inner_class)

---
---

### InnerEx_2

내부 클래스 예제_2

외부 클래스의 인스턴스 메소드 안에서는, ``내부 인스턴스 클래스``, ``내부 스테틱 클래스`` 모두 접근 가능

외부 클래스의 스테틱 메소드 안에서는, ``내부 스테틱 클래스``만 접근 가능 

:camel:[Top](#inner_class)

---
---

### InnerEx_3

``지역 클래스``도 ``내부 클래스``와 같이, 외부 클래스의 ``인스턴스 멤버``와 ``스테틱 멤버`` 모두 접근 가능하다.

다만, ``지역 클래스``가 포함되어 있는 메소드의 ``final 변수``만 접근 가능 하다.

:camel:[Top](#inner_class)

---
---

### anonymous_class

무명 클래스 사용하기

무명 클래스는 클래스 파일을 따로 작성하지 않고, 필요한 곳에서 이름없이 작성하는 클래스 이다.

때문에, 단 한번만 사용하고 오직 하나뿐이 없는 객체로 만들 수 있다.

즉, 일회용 클래스이다.

---

무명 클래스는 하나의 클래스 또는 하나의 인터페이스만 구현할 수 있다.

---

무명 클래스를 작성하는 방법 다음과 같다.

객체를 생성하는 ``new``키워드 뒤에 생성자를 호출하는데,

이때 호출 하는 생성자를 정의하고, 바로 뒤에 구현하면 된다.

```java
Button button = new Button("Start");
button.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occured");
	}
});
```

:camel:[Top](#inner_class)