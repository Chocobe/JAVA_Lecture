package java_thread.thread_interrupt;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class ThreadInterruptEx extends JFrame {
	private Thread th;
	
	
	public ThreadInterruptEx() {
		this.setTitle("thread Interrupt 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		TimerRunnable runner = new TimerRunnable(timerLabel);
		this.th = new Thread(runner);
		c.add(timerLabel);
		
		
		JButton button = new JButton("kill timer");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				th.interrupt();
				JButton btn = (JButton)e.getSource();
				btn.setEnabled(false);
			}
		});
		
		c.add(button);
		this.setSize(300, 170);
		this.setVisible(true);
		
		this.th.start();
	}
	
	
	public static void main(String[] args) {
		new ThreadInterruptEx();
	}
}
