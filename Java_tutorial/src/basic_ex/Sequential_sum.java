package basic_ex;

//	2. 1~10 ���� ���� �Ʒ��� ���� ����Ͻÿ�.
//	��	��
//	1	1
//	2	3
//	3	6
//	4	10
//	5	15

public class Sequential_sum {
	public static void main(String[] args) {
		int sum = 0;
		
		System.out.println("����2] 1~10������ �� ���ϱ�");
		System.out.println("��\t��");
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
			System.out.print(i + "\t");
			System.out.println(sum);
		}
	}
}
