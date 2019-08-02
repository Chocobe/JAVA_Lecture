package java_thread.thread_count_test;

public class Count {
	private int value;
	
	
	public Count() {
		this.value = 0;
	}
	
	
	public void print_count() {
		System.out.println(this.value);
	}
	
	
	public void increment() {
		this.value++;
	}
	
	
	public void decrement() {
		this.value--;
	}
}
