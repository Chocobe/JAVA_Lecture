# vector_3

``Vector`` 콜랙션 클래스에 객체를 담을 경우,

``Vector<Point> vector = new Vector<Point>();``로 사용할 수 있다.

만약 이 ``Vector``를 매개변수로 메소드를 만든다면,

```java
public void print_vector(Vector<Point> _vector) {
	for(int i = 0; i < _vector.size(); i++) {
		Point temp = _vector.elementAt(i);
		System.out.println(temp.get_x() + ", " + temp.get_y());
	}
}
```
의 형식으로 사용할 수 있다.

메소드 생성 시, 매개변수인 ``(Vector<Point> _vector)``의 자료형을 지정하지 않고 ``(Vector _vector)``로 사용한다면,

``_vector.elementAt(인덱스)``의 반환값은 ``Object``형 값이 된다.

또한 경고문도 뜨기 때문에, 매개변수 선언부에 꼭 자료형을 명시하자.