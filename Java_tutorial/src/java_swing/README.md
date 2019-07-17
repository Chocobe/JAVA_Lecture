# java_swing

	* java의 GUI API.
	* Java_swing은 AWT를 상속받아 만들어 졌다.
	* AWT의 각 메소드명에 접두사로 J를 붙이면, swing의 메소드가 된다. 
		
---

* [gui](#gui)


* [layout](#layout)


* [ActionEvent](#actionevent)

---
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


* 어뎁터 클래스 용도 : 
	
	인터페이스를 구현하게 되면, 인터페이스의 모든 추상 메소드를 구현해야 하지만,
	어뎁터 클래스를 사용하게 되면, 해당 인터페이스의 메소드 중 필요한 것만 뽑아서 사용할 수 있다.
	
:camel:[Top](#java_swing)
	
---
---

### gui

JAVA를 이용한 GUI 프로그램 만들기 기본 (컴포넌트)

:camel:[Top](#java_swing)

---
---

### layout

컨테이너의 정렬 방법 5가지

	* FlowLayout
	
	* BorderLayout
	
	* GridLayout
	
	* BoxLayout
	
	* CardLayout
	
:camel:[Top](#java_swing)
	
---
---

### ActionEvent

``ActionListener`` 인터페이스를 구현하여, event 발생 및 동작 시키기

:camel:[Top](#java_swing)