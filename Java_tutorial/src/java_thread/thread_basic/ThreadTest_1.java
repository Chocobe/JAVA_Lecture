package java_thread.thread_basic;

class TimerThread extends Thread {
	int n = 0;

	@Override
	public void run() {
		while(true) {
			System.out.println("n : " + n);
			n++;
			
			try {
				// 1 / 1000 초
				sleep(1000);
				
			} catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class ThreadTest_1 {
	public static void main(String[] args) {
		TimerThread th = new TimerThread();
		th.start();
		
		System.out.println("main메소드() ... ");
	}
}
