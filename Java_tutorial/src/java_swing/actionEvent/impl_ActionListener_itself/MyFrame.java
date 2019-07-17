package java_swing.actionEvent.impl_ActionListener_itself;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	private int size_width;
	private int size_height;
	
	private int pos_x;
	private int pos_y;
	
	private Dimension dim_screen;
	private Dimension dim_window;
	
	JButton bt_next;
	JButton bt_previous;
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
