package before_starting_java;

public class String_test {
	public static void main(String[] args) {
		// 문자열 배열의 초기화
		//
		String[] name_1 = new String[3];

		name_1[0] = "Chocobe";
		name_1[1] = "Lucid";
		name_1[2] = "Moon";
		
		String[] name_2 = { "Chocobe", "Lucid", "Moon" };
		
		System.out.println("name_1 출력");
		for(int i = 0; i < name_1.length; i++) {
			System.out.println("name_1[" + i + "] : " + name_1[i]);
		}
		
		
		print_line();
		
		
		// String[]를 향상된 for문으로 출력하기
		//
		System.out.println("name_2 출력");
		for(String str : name_2) {
			System.out.println(str);
		}
		
		
		print_line();
		
		
		// String에서 char하나씩 추출하기
		//
		String src = "ABCDE";
		
		for(int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			System.out.print(ch + " ");
		}
	}
	
	
	public static void print_line() {
		System.out.println("--------------------------------");
	}
}
