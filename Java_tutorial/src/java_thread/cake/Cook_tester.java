package java_thread.cake;

public class Cook_tester {
	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		
		(new Thread(new Cook(buffer))).start();
		(new Thread(new Consumer(buffer))).start();
	}
}
