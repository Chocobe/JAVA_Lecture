# GUI

* [Frame_test](#frame_test)


* [Button_test](#button_test)


* [Panel_test](#panel_test)


* [Label_test](#label_test)


* [Enable_button](#enable_button)


* [Text_field](#text_field)

---
---

### Frame_test

프래임 생성하기

:camel:[Top](#gui)

---
---

### Button_test

버튼 생성하기

:camel:[Top](#gui)

---
---

### Panel_test

패널 생성하기

:camel:[Top](#gui)

---
---

### Label_test

레이블 생성하기

:camel:[Top](#gui)

---
---

### Enable_button

버튼 비활성화 하기

:camel:[Top](#gui)

---
---

### Text_field

택스트 입력 상자 만들기

:camel:[Top](#gui)

---
---

ActionListener 구현 위치 

* 독립적으로 만들 때,
	
	장점 : 여러 객체가 사용할 때 좋다.
	단점 : ActionLister를 구현한 클래스의 내부 변수들을 참조하기 어렵다.
	
* 내부(내부 클래스)에 만들 때,

	장점 : 내부 변수를 참조하기 쉽다.
	단점 : 복잡하다.
	
* Frame이 직접 구현할 때,

	JFrame을 상속 받으면서, ActionListener까지 구현하는 방식
	
---
---

어뎁터 클래스 용도 : 
	
	인터페이스를 구현하게 되면, 인터페이스의 모든 추상 메소드를 구현해야 하지만,
	어뎁터 클래스를 사용하게 되면, 해당 인터페이스의 메소드 중 필요한 것만 뽑아서 사용할 수 있다.
	
	