package before_starting_java;

public class Array_Ex_16 {
	public static void main(String[] args) {
		if(args.length != 0) {
			System.out.println("매개변수 개수 : " + args.length);
			
			for(int i = 0; i < args.length; i++) {
				System.out.println("args[" + i + "] :\"" + args[i] + "\"");
			}
			
		} else {
			System.out.println("Usage(사용법) : java Array_Ex_16 매개변수");
		}
	} //main
}
