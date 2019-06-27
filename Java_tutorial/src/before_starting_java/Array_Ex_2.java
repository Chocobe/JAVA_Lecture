package before_starting_java;

import java.util.Arrays;

public class Array_Ex_2 {
	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = new int[] {100, 95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};

		int len_iArr1 = iArr1.length;
		int len_iArr2 = iArr2.length;
		
		for(int i = 0; i < len_iArr1; i++) {
			iArr1[i] = i + 1;
		}
		
		for(int i = 0; i < len_iArr2; i++) {
			iArr2[i] = (int)(Math.random() * 10) + 1;
		}
		
		for(int i = 0; i < len_iArr1; i++) {
			System.out.print(iArr1[i] + ", ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
	}
}
