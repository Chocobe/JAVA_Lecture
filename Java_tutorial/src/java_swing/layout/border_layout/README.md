# border_layout

해당 컨테이너의 방향에 따라 배치하는 방법이다.

---

``BorderLayout``으로 배치하기 위해서는 두가지의 설정이 필요하다.

	* 컨테이너의 배치 방식을 ``BorderLayout``으로 해준다.
	
	* ``컨테이너.add(컴포넌트, BorderLayout의 배치 상수값);`` 으로 위치를 지정해 준다.
	
---

``컨테이너.setLayout(new BorderLayout(int 수평간격, int 수직간격));``의 형식으로 컨테이너의 배치 방식을 설정한다.

수평간격과 수직간격은 각 컴포넌트간의 간격값이고, 

값을 주지 않을 경우에는 기본값으로 0이 된다.

---

``add``할 때 사용하는 상수값은 다음과 같다.

	* ``BorderLayout.CENTER``		- 중앙에 배치
	
	* ``BorderLayout.NORTH``		- 북쪽에 배치
	
	* ``BorderLayout.SOUTH``		- 남쪽에 배치
	
	* ``BorderLayout.WEST``		- 서쪽에 배치
	
	* ``BorderLayout.EAST``		- 동쪽에 배치 