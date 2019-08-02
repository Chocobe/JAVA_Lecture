package java_thread.cake;

public class Cook implements Runnable {
	private Buffer buffer;
	
	
	public Cook(Buffer _buffer) {
		this.buffer = _buffer;
	}

	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			this.buffer.put(i);
			System.out.println("요리사 : " + i + "번 케익을 생산하였습니다");
			
			try {
				Thread.sleep((int)(Math.random() * 1000) + 1);
				
			} catch(InterruptedException e) {}
		}
	}
}
