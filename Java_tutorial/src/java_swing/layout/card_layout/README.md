# card_layout

### CardLaypout

다수의 컴포넌트를 겹쳐서 배치하는 방법이다.

화면에 보이는 컴포넌트는 하나지만, ``new CardLayou()``객체의 메소드를 통해서 바꿀 수 있다.

주의할 점은, ``CardLayout``객체를 적용한 컨테이너는, **적용한 ``CardLayou``객체로만 사용**할 수 있다.

(컨테이너에 적용한 ``CardLayout``객체가 아닌 다른 ``CardLayout``객체로는 사용할 수 없다.)

때문에 ``CardLayout``을 적용한 컨테이너는, **해당 ``CardLayout``객체를 보관**해야만 한다.

```java
CardLayout layout = new CardLayout();
JPanel panel = new JPanel();
panel.setLayout(layout);

layout.first();
layout.previous();
layout.next();
layout.last();
```

---

### addActionListener(ActionListener I);

```java
JButton button = new JButton("버튼 타이틀");
button.addActionListener(ActionListener 타입 객체);
```

``addActionListener(ActionListener I)``는 버튼의 액션을 들어줄 객체(``ActionListener``를 구현한)를 지정하는 것이다.

``addActionListener()``의 인자값으로 들어간 객체가 이 버튼의 액션에 반응하도록 한다.

