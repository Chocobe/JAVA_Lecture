package before_starting_java.Static_val_init;

public class Test_class {
	public static int pos_x;
	public static int pos_y;
	
	public int size_x;
	public int size_y;
	
	static {
		// static변수의 초기화 수행
		pos_x = 2;
		pos_y = 2;
		
		// static변수(클래스변수)가 아니면 사용 불가
		// size_x = 3;
		// size_y = 3;
	}
}
