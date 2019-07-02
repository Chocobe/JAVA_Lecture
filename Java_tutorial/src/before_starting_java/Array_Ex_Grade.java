package before_starting_java;

// 배열 예제 7
// 입력 : (메인 매개변수 사용)
//		이름, 국어점수, 영어점수, 수학점수
// 출력 :
//		이름, 국어점수, 영어점수, 수학점수, 총점, 평균, 등수 (7개)

public class Array_Ex_Grade {	
	
	public static final int SUB_COUNT = 3;
	
	public static void main(String[] args) {
		
		final int TOTAL_STUDENT = args.length / 4;
		
		String[] arr_name = new String[TOTAL_STUDENT];	// 이름 저장소
		int[][] arr_score = null;						// 각 과목별 점수 저장소
		int[] arr_total_score = null;					// 총점 저장소
		double[] arr_avg_score = null;					// 평균 저장소
		int[] arr_rank = null;							// 등수 저장소
		
		// 1. 이름 추출
		arr_name = get_name(args, TOTAL_STUDENT);
		
		// 2. 점수 추출
		arr_score = get_score(args, TOTAL_STUDENT);
		
		// 3. 총점
		arr_total_score = get_total_score(arr_score, TOTAL_STUDENT);
		
		// 4. 평균
		arr_avg_score = get_avg_score(arr_total_score, TOTAL_STUDENT);

		// 5. 등수
		arr_rank = get_rank(arr_avg_score, TOTAL_STUDENT);

		// 6. 출력
		print_attribute();
		print_result(arr_name, arr_score, arr_total_score, arr_avg_score, arr_rank);
	} // main
	
	
	// 속성명 출력
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public static void print_attribute() {
		System.out.printf("%4s |%3s |%3s |%3s |%3s |%4s   | %3s", 
						  "학생명", "국 어", "영 어", "수 학", "총 점", "평 균", "등 수");
		System.out.println();
	}
	
	
	// 이름 추출
	// @author	:	Chocobe
	// @param	:	String[] _args	: 메인 메소드 인자값
	//			:	int _total_student	: 학생 수
	// @return	:	(String[]) 추출한 이름
	public static String[] get_name(String[] _args, int _total_student) {		
		String name[] = new String[_total_student];
		
		for(int i = 0; i < _total_student; i++) {
			name[i] = _args[i * (SUB_COUNT + 1)];
		}
		
		return name;
	}
	
	
	// 국어/영어/수학 점수 추출
	// @author	:	Chocobe
	// @param	:	String[] _args	: 메인 메소드 인자값
	//			:	int _total_student	: 학생 수
	// @return	:	(int[][]) 추출한 각 점수
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
	
	
	// 총합 계산
	// @author	:	Chocobe
	// @param	:	int[][] _score	: 추출한 각 점수
	//			:	int _total_student	: 총 학생 수
	// @return	:	(int[]) 학생별 총 합
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
	
	
	// 평균 계산
	// @author	:	Chocobe
	// @param	:	int[] _total_score	: 학생별 총 합
	//			:	int _total_student	: 학생 수
	// @return	:	(double[]) 학생별 평균 점수
	public static double[] get_avg_score(int[] _total_score, int _total_student) {
		double[] avg = new double[_total_student];
		for(int i = 0; i < _total_student; i++) {
			avg[i] = (double)_total_score[i] / SUB_COUNT;
		}
		return avg;
	}
	
	
	// 등수 계산
	// @author	:	Chocobe
	// @param	:	double[] _avg	: 학생별 평균 점수
	//			:	int _total_student	: 학생 수
	// @return	:	(int[]) 학생별 등수
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
	
	
	// 출력
	// @author	:	Chocobe
	// @param	:	String[] _name	: 학생 이름
	//			:	int[][] _score	: 각 점수
	//			:	int[] _total_score	: 학생별 총 합
	//			:	double[] _avg	: 학생별 평균 점수
	//			:	int[] _rank		: 학생별 등수
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