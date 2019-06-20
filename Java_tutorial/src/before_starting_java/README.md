---
---

# before starting java 목차

---
---

#### Hello.java
		
문자열 출력과 자료형들

```java
System.out.println("문자열");
```

---
---

#### StringEx.java

화면 출력시, printf상에 사용하는 형식표현 방법
		
		%s, %d, %10.2f, %-5.2f 등...
		
클래스 import 방법

		ctrl + space_bar	
		또는
		ctrl + shift + o

---
---

#### ScannerEx

Scanner 클래스를 이용한 키보드의 입력값 받기

		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();
		scanner.close();
		
---
---
		
#### InputTest

입력 메서드 read()사용하기 - 1byte 값 읽어오기

		System.in.read();

---

다음 입력값을 받기 위해, 버퍼에 남아있는 Enter값 지우기

``System.in.read()``에서 키보드 입력 시, Enter키 까지 읽게 된다.

그러므로, Enter값(2byte)을 소거하기 위한 ``System.in.read();``를 두번 사용하여 2byte를 제거한다.

---

``System.in.read()``에 숫자를 입력한다면, 이 값역시 아스키 코드값으로 나온다.

이는 우리가 원하는 정수형의 값과 다르다.

		``System.in.read()``를 통해 반환된 값 - 48 <- 키보드로 입력한 숫자값
		(48은 0의 아스키코드값)