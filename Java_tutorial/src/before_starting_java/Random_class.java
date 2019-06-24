package before_starting_java;

import java.util.Random;

public class Random_class {
	public static void main(String[] args) {
		int dise = 0;
		Random random = new Random(System.currentTimeMillis());
		
		for(int i = 0; i < 20; i++) {
			dise = random.nextInt(6) + 1;
			
			if(i % 5 == 0 && i != 0)
				System.out.println();
			
			System.out.print(dise + " ");
		}
	}
}
