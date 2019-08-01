package java_thread.thread_synchronized;

public class SharedBoard {
	private int sum = 0;	// 집계판의 합
	
	
	synchronized public void add() {
		int n = this.sum;
		
		Thread.yield();		// 현재 실행 중인 쓰레드 양보
		
		n += 10;
		sum = n;
		System.out.println(Thread.currentThread().getName() + " : " + sum);
	}
	
	
	public int getSum() {
		return this.sum;
	}
}
