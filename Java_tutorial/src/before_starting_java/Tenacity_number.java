package before_starting_java;

public class Tenacity_number {
	public static void main(String[] args) {
		// ������ ���ϱ�
		// ���� 1 : 10���� 99������ ������ ���
		// ���� 2 : 10�� �ڸ� �� * 1�� �ڸ��� 
		// ���� 3 : 1�� 2�� ���� �ѹ��� �������� �ѹ� ī��Ʈ�ȴ�.
		// ���� 4 : ������� 1�� �ڸ����� �Ǹ� ������ ����ȴ�.
		// ��� : �������� 4 �̻��� ���� ��� ����Ѵ�.
		
		final int BEGIN_NUM = 10;	// �ּҰ�
		final int END_NUM = 100;	// �Ѱ谪
		
		int current_count = 0;		// ���� ����� ������ Ƚ��
		int current_val = 0;		// ���� ���
		int total_count = 0;		// ������ �����ϴ� ������ ����
		int lhs = 0;				// 10�� �ڸ� ����
		int rhs = 0;				// 1�� �ڸ� ����
		
		for(int i = BEGIN_NUM; i < END_NUM; i++) {
			current_val = i;
			current_count = 0;
			
			while(current_val > 10) {
				lhs = current_val / 10;
				rhs = current_val % 10;
				current_val = lhs * rhs;
				
				current_count++;
			}
			
			if(current_count >= 4) {
				total_count++;
				System.out.println(i);
			}
		}
		System.out.println("������ ���� : " + total_count);
	}
}
