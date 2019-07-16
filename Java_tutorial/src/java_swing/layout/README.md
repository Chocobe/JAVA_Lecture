# Java_swing

* [flow_layout](#flow_layout) - 순서대로 배치 하기 (연속배열)


* [border_layout](#border_layout) - 동, 서, 남, 북, 중앙 으로 배치하기


* [grid_layout](#grid_layout) - 행과 열의 컴포넌트 개수 지정하여 배치하기


* [box_layout](#box_layout) - x 또는 y 축으로 배치하기


* [card_layout](#card_layout) - 카드방식으로 배치하기

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

행과 열의 컴포넌트 개수 지정하여 배치하기

	* 행이나 열의 값이 0인 경우, 해당 방향으로 무한대로 배치한다.

:camel:[Top](#java_swing)

---
---

### box_layout

x 또는 y축으로 배치하기

	* BoxLayout.X_AXIS	- x축으로 배치
	
	* BoxLayout.Y_AXIS	- y축으로 배치
	
:camel:[Top](#java_swing)
	
---
---

### card_layout

카드 방식으로 배치하기

:camel:[Top](#java_swing)