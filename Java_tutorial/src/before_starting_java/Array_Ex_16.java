package before_starting_java;

public class Array_Ex_16 {
	public static void main(String[] args) {
		if(args.length != 0) {
			System.out.println("�Ű����� ���� : " + args.length);
			
			for(int i = 0; i < args.length; i++) {
				System.out.println("args[" + i + "] :\"" + args[i] + "\"");
			}
			
		} else {
			System.out.println("Usage(����) : java Array_Ex_16 �Ű�����");
		}
	} //main
}
