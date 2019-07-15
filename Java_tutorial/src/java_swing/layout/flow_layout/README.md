# FlowLayout

배치 관리자 클래스 중, ``FlowLayout``을 만들자.

``FlowLayout`` 클래스는 객체들을 **연속적으로 배치**하는 방식이다.

``new FlowLayout()``를 사용하여 생성할 수 있다.

배치 설정을 하고자 하는 컴포넌트 객체의 ``setLayout()``매서드의 인수로 사용하면 적용된다.

---

``FlowLayout``의 정렬 방식은 3가지가 있다.

	* ``FlowLayout.LEADING``	- 왼쪽 정렬
	
	* ``FlowLayout.CENTER``	- 중앙 정렬
	
	* ``FlowLayout.TRAILING``	- 오른쪽 정렬
	
``FlowLayout(int 정렬값 상수)``의 형식으로 생성자에 사용 시, 적용된다.

---

정렬되는 컴포넌트들은 수평간격과 수직간격을 가지는데, 기본값은 각각 5이다.

``FlowLayout()``생성자를 통해서 설정 가능한데,

``FlowLayout(int 정렬방식, int 수평간격값, int 수직간격값)``의 형식으로 만들 수 있다.