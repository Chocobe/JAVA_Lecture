package before_starting_java;

// �迭 ���� 7
// �Է� : (���� �Ű����� ���)
//		�̸�, ��������, ��������, ��������
// ��� :
//		�̸�, ��������, ��������, ��������, ����, ���, ��� (7��)

public class Array_Ex_Grade {	
	
	public static final int SUB_COUNT = 3;
	
	public static void main(String[] args) {
		
		final int TOTAL_STUDENT = args.length / 4;
		
		String[] arr_name = new String[TOTAL_STUDENT];	// �̸� �����
		int[][] arr_score = null;						// �� ���� ���� �����
		int[] arr_total_score = null;					// ���� �����
		double[] arr_avg_score = null;					// ��� �����
		int[] arr_rank = null;							// ��� �����
		
		// 1. �̸� ����
		arr_name = get_name(args, TOTAL_STUDENT);
		
		// 2. ���� ����
		arr_score = get_score(args, TOTAL_STUDENT);
		
		// 3. ����
		arr_total_score = get_total_score(arr_score, TOTAL_STUDENT);
		
		// 4. ���
		arr_avg_score = get_avg_score(arr_total_score, TOTAL_STUDENT);

		// 5. ���
		arr_rank = get_rank(arr_avg_score, TOTAL_STUDENT);

		// 6. ���
		print_attribute();
		print_result(arr_name, arr_score, arr_total_score, arr_avg_score, arr_rank);
	}
	
	
	// �Ӽ��� ���
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public static void print_attribute() {
		System.out.printf("%4s |%3s |%3s |%3s |%3s |%4s   | %3s", 
						  "�л���", "�� ��", "�� ��", "�� ��", "�� ��", "�� ��", "�� ��");
		System.out.println();
	}
	
	
	// �̸� ����
	// @author	:	Chocobe
	// @param	:	String[] _args	: ���� �޼ҵ� ���ڰ�
	//			:	int _total_student	: �л� ��
	// @return	:	(String[]) ������ �̸�
	public static String[] get_name(String[] _args, int _total_student) {		
		String name[] = new String[_total_student];
		
		for(int i = 0; i < _total_student; i++) {
			name[i] = _args[i * (SUB_COUNT + 1)];
		}
		
		return name;
	}
	
	
	// ����/����/���� ���� ����
	// @author	:	Chocobe
	// @param	:	String[] _args	: ���� �޼ҵ� ���ڰ�
	//			:	int _total_student	: �л� ��
	// @return	:	(int[][]) ������ �� ����
	public static int[][] get_score(String[] _args, int _total_student) {
		int[][] score = new int[_total_student][SUB_COUNT];
		
		for(int i = 0; i < _total_student; i++) {
			for(int j = 0; j < SUB_COUNT + 1; j++) {
				if(j % (SUB_COUNT + 1) != 0) {
					score[i][j - 1] = Integer.parseInt(_args[i * (SUB_COUNT + 1) + j]);
				}
			}
		}
		return score;
	}
	
	
	// ���� ���
	// @author	:	Chocobe
	// @param	:	int[][] _score	: ������ �� ����
	//			:	int _total_student	: �� �л� ��
	// @return	:	(int[]) �л��� �� ��
	public static int[] get_total_score(int[][] _score, int _total_student) {
		int[] sum = new int[_total_student];
		
		int row_len = _score.length;
		int col_len = _score[0].length;
		
		for(int i = 0; i < row_len; i++) {
			for(int j = 0; j < col_len; j++) {
				sum[i] += _score[i][j];
			}
		}
		
		return sum;
	}
	
	
	// ��� ���
	// @author	:	Chocobe
	// @param	:	int[] _total_score	: �л��� �� ��
	//			:	int _total_student	: �л� ��
	// @return	:	(double[]) �л��� ��� ����
	public static double[] get_avg_score(int[] _total_score, int _total_student) {
		double[] avg = new double[_total_student];
		for(int i = 0; i < _total_student; i++) {
			avg[i] = (double)_total_score[i] / SUB_COUNT;
		}
		return avg;
	}
	
	
	// ��� ���
	// @author	:	Chocobe
	// @param	:	double[] _avg	: �л��� ��� ����
	//			:	int _total_student	: �л� ��
	// @return	:	(int[]) �л��� ���
	public static int[] get_rank(double[] _avg, int _total_student) {
		int[] rank = new int[_total_student];
		double cur_stand_score = 0F;
		
		for(int i = 0; i < _total_student; i++) {
			cur_stand_score = _avg[i];
			
			for(int j = 0; j < _total_student; j++) {
				if(_avg[j] <= cur_stand_score) {
					rank[j]++;
				}
			}
		}
		
		return rank;
	}
	
	
	// ���
	// @author	:	Chocobe
	// @param	:	String[] _name	: �л� �̸�
	//			:	int[][] _score	: �� ����
	//			:	int[] _total_score	: �л��� �� ��
	//			:	double[] _avg	: �л��� ��� ����
	//			:	int[] _rank		: �л��� ���
	// @return	:	N/A
	public static void print_result(
			String[] _name, int[][] _score, int[] _total_score,
			double[] _avg, int[] _rank) 
	{
		print_line();
		
		int total_student = _name.length;
		
		for(int i = 0; i < total_student; i++) {
			System.out.printf("%4s |", _name[i]);
			
			for(int j = 0; j < SUB_COUNT; j++) {
				System.out.printf("%3d |", _score[i][j]);
			}
			
			System.out.printf("%3d |", _total_score[i]);
			System.out.printf("%.2f |", _avg[i]);
			System.out.printf("%4d ", _rank[i]);
			System.out.println();
		}
		
		print_line();
	}
	
	public static void print_line() {
		System.out.println("--------------------------------------");
	}
}