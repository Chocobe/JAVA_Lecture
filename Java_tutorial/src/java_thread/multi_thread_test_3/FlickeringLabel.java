package java_thread.multi_thread_test_3;

import java.awt.Color;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class FlickeringLabel extends JLabel implements Runnable {
	private long delay;

	public FlickeringLabel(String _text, long _delay) {
		super(_text);
		this.delay = _delay;
		
		
		//뭔지 찾아볼 것
		this.setOpaque(true);
		
		
		Thread th = new Thread(this);
		th.start();
	}
	
	
	@Override
	public void run() {
		int flag = 0;

		while(true) {
			if(flag == 0) {
				this.setBackground(Color.MAGENTA);
				flag = 1;
				
			} else {
				this.setBackground(Color.CYAN);
				flag = 0;
			}
			
			this.setVisible(false);
			this.setVisible(true);
			
			try {
				Thread.sleep(this.delay);
				
			} catch(InterruptedException e) {
				return;
			}
		}
	}
}
