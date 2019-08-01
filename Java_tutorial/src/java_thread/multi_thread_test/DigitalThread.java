package java_thread.multi_thread_test;

public class DigitalThread extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
	}
}
