package java_thread.thread_swing;

import javax.swing.JLabel;

public class TimerThread extends Thread{
	private JLabel timerLabel;
	
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	
	@Override
	public void run() {
		int n = 0;
		
		while(true) {
			this.timerLabel.setText(Integer.toString(n));
			n++;
			
			try {
				// 1000 -> 1초
				Thread.sleep(1000);
				
			} catch(InterruptedException e) {
				return;
			}
		}
	}
}
