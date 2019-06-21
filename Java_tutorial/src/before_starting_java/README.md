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

���ڿ� ��°� �ڷ�����

```java
System.out.println("���ڿ�");
```

:camel:[Top](#before-starting-java)

---
---

### StringEx

ȭ�� ��½�, printf�� ����ϴ� ����ǥ�� ���
		
		%s, %d, %10.2f, %-5.2f ��...

---

Ŭ���� import ���

		ctrl + space_bar	
		�Ǵ�
		ctrl + shift + o

:camel:[Top](#before-starting-java)

---
---

### ScannerEx

Scanner Ŭ������ �̿��� Ű������ �Է°� �ޱ�

		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();
		scanner.close();
	
:camel:[Top](#before-starting-java)
		
---
---
		
### InputTest

�Է� �޼��� read()����ϱ� - 1byte �� �о����

		System.in.read();

---

���� �Է°��� �ޱ� ����, ���ۿ� �����ִ� Enter�� �����

``System.in.read()``���� Ű���� �Է� ��, EnterŰ ���� �а� �ȴ�.

�׷��Ƿ�, Enter��(2byte)�� �Ұ��ϱ� ���� ``System.in.read();``�� �ι� ����Ͽ� 2byte�� �����Ѵ�.

---

``System.in.read()``�� ���ڸ� �Է��Ѵٸ�, �� �� ���� �ƽ�Ű �ڵ尪���� ���´�.

�̴� �츮�� ���ϴ� �������� ���� �ٸ���.

		``System.in.read()``�� ���� ��ȯ�� �� - 48 <- Ű����� �Է��� ���ڰ�
		(48�� ���� '0'�� �ƽ�Ű�ڵ尪)
		
---

String���� int������ ��ȯ�ϱ�.

String�� ��ü�� �̱� ������, (int) �������� ����ȯ�� �ȵȴ�.

�׷��Ƿ�, ``Integer.parseInt(String�� ����)`` �� ����ؾ� �Ѵ�.

:camel:[Top](#before-starting-java)

---
---

### ScannerTest

������ �Է¸��� ������, ���ӵ� �Է��� �����ϴ�.

�׷���, ������ �Էµ� ���̿� ���ڿ��� �Է¹ް� �Ǹ�, ���۸� �������Ѵ�.

		scanner.nextLine();
		
:camel:[Top](#before-starting-java)
		
---
---

### OpTest

boolean���� ������ : ``!������``

:came:[Top](#before-starting-java)

---
---

### OperatorEx1

���� ������ (++, --)

���� �����ڴ� ``����``�� ``����`` �ΰ����� �ִ�.

���� �����ڰ� ``����`` �̳� ``�Ű�����``�� ���� ��, ����� �޶�����.

:came:[Top](#before-starting-java)

---
---

### OperatorEx23

���ڿ� ���ϱ�

���ڿ��� StringŬ������ ��ü�̱� ������, ``==``������ ���� �񱳽�,

���ڿ����� �ƴ� �ּҰ��� ���ϰ� �ȴ�.

������, ������ ���� ���� �� ���ڿ��� ``==``�������� ���ϸ�, ``false``�� ��ȯ�Ѵ�.

�׷��Ƿ�, ������ ���� ������ �� ���ڿ��� ���� ���� ``equals()``�޼��带 �������.

```java
String str_1 = "abc";
String str_2 = "abc";

str_1 == str_2		// false���� ��ȯ�Ѵ�.
str_1.equals(str_2)	// true���� ��ȯ�Ѵ�.
```

:camel:[Top](#before-starting-java)

---
---

### OperatorEx24

������ ``&&`` �� ``||``

�������� ``&&``�� ``||``���� �켱������ ����.

:camel:[Top](#before-starting-java)

---
---

### OperatorEx25

Java������ *�� ���� �Է� ���*�� **����**.

�׷��Ƿ�, �� ���� �Է��� �ޱ� ���ؼ���

���ڿ��� �Է¹��� ��, ù��° ���ڸ� ���� �ϴ� ������ ������ �� �ִ�.

:camel:[Top](#before-starting-java)

---
---

### OperatorEx26

�������� �켱������ ���� ȿ��

``����1 && ����2`` �� AND�̱� ������, ``����1``�� false�� �߻��� Ȯ���� �� ū ���� �ִ°��� ȿ������ ��������.

``����1 || ����2`` �� OR�̱� ������, ``����1``dp true�� �߻��� Ȯ���� �� ū ���� �ִ°��� ȿ������ ��������.

:camel:[Top](#before-starting-java)

---
---

### OperatorEx27

``!``������ - ������ ���� ��Ų��.

:camel:[Top](#before-starting-java)

---
---

### Condition_op

���� ������

if���� ����ؼ� ����� �� �ִ�.

�������� ����, ���ǹ��� ``( )`` �� �����ִ°� ����.

:camel:[Top](#before-starting-java)

---
---