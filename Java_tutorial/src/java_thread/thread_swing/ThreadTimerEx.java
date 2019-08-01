package java_thread.thread_swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class ThreadTimerEx extends JFrame {
	JLabel timerLabel = new JLabel();
	
	public ThreadTimerEx() {
		this.init_component();
	}
	
	
	public void init_component() {
		this.setTitle("Thread를 상속받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		TimerThread th = new TimerThread(this.timerLabel);
		
		this.setSize(300, 170);
		this.setVisible(true);
		
		th.start();
	}
	
	
	public static void main(String[] args) {
		new ThreadTimerEx();
	}
}
