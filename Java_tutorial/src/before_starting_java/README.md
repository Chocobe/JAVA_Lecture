---
---

# before starting java ����

---
---

#### Hello.java
		
���ڿ� ��°� �ڷ�����

```java
System.out.println("���ڿ�");
```

---
---

#### StringEx.java

ȭ�� ��½�, printf�� ����ϴ� ����ǥ�� ���
		
		%s, %d, %10.2f, %-5.2f ��...
		
Ŭ���� import ���

		ctrl + space_bar	
		�Ǵ�
		ctrl + shift + o

---
---

#### ScannerEx

Scanner Ŭ������ �̿��� Ű������ �Է°� �ޱ�

		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();
		scanner.close();
		
---
---
		
#### InputTest

�Է� �޼��� read()����ϱ� - 1byte �� �о����

		System.in.read();

---

���� �Է°��� �ޱ� ����, ���ۿ� �����ִ� Enter�� �����

``System.in.read()``���� Ű���� �Է� ��, EnterŰ ���� �а� �ȴ�.

�׷��Ƿ�, Enter��(2byte)�� �Ұ��ϱ� ���� ``System.in.read();``�� �ι� ����Ͽ� 2byte�� �����Ѵ�.

---

``System.in.read()``�� ���ڸ� �Է��Ѵٸ�, �� ������ �ƽ�Ű �ڵ尪���� ���´�.

�̴� �츮�� ���ϴ� �������� ���� �ٸ���.

		``System.in.read()``�� ���� ��ȯ�� �� - 48 <- Ű����� �Է��� ���ڰ�
		(48�� 0�� �ƽ�Ű�ڵ尪)