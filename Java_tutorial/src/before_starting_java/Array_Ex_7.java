package before_starting_java;

public class Array_Ex_7 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		int len = numArr.length;
		
		for(int i = 0; i < len; i++) {
			numArr[i] = i;
		}
		
		for(int i = 0; i < 100; i++) {
			int n = (int)(Math.random() * 10);
			int temp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = temp;
		}
		
		for(int i = 0; i < len; i++) {
			System.out.print("numArr[" + i + "] : " + numArr[i] + " ");
		}
	}
}
