# Label_test

레이블을 생성하는 방법이다.

레이블도 컴포넌트에 속한다.

그러므로, ``label``객체를 생성하고, 컨테이너에 추가하는 것으로 사용할 수 있다.

```java
// 레이블 생성 & 출력 문자열 설정
JLabel label_1 = new JLabel("레이블 텍스트");

// 레이블 생성
JLabel label_2 = new JLabel();

// 레이블에 출력할 문자열 설정
label_2.setText("레이블 텍스트");

// 프래임에 레이블 등록
this.add(label_1);
this.add(label_2);
```