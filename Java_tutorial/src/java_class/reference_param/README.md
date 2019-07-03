# Reference_parameter

* 참조형 반환 타입

반환타입을 참조형을 사용할 경우, 해당 객체의 주소값을 반환한다.

```java
public static Data copy(Data _d) {
	Data temp = new Data();
	temp.x = _d.x;
	
	return temp;
}

public static void main(String[] args) {
	Data d = new Data();
	Data d2 = copy(d);
}
```