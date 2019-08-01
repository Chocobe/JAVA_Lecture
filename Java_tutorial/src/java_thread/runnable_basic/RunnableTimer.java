package java_thread.runnable_basic;

public class RunnableTimer implements Runnable {
	int n = 0;

	@Override
	public void run() {
		while(true) {
			System.out.println(n);
			n++;
			
			try {
				Thread.sleep(1000);
				
			} catch(InterruptedException e) {
				return;
			}
		}
	}
	
	
	public static void main(String[] args) {
		Thread th = new Thread(new RunnableTimer());
		th.start();
	}
}
