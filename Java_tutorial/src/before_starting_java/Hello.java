package before_starting_java;

/*
 * �ּ�
 */
public class Hello {
	public static void main(String[] args) {
		
		System.out.println("Hello Java!");
		System.out.println("�ڹ� ���� ���α׷�\n������ : �迵��");
		System.out.println("��ȣ\t�̸�\t��ȭ��ȣ\t");
		System.out.println();
		System.out.print("��ȣ");
		System.out.print("�̸�");
		System.out.print("��ȭ��ȣ");
		System.out.printf("%d%s", 1000, "korea\n");
		
		int num = 1;
		int num2 = 100;
		int res = num + num2;
		System.out.println("res : " + res);
		
		res = num + num2 + 1;
		System.out.println("res : " + res);
	}
}