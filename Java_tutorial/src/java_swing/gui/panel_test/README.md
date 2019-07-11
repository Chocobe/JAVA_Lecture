# Panel_test

Panel은 작은 컨테이너라고 생각하면 된다.

Frame은 최상위 컨테이너였지만, Panel은 소규모로 묶는 역할을 한다.

컨테이너기 때문에, 포함시킬 컴포넌트들을 ``add()``메소드를 통해서 등록시켜야 한다.

```java
// 패널 컨테이너 생성
JPanel panel = new JPanel();

// 버튼 컴포넌트 생성
JButton button = new JButton("버튼");

// 버튼을 패널에 추가
panel.add(button);
``` 
