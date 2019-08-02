package java_thread.cake;

// 케익을 임시로 보관하기 위한 Buffer 클래스

public class Buffer {
	private int data;
	private boolean empty = true;
	
	
	public synchronized int get() {
		while(this.empty) {
			try {
				this.wait();
				
			} catch(InterruptedException e) {}
		}
		
		this.empty = true;
		this.notifyAll();
		
		return this.data;
	}
	
	
	public synchronized void put(int _data) {
		while(!this.empty) {
			try {
				this.wait();
				
			} catch(InterruptedException e) {}
		}
		
		this.empty = false;
		this.data = _data;
		this.notifyAll();
	}
}
