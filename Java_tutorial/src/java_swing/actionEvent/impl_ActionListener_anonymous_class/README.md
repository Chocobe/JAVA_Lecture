# impl_ActionListener_anonymous_class

``ActionListener`` 인터페이스를 무명 클래스로 구현하는 방법이다.

```java
public class MyFrame extends JFrame {

	ActionListener action_listener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	};
```

위와 같이 무명클래스를 사용하여 ``ActionListener`` 인터페이스를 구현한 객체를 생성한다.

	* 무명클래스의 설명은 ``java_class`` -> ``inner_class`` -> ``anonymous_class`` 참고