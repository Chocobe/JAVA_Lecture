# Thread

프로그램의 실제 작업을 수행하는 것을 **쓰레드(Thread)**라고 한다.

쓰레드를 구현하기 위해서는 ``Thread``클래스를 상속 받거나,

``Runnable``인터페이스를 구현해야 한다.

* ``Thread``클래스를 상속받아 쓰레드 구현하기

	1. ``Thread``클래스를 상속받은 클래스에서 ``Thread``클래스의 메소드인 ``run()``메소드를 오버라이딩한다.
	
	1. ``main()``메소드에서 ``Thread``클래스를 상속받은 객체를 생성한다.
	
	1. ``Thread``클래스를 상속받은 객체의 ``start()``메소드를 실행하면, 쓰레드가 구현된 프로그램이 실행된다.
	
* ``Runnable``인터페이스를 구현하여 쓰레드 구현하기

	1. ``Runnable``인터페이스를 구현한 방법은 ``Thread``를 상속받는 방법과 객체 생성방법이 다르다.
	
		* ``Runnable_구현_클래스  객체명  =  new Thread(new Runnable_구현_클래스());
		
	1. 생성된 객체의 ``start()`` 메소드를 실행하면 쓰레드가 구현된 프로그램이 실행된다.

---
---

* [thread_basic](#thread_basic)


* [thread_swing](#thread_swing)


* [runnable_basic](#runnable_basic)


* [multi_thread_test_1](#multi_thread_test_1)


* [multi_thread_test_2](#multi_thread_test_2)

---
---

### thread_basic

``Thread``클래스를 상속받아 쓰레드 구현 예제_1

타이머 만들기

:camel:[Top](#thread)

---
---

### thread_swing

``Thread``클래스를 상속받아 쓰레드 구현 예제_2

타이머 만들기

:camel:[Top](#thread)

---
---

### runnable_basic

``Runnable``인터페이스를 구현하여 쓰레드 구현 예제_1

타이머 만들기

:camel:[Top](#thread)

---
---

### multi_thread_test_1

* ''Thread``클래스를 상속받아 쓰레드 구현 예제_3

	* 쓰레드 객체를 여러개 생성하여 수행과정 살펴보기

:camel:[Top](#thread)

---
---

### multi_thread_test_2

* ``Runnable``인터페이스를 구현한 쓰레드 구현 예제_2

	* 쓰레드 객체를 여러개 생성하여 종료점 비교하기
	
:camel:[Top](#thread)

---
---

### multi_thread_test_3

* ``Runnable``인터페이스를 구현한 쓰레드 구현 예제_3

	* JLabel의 인스턴스 메소드인 ``setOpaque(true);`` 살펴보기
	
	* 공부 필요
	
---
---

### thread_information

* 현재 쓰레드의 정보값 가져오기

---
---

### thread_interrupt

* 쓰레드를 정지시키는 기능

	* 공부 필요