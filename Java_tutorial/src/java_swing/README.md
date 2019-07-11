# Java_swing

###한글

* [한글](#한글)

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

---
---

### 기본창 띄우기 (기본설정)

1. ``JFrame``을 상속받는다.

1. 생성자에 다음 3가지 세팅을 한다.

	1. ``this.setSize(x, y);`` : 창의 크기를 설정
	1. ``this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);`` : 종료 시, 모든 스레드도 같이 종료
	1. ``this.setVisible(true);`` : 창을 볼 수 있게 한다.
	
---
---

### 버튼 만들기

1. ``JButton button = new JButton();``으로 객체를 생성한다.

1. ``this.add(객체);``를 사용하여 프레임에 객체를 추가한다.