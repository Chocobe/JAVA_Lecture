package before_starting_java;

public class String_test {
	public static void main(String[] args) {
		// ���ڿ� �迭�� �ʱ�ȭ
		//
		String[] name_1 = new String[3];

		name_1[0] = "Chocobe";
		name_1[1] = "Lucid";
		name_1[2] = "Moon";
		
		String[] name_2 = { "Chocobe", "Lucid", "Moon" };
		
		System.out.println("name_1 ���");
		for(int i = 0; i < name_1.length; i++) {
			System.out.println("name_1[" + i + "] : " + name_1[i]);
		}
		
		
		print_line();
		
		
		// String[]�� ���� for������ ����ϱ�
		//
		System.out.println("name_2 ���");
		for(String str : name_2) {
			System.out.println(str);
		}
		
		
		print_line();
		
		
		// String���� char�ϳ��� �����ϱ�
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
