package java_thread.thread_count_test;

public class Count_thread implements Runnable {
	private Count shared_count;
	
	
	public Count_thread(Count _count) {
		this.shared_count = _count;
	}
	
	
	@Override
	public void run() {
		for(int i = 0; i < 20000; i++) {
			this.shared_count.increment();
			this.shared_count.decrement();
			
			if(i % 400 == 0) {
				this.shared_count.print_count();
			}
			
			try {
				Thread.sleep((int)Math.random() * 500 + 1);
				
			} catch(InterruptedException e) {
				return;
			}
		}
	}
}
