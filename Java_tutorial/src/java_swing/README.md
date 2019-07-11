# Java_swing

* [basic_window](#basic_window)


* [button](#button)


* [panel](#panel)


* [FlowLayout_test](#flowlayout_test)


* [Center_frame](#center_frame)


* [BoxLayout_test](#boxlayout_test)


* [GridLayout_test](#gridlayout_test)


* [CardLayout_test](#cardlayout_test)

---
---

		java의 GUI API.
		Java_swing은 AWT를 상속받아 만들어 졌다.
		AWT의 각 메소드명에 접두사로 J를 붙이면, swing의 메소드가 된다. 

* 기본 컨테이너 : 

	* JButton
	* JLable
	* JCheckbox
	* JChoice
	* JList
	* JMenu
	* JTextField 
	* ...


* 컨테이너 컴포넌트 : 다른 컴포넌트를 포함할 수 있는 컴포넌트

	* JFrame
	* JDialog
	* JApplet
	* JPanel : 객체를 묶는 기능		
	* JScrollPane 
	* ...
	

* 최상위 컨테이너 : 다른 컨테이너에 절대 포함될 수 없는 컨테이너

	* JFrame
	* JDialog
	* JApplet
	

* 패널 : 공통적인 컴포넌트를 포함할 수 있는 컨테이너

:camel:[Top](#java_swing)

---
---

### basic_window
### (기본창 띄우기)

1. ``JFrame``을 상속받는다.

1. 생성자에 다음 3가지 세팅을 한다.
	1. ``this.setSize(x, y);`` : 창의 크기를 설정
	1. ``this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);`` : 종료 시, 모든 스레드도 같이 종료
	1. ``this.setVisible(true);`` : 창을 볼 수 있게 한다.
	
:camel:[Top](#java_swing)
	
---
---

### button
#### (버튼 만들기)

1. ``JButton button = new JButton();``으로 객체를 생성한다.

1. ``this.add(객체);``를 사용하여 프레임에 객체를 추가한다.

:camel:[Top](#java_swing)

---
---

### panel
#### (패널)

1. ``JPanel panel = new JPanel();``로 패널을 생성한다.

1. ``panel.add(추가할 객체);``로 패널에 객체를 추가한다.

:camel:[Top](#java_swing)

---
---

### FlowLayout_test
#### (순서대로 정렬하기)

``this.setLayout(정렬방식을 표현하는 객체);``의 형식이다.

프래임상의 객체를 순서대로 중앙 정렬하는 코드는 다음과 같다.

``this.setLayout(new FlowLayout(FlowLayout.CENTER));``

---

패널상의 객체들을 정렬할때는 ``this``대신 ``panel명``으로 사용하면 된다.

``my_panel.setLayout(new FlowLayout(FlowLayout.CENTER));``

---

``new FlowLayout(인수)``의 인수값은 ``FlowLayout``의 상수값을 사용하는데,

		FlowLayout.CENTER
		FlowLayout.LEFT
		FlowLayout.RIGHT
		FlowLayout.LEADING
		FLowLayout.TRAINLING
		
:camel:[Top](#java_swing)

---
---

### Center_frame

---
---

### BoxLayout_test

---
---

### GridLayout_test

---
---

### CardLayout_test