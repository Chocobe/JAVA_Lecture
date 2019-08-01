package java_thread.thread_synchronized;

public class StudentThread extends Thread {
	private SharedBoard board;	// 집계판의 참조변수
	
	
	public StudentThread(String name, SharedBoard board) {
		super(name);	// 매개변수 : 쓰레드 이름
		this.board = board;
	}
	
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			this.board.add();
		}
	}
}
