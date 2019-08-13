package z_test.test;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test_1 extends JFrame {
	
	JComboBox<String> com1;	
	JComboBox<String> com2;
	
	public Test_1() {
		this.setSize(300, 300);
		this.setLocation(500, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		init();
		
		this.setVisible(true);
	}
	
	public void init() {
		ItemListener listener = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				
				System.out.println("동작");
				
				if(e.getStateChange() == ItemEvent.SELECTED) {
					if(com1.getSelectedItem().equals("0")) {
						com2.setSelectedIndex(0);
					}
				}
			}
		};
		
		JPanel panel = new JPanel();
		String[] arr = {"0", "1", "2", "3"};
		com1 = new JComboBox<String>(arr);
		com1.addItemListener(listener);
		panel.add(com1);
		
		com2 = new JComboBox<String>(arr);
		com2.addItemListener(listener);
		panel.add(com2);
		
		this.add(panel);
	}
	
	public static void main(String[] args) {
		new Test_1();
	}
}
