# GUI

* [Frame_test](#frame_test) - ``JFrame``만들기


* [Button_test](#button_test) - ``JButton``만들기


* [Panel_test](#panel_test) - ``JPanel``만들기


* [Label_test](#label_test) - ``JLabel``만들기


* [Enable_button](#enable_button) - ``JButton`` 비활성화 시키기


* [Text_field](#text_field) - ``JTextField``만들기

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
		