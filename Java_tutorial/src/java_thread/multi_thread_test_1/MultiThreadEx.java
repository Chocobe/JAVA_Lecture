package java_thread.multi_thread_test_1;

public class MultiThreadEx {
	public static void main(String[] args) {
		DigitalThread th_1 = new DigitalThread();
		DigitalThread th_2 = new DigitalThread();
		DigitalThread th_3 = new DigitalThread();
		
		th_1.start();
		th_2.start();
		th_3.start();
		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
			
			try {
				Thread.sleep(1000);
				
			} catch(InterruptedException e) {
				return;
			}
		}
	}
}
