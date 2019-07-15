# Java_swing

* [flow_layout](#flow_layout) - 순서대로 배열 하기 (연속배열)


* [border_layout](#border_layout) - 동, 서, 남, 북, 중앙 으로 배치하기


* [GridLayout](#gridlayout) - 


* [BoxLayout_test](#boxlayout_test)


* [CardLayout_test](#cardlayout_test)

---
---


:camel:[Top](#java_swing)

---
---

### flow_layout

순서대로 배열 하기 (연속 배치 방식)

``setLayout(new FlowLayout(정렬 상수값));``의 형식

* 정렬 상수값

	* FlowLayout.LEFT		- 좌측 정렬
	
	* FlowLayout.CENTER	- 중앙 정렬
	
	* FlowLayout.RIGHT	- 우측 정렬	

:camel:[Top](#java_swing)

---
---

### border_layout

동, 서, 남, 북, 중앙 으로 배치하기 (공간 배치 방식)

```java
setLayout(new BorderLayout(int 수평간격, int 수직간격));
컨테이너.add(배치할 컴포넌트, BorderLayout 정렬 상수값);
```

* 정렬 상수값

	* BorderLayout.CENTER		- 중앙 정렬
	
	* BorderLayout.NORTH		- 북쪽 정렬
	
	* BorderLayout.SOUTH		- 남쪽 정렬
	
	* BorderLayout.WEST		- 서쪽 정렬
	
	* BorderLayout.EAST		- 동쪽 정렬
	
:camel:[Top](#java_swing)

---
---

### grid_layout

---
---

### BoxLayout_test

---
---

### CardLayout_test

---
---

## event
### ActionEvent_test