package java_thread.thread_count_test;

public class Count_test {
	public static void main(String[] args) {
		Count count = new Count();
		
		Thread my_thread_1 = new Thread(new Count_thread(count));
		Thread my_thread_2 = new Thread(new Count_thread(count));
		Thread my_thread_3 = new Thread(new Count_thread(count));
		Thread my_thread_4 = new Thread(new Count_thread(count));
		
		my_thread_1.start();
		my_thread_2.start();
		my_thread_3.start();
		my_thread_4.start();
	}
}
