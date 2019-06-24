---
---

# before starting java

* [Hello](#hello) - 문자열 출력과 자료형들
		
		
* [StringEx](#stringex) - printf상에 사용하는 형식표현 방법


* [ScannerEx](#scannerex) - Scanner 클래스를 이용한 키보드의 입력값 받기


* [InputTest](#inputtest) - 입력 메서드 read()사용하기 - 1byte 값 읽어오기


* [ScannerTest](#scannertest) - Scanner 이용시, 버퍼 비우기


* [OpTest](#optest) - boolean형의 부정값 : ``!변수명``


* [Operatorex1](#operatorex1) - 증감 연산자 (++, --)


* [Operatorex23](#operatorex23) - 문자열 비교하기  ``문자열.equals(문자열)``


* [Operatorex24](#operatorex24) - 논리연산자(``&&``, ``||``)의 우선순위


* [Operatorex25](#operatorex25) - 문자열에서 한 문자 추출하기


* [Operatorex26](#operatorex26) - 연산자의 배치에 따른 효율


* [Operatorex27](#operatorex27) - boolean형의 부정값 : ``!변수명``


* [Condition_op](#condition_op) - 조건 연산자 ``변수 = 조건문 ? true : false;``


* [Test_if](#test_if) - 조건문 if ``if(조건문){연산}``


* [Test_if_1](#test_if_1) - Test_if의 연습


* [FlowEx2](#flowex2) - ``if ~ else`` 를 ``if``두개로 나누기


* [Switch_Ex_1](#switch_ex_1) - ``switch ~ case`` 문 사용하기


* [FlowEx7](#flowex7) - ``Math.random()``을 이용하여 가위, 바위, 보 게임 만들기


* [FlowEx8](#flowex8) - ``switch ~ case`` 예제) 주민등록번호를 이용한 성별 구하기


* [Test_for_1](#test_for_1) - for문 사용법


* [Random_Class](#random_class) - Random 클래스 사용하기

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
		
		클래스명 입력후,
		ctrl + space_bar	
		또는
		ctrl + shift + o

:camel:[Top](#before-starting-java)

---
---

### ScannerEx

Scanner 클래스를 이용한 키보드의 입력값 받기

		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();
		scanner.close();
	
:camel:[Top](#before-starting-java)
		
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

		(System.in.read() 를 통해 반환된 값 - 48) <- 키보드로 입력한 숫자값
		(48은 문자 '0'의 아스키코드값)
		
---

String형을 int형으로 변환하기.

String은 객체형 이기 때문에, (int) 형식으로 형변환이 안된다.

그러므로, ``Integer.parseInt(String형 변수)`` 를 사용해야 한다.

:camel:[Top](#before-starting-java)

---
---

### ScannerTest

정수형 입력만을 받으면, 연속된 입력이 가능하다.

그러나, 정수형 입력들 사이에 문자열을 입력받게 되면, 버퍼를 비워줘야한다.

		scanner.nextLine();
		
:camel:[Top](#before-starting-java)
		
---
---

### OpTest

boolean형의 부정값 : ``!변수명``

:camel:[Top](#before-starting-java)

---
---

### OperatorEx1

증감 연산자 (++, --)

증감 연산자는 ``전위``와 ``후위`` 두가지가 있다.

증감 연산자가 ``수식`` 이나 ``매개변수``에 사용될 시, 결과가 달라진다.

:camel:[Top](#before-starting-java)

---
---

### OperatorEx23

문자열 비교하기

문자열은 String클래스의 개체이기 때문에, ``==``연산을 통한 비교 시,

문자열값이 아닌 주소값을 비교하게 된다.

때문에, 동일한 값을 가진 두 문자열을 ``==``연산으로 비교하면, ``false``를 반환한다.

그러므로, 동일한 값을 가지는 두 문자열을 비교할 때는 ``equals()``메서드를 사용하자.

```java
String str_1 = "abc";
String str_2 = "abc";

str_1 == str_2		// false값을 반환한다.
str_1.equals(str_2)	// true값을 반환한다.
```

:camel:[Top](#before-starting-java)

---
---

### OperatorEx24

논리연산 ``&&`` 와 ``||``

논리연산자 ``&&``는 ``||``보다 우선순위가 높다.

:camel:[Top](#before-starting-java)

---
---

### OperatorEx25

Java에서는 *한 문자 입력 기능* 이 **없다**.

그러므로, 한 문자 입력을 받기 위해서는

문자열을 입력받은 후, 첫번째 문자를 추출 하는 것으로 구현할 수 있다.

		문자열.charAt(인덱스번호);

:camel:[Top](#before-starting-java)

---
---

### OperatorEx26

연산자의 우선순위에 따른 효율

``조건1 && 조건2`` 는 AND이기 때문에, ``조건1``에 ``false``가 발생할 확률이 더 큰 것을 넣는것이 효율성이 높아진다.

``조건1 || 조건2`` 는 OR이기 때문에, ``조건1``에 ``true``가 발생할 확률이 더 큰 것을 넣는것이 효율성이 높아진다.

:camel:[Top](#before-starting-java)

---
---

### OperatorEx27

``!``연산자 - 논리값을 반전 시킨다.

:camel:[Top](#before-starting-java)

---
---

### Condition_op

조건 연산자

``String str_result = (gender == 1) ? "남성" : "여성"``

		gender값이 1이면, "남성" 문자열을
		0이면, "여성" 문자열을
		str_result에 대입한다. 

if문을 대신해서 사용할 수 있다.

가독성을 위해, 조건문을 ``( )`` 로 묶어주는게 좋다.

:camel:[Top](#before-starting-java)

---
---

### Test_if

조건문 if

```java
if(조건문) {
	실행코드
} else {
	실행코드
}
```

:camel:[Top](#before-starting-java)

---
---

### Test_if_1

Test_if의 연습

:camel:[Top](#before-starting-java)

---
---

### FlowEx2

``if ~ else``문에서 ``else``대신 추가로 ``if``문을 사용하면 동일한 결과를 만들 수 있다.

:camel:[Top](#before-starting-java)

---
---

### Switch_Ex_1

``switch(조건문)`` 에서 조건문은 ``정수`` 또는 ``문자열``을 사용할 수 있다.

---

``case``의 값에도 ``상수`` 또는 ``문자열``을 사용할 수 있지만,

주의할 점은 변수가 올 수 없다.

다만, 리터럴인 변수(final)는 사용할 수 있다.

:camel:[Top](#before-starting-java)

---
---

### FlowEx7

``Math.random()``의 반환값은, 0이상 에서 1 미만의 실수값이 나온다.

즉, ``0 <= Math.random() < 1``으로 표현된다.

---

난수를 이용하여 원하는 값을 정하기 위해선,

원하는 값의 최대값을 곱해주면 만들 수 있다.

예)

		(int)(Math.random() * 6) + 1
		생성되는 난수 : 1, 2, 3, 4, 5, 6
		
:camel:[Top](#before-starting-java)

---
---

### FlowEx8

연습) 주민등록번호를 이용한 성별 구하기

:camel:[Top](#before-starting-java)

---
---

### Test_for_1

``for(초기화; 조건식; 증감식){수행문}``

for문의 동작 순서

		1. 초기화
		2. 조건식 검사
		3. 수행문 실행
		4. 증감식 수행
		
---
---

### Random_Class

``Random random = new Random(System.currentTimeMillis());``

``Math.random()``을 이용한 난수 구하기와 동일한 Random클래스가 있다.

Random클래스는 Random 객체를 생성하여, 여러가지 메소드를 사용할 수 있다.

Random클래스의 생성자 인수에는 Seed값을 넣을 수 있는데,

``System.currentTimeMillis()``를 인수로 사용하면, 현재 시간을 Seed값으로 이용할 수 있다.

:camel:[Top](#before-starting-java)

---
---