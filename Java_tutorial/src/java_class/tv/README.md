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