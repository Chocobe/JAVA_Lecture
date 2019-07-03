# TV

* [TV_lg](#tv_lg) - TV_lg 클래스


* [TV_samsung](#tv_samsung) - TV_samsung 클래스


* [TV_test_1](#tv_test_1) - 멤버변수의 private 테스트


* [TV_test_2](#tv_test_2) - private 멤버변수 접근 텐스트


* [TV_Array_test](#tv_array_test) - 객체 배열

---
---

### TV_lg

TV_lg 클래스 작성

private으로 멤버변수를 구성

---

오버라이딩(overriding) : 상속받은 메소드를 자식 클래스에서 재정의 하여 사용하는 방법

모든 클래스가 상속받는 ``Class Object``의 메소드 중, ``toString()``을 재정의 해 보자.

```java
public String toString() {
	return System.out.println("문자열");
}
```

상위 클래스의 메소드를 재정의 할 경우, 재정의한 기능으로 동작된다.

주의해야 할 점은, 오버라이딩(overriding) 이전의 기능은 사라지고, 재정의한 기능으로 동작 된다는 점이다.

* eclipse의 오버라이딩(overriding) 기능으로 ``toString()`` 재정의 예제

	1. 입력할 위치에 마우스 우클릭
	2. source -> Generate toString()..
	3. 생성된 코드를 정의한다.

이 방법은 eclipse의 기능을 사용한 것이고, 원래는 직접 작성해야 한다.

:camel:[Top](#tv)

---
---

### TV_samsung

TV_samsung 클래스 작성

기본으로 설정된 멤버변수로 구성

:camel:[Top](#tv)

---
---

### TV_test_1

멤버변수의 private / 기본에 대한 비교

:camel:[Top](#tv)

---
---

### TV_test_2

private으로 구성된 멤버변수에 접근하기 위해,

private으로 된 각 멤버변수의 getter/setter 메소드를 호출하여 접근한다.

이를 ``정보은닉``이라고 한다.

:camel:[Top](#tv)

---
---

### TV_Array_test

객체 배열 테스트

기본형의 배열인 int[], char[], double[] 등과 같이,

객체도 배열로 생성하여 사용할 수 있다.

```java
TV_lg[] tv_arr = new TV_lg[3];
tv_arr[0] = new TV_lg();
tv_arr[1] = new TV_lg();
tv_arr[2] = new TV_lg();
```

기본형의 배열과 동일하게 사용하면 된다.

:camel:[Top](#tv)