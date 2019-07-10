# fileOutputStream_ex

* 저장할 파일의 확장자를 ``.out``으로 하면 이진 데이터로 저장할 수 있다.

* 스트림을 닫을 때 다음과 같이 작성해 보자

```java
try {

} catch() {

} finally {
	try {
		if(스트림 객체 != null) {
			스트림 객체.close();
		}
	} catch() {
	
	}
}
```
		