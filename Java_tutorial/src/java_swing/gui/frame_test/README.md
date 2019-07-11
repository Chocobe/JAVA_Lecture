# Frame_test

최상위 컨테이너인 ``Frame`` 사용방법이다.

지금까지의 console 환경이 아닌, GUI환경으로 만들기 위한 기본 뼈대라고 생각하면 된다.

Frame이 있어야, 다양한 컴포넌트를 띄울 수 있기 때문이다.

즉, Frame은 응용프로그램의 기본 윈도우 창이다.

---

Frame의 기본 설정은 다음과 같다.

```java
// 프래임 객체 생성
JFrame frame = new JFrame();

// 생성된 창(프래임)의 이름 설정
frame.setTitle("창 이름");

// 창(프래임)의 크기 설정
frame.setSize(x크기, y크기);

// 종료 시, 동작 설정(JFrame.EXIT_ON_CLOSE 를 넣어줘야 스레드까지 완전 종료가 된다.)
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// true 시, 창(프래임)을 화면에 띄워준다. 
frame.setVisible(true);
```
