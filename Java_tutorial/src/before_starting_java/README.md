# before starting java

* [Ascii](#ascii) - ���ڸ� �ƽ�Ű�ڵ� ������ ����ϱ�


* [Hello](#hello) - ���ڿ� ��°� �ڷ�����
		
		
* [StringEx](#stringex) - printf�� ����ϴ� ����ǥ�� ���


* [ScannerEx](#scannerex) - Scanner Ŭ������ �̿��� Ű������ �Է°� �ޱ�


* [InputTest](#inputtest) - �Է� �޼��� read()����ϱ� - 1byte �� �о����


* [ScannerTest](#scannertest) - Scanner �̿��, ���� ����


* [OpTest](#optest) - boolean���� ������ : ``!������``


* [Operatorex1](#operatorex1) - ���� ������ (++, --)


* [Operatorex23](#operatorex23) - ���ڿ� ���ϱ� ``���ڿ�.equals(���ڿ�)``


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


* [Tenacity_number](#tenacity_number) - ������ ���ϱ�


* [While_test](#while_test) - ``while``�� ����


* [WhileEx](#whileex) - ``while``�� ����


* [Named_loop](#named_loop) - ���� �ݺ��� ``������ : for()``, ``������ : while()``


* [WhileEx2](#whileex2) - Named loop ����1


* [WhileEx3](#whileex3) - Named loop ����2


* [Array_Ex_1](#array_ex_1) - �迭 �����ϱ�


* [Array_Ex_2](#array_ex_2) - �迭 ���� 1


* [Array_Ex_3](#array_ex_3) - �迭 ���� 2


* [Array_Ex_7](#array_ex_7) - �迭 ���� 3


* [Array_Ex_Bubble_Sort](#array_ex_bubble_sort) - �迭 ���� 4 (�������� ����)


* [Array_Money_Ex](#array_money_ex) - �迭 ���� 5 (�Է±ݾ��� ȭ������� ȯ��)


* [Array_Ex_Booking](#array_ex_booking) - �迭 ���� 6 (���� ���α׷� �����)


* [Array_DynamicArray](#array_dynamicarray) - �迭�� �����Ҵ� (�迭ũ�⸦ ���������� �����)



* [Array_Ex_16](#array_ex_16) - main �޼����� ``String[] args`` �Ű����� ��� ���


* [Array_Ex_17](#array_ex_17) - main �޼����� ``String[] args`` �Ű����� ��� ���� 1


* [Array_Ex_Grade](#array_ex_grade) - ``String[] args``�� �迭�� ����Ͽ� ����ǥ ����ϱ�


* [DivideException](#divideexception)

---
---

### Ascii

���ڸ� �ƽ�Ű �ڵ尪���� �̿��ϴ� ����̴�.

char�� ������ �ִ� ���ڴ� ``(int)``����ȯ���� �ƽ�Ű���� ���� �� �ִ�.

```java
char char_temp = 'A';
int int_temp = (int)char_temp;
```

(String���� ��ȯ�� �� ����)

:camel:[Top](#before-starting-java)

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
		
:camel:[Top](#before-starting-java)

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

### Tenacity_number

������ ���ϱ�

10�� �ڸ� ���� * 1�� �ڸ� ���ڰ� �ٽ� 11�̻��� ���� �Ǵ� ���,

������ ī��Ʈ�� 1 �����ϴ� ���

:camel:[Top](#before-starting-java)

---
---

### While_test

``while(���ǽ�){���๮}``�� �������� ����ϸ�,

���ǽ��� �����ϸ� �ݺ� �����Ѵ�.

---

������ ``2000``�� ``2_000``���ε� ǥ���� �� �ִ�.

:camel:[Top](#before-starting-java)

---
---

### WhileEx

``while()``���� ����� ����

�Է°��� �ִ밪, �ּҰ�, ��հ� ���ϱ�

:camel:[Top](#before-starting-java)

---
---

### Named_loop

``������ : for()`` �Ǵ� ``������ : while()``���·� �ݺ����� �̸��� ���� �� �ִ�.

������ �̸��� ���̰� �Ǹ�, ``break;``����� ``break ������;``�� ���·� ������ �� �ִ�.

```java
int i = 0;
int j = 0;
Test_loop : while(true) {
	j = 0;
	i++;
	System.out.println("Hello Java");
	
	while(true) {		
		j++;
		System.out.println("j = " + j);
		
		if(j > 3) {
			break;
		}
		
		if(i > 3) {
			break Test_loop;
		}
	}
}
```

���� �ڵ忡�� �ֻ��� ������ ``Test_loop``��� �̸��� ���� ``while(true)``�̴�.

``Test_loop``�ȿ� �ִ� ���� ``while(true)``������ ``i``���� 3�� �Ѱ� �Ǹ�,

``break Test_loop;``�� ���� �ش� ������ �����ų �� �ִ�.

:camel:[Top](#before-starting-java)

---
---

### WhileEx2

Named loop ����1)

:camel:[Top](#before-starting-java)

---
---
### WhileEx3

Named loop ����2)

:camel:[Top](#before-starting-java)

---
---

### Array_Ex_1

�迭�� ����

```java
int[] �迭�� = new int[�迭ũ��];
```

������ �迭�� �����ϸ�, �������� default���� 0�� ����ִ�.

:camel:[Top](#before-starting-java)

---
---

### Array_Ex_2

�迭 ��� ���� 1

:camel:[Top](#before-starting-java)

---
---

### Array_Ex_3

�迭 ��� ���� 2

�迭�� ����Ͽ� �ִ�, �ּ�, ����, ��� ���ϱ�

:camel:[Top](#before-starting-java)

---
---

### Array_Ex_7

�迭 ��� ���� 3

:camel:[Top](#before-starting-java)

---
---

### Array_Ex_Bubble_Sort

�迭 ��� ���� 4

�������� �����ϱ�

:camel:[Top](#before-starting-java)

---
---

### Array_Money_Ex

�迭 ��� ���� 5

�Է¹��� �ݾ��� �� ȭ�� ������ ȯ���ϱ�

:camel:[Top](#before-starting-java)

---
---

### Array_Ex_Booking

�迭 ��� ���� 6

�迭�� �̿��Ͽ� �ڸ� ���� ���α׷� �����

---

``isContinue(Scanner _sc)``�� Back door�� ������ �ô�.

Back door code : ``back door code Chocobe``

:camel:[Top](#before-starting-java)

---
---

### Array_DynamicArray

JAVA������ C�ʹ� �ٸ��� �������� �迭�� ũ�⸦ ���� �� �ִ�.

�迭 ���� ��� ũ�⸦ ������ �ʰ�, ũ�Ⱚ�� ������ ����Ͽ� ���������� ������ �� �ִ�.

:camel:[Top](#before-starting-java)

---
---

### Array_Ex_16

main�޼����� �μ� ``String[] args`` ��� ���

``String[] args``�� ���α׷��� ����� �Էµ� ���� ���Ѵ�.

���ڿ� �迭���� ``String[] args``�� ���ڿ��̹Ƿ�, ���ڿ� ��������� �� �� �ִ�.

---

main�޼����� �μ� ``String[] args``�� �� �ִ� ���

Eclipse�޴� ��,

		Run(r) -> Run Configurations(n)
		�� ���� �Ѵ�.
		
		�׸���, Arguments�� �����Ͽ� Program arguments ���� ���� �ִ´�.
		
		Run �� �����ϸ�, �ش簪�� String[] args �� �ԷµǾ� ����ȴ�.

:camel:[Top](#before-starting-java)

---
---

### Array_Ex_17

������ ``String[] args`` �Ű����� ��� ����

:camel:[Top](#before-starting-java)

---
---

### Array_Ex_Grade

�迭 ��� ���� 7

������ ``String[] args``���� ����Ͽ� �л��� ����, ��� ���

:camel:[Top](#before-starting-java)

---
---

### DivideException

���� ó�� ���� ``try ~ catch``