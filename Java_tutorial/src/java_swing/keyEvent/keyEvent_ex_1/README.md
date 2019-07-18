# keyEvent

키보드의 입력에 따라 동작하는 Event이다.

``KeyListener`` 인터페이스를 구현하여 키보드 입력에 대한 이벤트를 만들 수 있다.

``keyListener`` 인터페이스는 총 3개의 추상 메소드를 가진다.

	1. ``keyTyped(KeyEvent e)``
		:사용자가 (아무)키를 입력했을 떄 호출 (KeyEvent의 상수값 ``keycode``는 가져오지 못한다.
	
	2. ``keyPressed(KeyEvent e)``
		: 사용자가 키를 눌렀을 때 호출
	
	3. ``keyReleased(keyEvent e)``
		: 사용자가 키에서 손을 뗐을 때 호출
	
---

``KeyListener`` 의 추상 메소드들의 인수타입 ``KeyEvent`` 객체의 메소드는 다음과 같다.

	1 ``int getKeyChar()``			: ``KeyEvent``객체에 들어있는 문자(char형 유니코드)를 반환한다.
	
	2. ``int getKeyCode()``			: ``KeyEvent``객체에 있는 ``키코드(keycode)``를 반환한다. - ``VK_키``
	
	3. ``boolean isActionKey()``	: 
		이벤트를 발생시킨 객체(e)가 액션키일 때 ``true``를 반환한다.
		(액션키란, ``Paste``, ``Page Up``, ``Caps Lock``, ``화살표``, ``function key``를 의미한다)