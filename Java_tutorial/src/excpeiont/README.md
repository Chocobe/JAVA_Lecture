# Exception_handling

* [try_catch_1](#try_catch_1) - ``try ~ catch`` 사용하기


* [throw](#throw) - 현재 메소드를 호출한 메소드에 예외상황 전달하기


* [finally](#finally) - ``try ~ catch``문 이후, 공통으로 실행할 코드 작성하기


* [MyException](#myexception) - 사용자 정의 예외 클래스 만들기


* [Exception_text_1](#exception_test_1)


---
---

예외 처리 구문 ``try ~ catch``

---

* 에러(error) : 수습될 수 없는 심각한 오류

* 예외(exception) : 수습될 수 있는 다소 미약한 오류

---

* 컴파일 에러 : 컴파일 시에 발생하는 에러

* 런타임 에러 : 실행 시에 발생하는 에러

* 논리적 에러 : 실행은 되지만, 의도와 다르게 동작하는 것

---

* ``Exception 클래스들`` - 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외

* ``RuntimeException`` - 프로그래머의 실수에 의해 발생하는 예외

---

* 예외처리(Exception handling)의 정의
	
	* 프로그램 실행 시 발생할 수 있는 예외에 대비한 코드를 작성하는 것
	
* 예외처리(Exception handling)의 목적

	* 프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것
	
:camel:[Top](#exception_handling)

---
---

### try_catch_1

예외처리가 되지 않은 상황이 발생하면, 프로그램은 강제 종료된다.

예외상황이 발생하더라도 프로그램을 정상 동작하도록 처리를 할 수 있는데, 이러한 방법을 **예외처리**라고 한다.

``try ~ catch``구문을 사용하는데,

``try``에는 예외가 발생할 수 있는 문장을 넣고, ``try``안쪽에서 예외가 발생하게 되면,

``catch``문에서 해당 예외를 찾는다.

``catch``에서 예외가 처리될 경우에는 프로그램은 강제종료 되지 않고, 정상 동작을 유지하게 된다.

:camel:[Top](#exception_handling)

---
---

### throw

``throw``는 프로그래머가 고의로 예외를 발생시키는 키워드이다.

``throw 예외객체;``의 문장을 사용하면, 해당 예외상황이 발생된다.

---

주의할 점은, ``throw``는 예외를 처리하는 것이 아니라,

발생한 예외를 자신을 호출했던 메서드에게 넘겨주는 것 뿐이다.

즉, 발생한 예외는 어느 한 곳에서는 반드시 ``try ~ catch``되어야만 **예외처리**가 되는 것이다.

:camel:[Top](#exception_handling)

---
---

### finally

``try ~ catch``구문에서, 예외가 발생하든 말든 실행되어야 하는 코드가 있을 수 있다.

즉, ``try``에서 정상종료가 되어도, ``catch``에서 예외처리가 되어도

동일한 작업이 수행 되어야 하는 경우에 사용하는 키워드가 ``finally``다.

``finally``는 ``return``키워드가 실행 되어도, 해당 메소드가 종료되기 전에 실행 된다.

:camel:[Top](#exception_handling)

---
---

### MyException

사용자 정의 예외 만들기

예외 클래스들은 ``Exception``클래스를 상속받아 만들어 진다.

사용자가 원하는 예외 클래스를 만들 때 역시, ``Exception``클래스를 상속받아 만들 수 있다.

```java
class MyException extends Exception {
	public MyException(String _message) {
		super(_message);
	}
}
```
위의 형태로 사용자 예외 클래스를 만들 수 있다.

:camel:[Top](#exception_handling)

---
---

### Exception_test_1

사용자 정의 예외 만들기 예제

:camel:[Top](#exception_handling)