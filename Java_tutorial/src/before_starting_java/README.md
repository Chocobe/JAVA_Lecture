---
---

# before starting java

* [Hello](#hello)
* [StringEx](#stringex)
* [ScannerEx](#scannerex)
* [InputTest](#inputtest)
* [ScannerTest](#scannertest)
* [OpTest](#optest)
* [Operatorex1](#operatorex1)
* [peratorex23](#operatorex23)
* [Operatorex24](#operatorex24)
* [Operatorex25](#operatorex25)
* [Operatorex26](#operatorex26)
* [Operatorex27](#operatorex27)
* [Condition_op](#condition_op)

---
---

### Hello

문자열 출력과 자료형들

```java
System.out.println("문자열");
```

:camel:[Top](#before-starting-java)

---
---

### StringEx

화면 출력시, printf상에 사용하는 형식표현 방법
		
		%s, %d, %10.2f, %-5.2f 등...

---

클래스 import 방법

		ctrl + space_bar	
		또는
		ctrl + shift + o

---
---

### ScannerEx

Scanner 클래스를 이용한 키보드의 입력값 받기

		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();
		scanner.close();
		
---
---
		
### InputTest

입력 메서드 read()사용하기 - 1byte 값 읽어오기

		System.in.read();

---

다음 입력값을 받기 위해, 버퍼에 남아있는 Enter값 지우기

``System.in.read()``에서 키보드 입력 시, Enter키 까지 읽게 된다.

그러므로, Enter값(2byte)을 소거하기 위한 ``System.in.read();``를 두번 사용하여 2byte를 제거한다.

---

``System.in.read()``에 숫자를 입력한다면, 이 값 역시 아스키 코드값으로 나온다.

이는 우리가 원하는 정수형의 값과 다르다.

		``System.in.read()``를 통해 반환된 값 - 48 <- 키보드로 입력한 숫자값
		(48은 문자 '0'의 아스키코드값)
		
---

String형을 int형으로 변환하기.

String은 객체형 이기 때문에, (int) 형식으로 형변환이 안된다.

그러므로, ``Integer.parseInt(String형 변수)`` 를 사용해야 한다.

---
---

### ScannerTest

정수형 입력만을 받으면, 연속된 입력이 가능하다.

그러나, 정수형 입력들 사이에 문자열을 입력받게 되면, 버퍼를 비워줘야한다.

		scanner.nextLine();
		
---
---

### OpTest

boolean형의 부정값 : ``!변수명``

---
---

### OperatorEx1

증감 연산자 (++, --)

증감 연산자는 ``전위``와 ``후위`` 두가지가 있다.

증감 연산자가 ``수식`` 이나 ``매개변수``에 사용될 시, 결과가 달라진다.

---
---

### OperatorEx23

문자열 비교하기

문자열은 String클래스의 개체이기 때문에, ``==``연산을 통한 비교시,

문자열값이 아닌 주소값을 비교하게 된다.

때문에, 동일한 값을 가진 두 문자열을 ``==``연산으로 비교하면, ``false``를 반환한다.

그러므로, 동일한 값을 가지는 두 문자열을 비교할 때는 ``equals()``메서드를 사용하자.

```java
String str_1 = "abc";
String str_2 = "abc";

str_1 == str_2		// false값을 반환한다.
str_1.equals(str_2)	// true값을 반환한다.
```

---
---

### OperatorEx24

논리연산 ``&&`` 와 ``||``

논리연산자 ``&&``는 ``||``보다 우선순위가 높다.

---
---

### OperatorEx25

Java에서는 *한 문자 입력 기능*이 **없다**.

그러므로, 한 문자 입력을 받기 위해서는

문자열을 입력받은 후, 첫번째 문자를 추출 하는 것으로 구현할 수 있다.

---
---

### OperatorEx26

연산자의 우선순위에 따른 효율

``조건1 && 조건2`` 는 AND이기 때문에, ``조건1``에 false가 발생할 확률이 더 큰 것을 넣는것이 효율성이 높아진다.

``조건1 || 조건2`` 는 OR이기 때문에, ``조건1``dp true가 발생할 확률이 더 큰 것을 넣는것이 효율성이 높아진다.

---
---

### OperatorEx27

``!``연산자 - 논리값을 반전 시킨다.

---
---

### Condition_op

조건 연산자

if문을 대신해서 사용할 수 있다.

가독성을 위해, 조건문을 ``( )`` 로 묶어주는게 좋다.

---
---