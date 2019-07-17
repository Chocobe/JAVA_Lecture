# impl_ActionListener_itself

``JFrame``을 상속받는 클래스에서 ``ActionListener`` 인터페이스를 직접 구현하는 방법이다.

```java
public class MyFrame extends JFrame implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	}
}
```

---

``JTextField`` 객체의 폰트 설정하기

```
JTextField text_field = new JTextField();
Font font = new Font("돋움체", Font.PLAIN, 30);
text_field.setFont(font);
```

``Font``객체를 생성하여 ``JTextField``객체의 ``setFont()``메소드의 인자로 넣어주면 설정된다.

``Font`` 클래스 생성자의 인자값은 ``Font(String 폰트명, int 스타일 상수값, int 폰트 크기)`` 이다.