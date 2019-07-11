# Button_test

버튼을 생성하는 방법이다.

버튼은 사용자와 상호작용을 할 수 있는 컴포넌트다.

컴포넌트는 단독으로 존재할 수 없고, 컨테이너위에 올려서 사용할 수 있다.

때문에, Frame을 생성하고, 그 Frame위에 올리는 작업을 해 줘야 한다.

```java
// 버튼 생성 - 인자값은 버튼에 표시할 이름이다.
JButton button_1 = new JButton("표시할 문자열");

// 생성자가 아닌 setText("표시할 문자열") 으로도 이름을 설정할 수 있다.
JButton button_2 = new JButton();
button_2.setText("표시할 문자열");

// 생성한 버튼은 해당 프래임의 add(객체) 메소드로 추가해야 사용할 수 있다.
this.add(button_1);
this.add(button_2);
```