package java_thread.multi_thread_test_2;

import java.util.Random;

public class Horse implements Runnable {
	private final static Random rnd = new Random();
	private int sleepTime;
	private String name;
	
	
	public Horse(String _name) {
		this.name = _name;
		this.sleepTime = Horse.rnd.nextInt(3000);
	}
	
	
	@Override
	public void run() {
		try {
			Thread.sleep(this.sleepTime);
			
		} catch(InterruptedException e) {
			return;
		}
		
		System.out.println(this.name + " 경주 완료");
	}
}
