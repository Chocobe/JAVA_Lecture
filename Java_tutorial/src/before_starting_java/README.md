---
---

# before starting java

* [Hello](#hello) - ���ڿ� ��°� �ڷ�����
		
		
* [StringEx](#stringex) - printf�� ����ϴ� ����ǥ�� ���


* [ScannerEx](#scannerex) - Scanner Ŭ������ �̿��� Ű������ �Է°� �ޱ�


* [InputTest](#inputtest) - �Է� �޼��� read()����ϱ� - 1byte �� �о����


* [ScannerTest](#scannertest) - Scanner �̿��, ���� ����


* [OpTest](#optest) - boolean���� ������ : ``!������``


* [Operatorex1](#operatorex1) - ���� ������ (++, --)


* [Operatorex23](#operatorex23) - ���ڿ� ���ϱ�  ``���ڿ�.equals(���ڿ�)``


* [Operatorex24](#operatorex24) - ��������(``&&``, ``||``)�� �켱����


* [Operatorex25](#operatorex25) - ���ڿ����� �� ���� �����ϱ�


* [Operatorex26](#operatorex26) - �������� ��ġ�� ���� ȿ��


* [Operatorex27](#operatorex27) - boolean���� ������ : ``!������``


* [Condition_op](#condition_op) - ���� ������ ``���� = ���ǹ� ? true : false;``


* [Test_if](#test_if) - ���ǹ� if ``if(���ǹ�){����}``


* [Test_if_1](#test_if_1) - Test_if�� ����


* [FlowEx2](#flowex2) - ``if ~ else`` �� ``if``�ΰ��� ������


* [Switch_Ex_1](#switch_ex_1) - ``switch ~ case`` �� ����ϱ�


* [FlowEx7](#flowex7) - ``Math.random()``�� �̿��Ͽ� ����, ����, �� ���� �����


* [FlowEx8](#flowex8) - ``switch ~ case`` ����) �ֹε�Ϲ�ȣ�� �̿��� ���� ���ϱ�


* [Test_for_1](#test_for_1) - for�� ����


* [Random_Class](#random_class) - Random Ŭ���� ����ϱ�

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
		
		Ŭ������ �Է���,
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

		(System.in.read() �� ���� ��ȯ�� �� - 48) <- Ű����� �Է��� ���ڰ�
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

:camel:[Top](#before-starting-java)

---
---

### OperatorEx1

���� ������ (++, --)

���� �����ڴ� ``����``�� ``����`` �ΰ����� �ִ�.

���� �����ڰ� ``����`` �̳� ``�Ű�����``�� ���� ��, ����� �޶�����.

:camel:[Top](#before-starting-java)

---
---

### OperatorEx23

���ڿ� ���ϱ�

���ڿ��� StringŬ������ ��ü�̱� ������, ``==``������ ���� �� ��,

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

Java������ *�� ���� �Է� ���* �� **����**.

�׷��Ƿ�, �� ���� �Է��� �ޱ� ���ؼ���

���ڿ��� �Է¹��� ��, ù��° ���ڸ� ���� �ϴ� ������ ������ �� �ִ�.

		���ڿ�.charAt(�ε�����ȣ);

:camel:[Top](#before-starting-java)

---
---

### OperatorEx26

�������� �켱������ ���� ȿ��

``����1 && ����2`` �� AND�̱� ������, ``����1``�� ``false``�� �߻��� Ȯ���� �� ū ���� �ִ°��� ȿ������ ��������.

``����1 || ����2`` �� OR�̱� ������, ``����1``�� ``true``�� �߻��� Ȯ���� �� ū ���� �ִ°��� ȿ������ ��������.

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

``String str_result = (gender == 1) ? "����" : "����"``

		gender���� 1�̸�, "����" ���ڿ���
		0�̸�, "����" ���ڿ���
		str_result�� �����Ѵ�. 

if���� ����ؼ� ����� �� �ִ�.

�������� ����, ���ǹ��� ``( )`` �� �����ִ°� ����.

:camel:[Top](#before-starting-java)

---
---

### Test_if

���ǹ� if

```java
if(���ǹ�) {
	�����ڵ�
} else {
	�����ڵ�
}
```

:camel:[Top](#before-starting-java)

---
---

### Test_if_1

Test_if�� ����

:camel:[Top](#before-starting-java)

---
---

### FlowEx2

``if ~ else``������ ``else``��� �߰��� ``if``���� ����ϸ� ������ ����� ���� �� �ִ�.

:camel:[Top](#before-starting-java)

---
---

### Switch_Ex_1

``switch(���ǹ�)`` ���� ���ǹ��� ``����`` �Ǵ� ``���ڿ�``�� ����� �� �ִ�.

---

``case``�� ������ ``���`` �Ǵ� ``���ڿ�``�� ����� �� ������,

������ ���� ������ �� �� ����.

�ٸ�, ���ͷ��� ����(final)�� ����� �� �ִ�.

:camel:[Top](#before-starting-java)

---
---

### FlowEx7

``Math.random()``�� ��ȯ����, 0�̻� ���� 1 �̸��� �Ǽ����� ���´�.

��, ``0 <= Math.random() < 1``���� ǥ���ȴ�.

---

������ �̿��Ͽ� ���ϴ� ���� ���ϱ� ���ؼ�,

���ϴ� ���� �ִ밪�� �����ָ� ���� �� �ִ�.

��)

		(int)(Math.random() * 6) + 1
		�����Ǵ� ���� : 1, 2, 3, 4, 5, 6
		
:camel:[Top](#before-starting-java)

---
---

### FlowEx8

����) �ֹε�Ϲ�ȣ�� �̿��� ���� ���ϱ�

:camel:[Top](#before-starting-java)

---
---

### Test_for_1

``for(�ʱ�ȭ; ���ǽ�; ������){���๮}``

for���� ���� ����

		1. �ʱ�ȭ
		2. ���ǽ� �˻�
		3. ���๮ ����
		4. ������ ����
		
---
---

### Random_Class

``Random random = new Random(System.currentTimeMillis());``

``Math.random()``�� �̿��� ���� ���ϱ�� ������ RandomŬ������ �ִ�.

RandomŬ������ Random ��ü�� �����Ͽ�, �������� �޼ҵ带 ����� �� �ִ�.

RandomŬ������ ������ �μ����� Seed���� ���� �� �ִµ�,

``System.currentTimeMillis()``�� �μ��� ����ϸ�, ���� �ð��� Seed������ �̿��� �� �ִ�.

:camel:[Top](#before-starting-java)

---
---