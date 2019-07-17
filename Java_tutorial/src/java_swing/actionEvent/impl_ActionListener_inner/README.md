# impl_ActionListener_inner

``JFrame``을 상속받는 클래스의 내부에 ``ActionListener``인터페이스를 구현하는 내부클래스로 구현하는 방법이다.

```java
public class MyFrame extends JFrame {

	class MyListener implements ActionListener {
	
		@Override
		public void actionPerformed(ActionEvent e) {
		
		}
	}
}
```

``ActionListener``인터페이스를 구현한 클래스의 객체가 동작하는 것임을 헷갈리지 말자