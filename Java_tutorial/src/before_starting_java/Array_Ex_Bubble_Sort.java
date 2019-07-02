package before_starting_java;

public class Array_Ex_Bubble_Sort {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		boolean isChanged = false;
		
		System.out.println("버블정렬 전 : ");
		for(int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int)(Math.random() * 10));
			System.out.print(" ");
		}
		System.out.println("\n");
		
		System.out.println("버블정렬 후 : ");
		for(int i = 0; i < numArr.length - 1; i++) {
			
			for(int j = 0; j < numArr.length - i - 1; j++) {
				if(numArr[j] > numArr[j + 1]) {
					int temp = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = temp;
					
					isChanged = true;
				}
			}
			
			if(!isChanged) {
				break;
			}
			
			isChanged = false;
		}
		
		for(int i : numArr) {
			System.out.print(i + " ");
		}
	}
}
