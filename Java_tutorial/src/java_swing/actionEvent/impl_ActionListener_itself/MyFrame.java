package java_swing.actionEvent.impl_ActionListener_itself;

import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	private int size_width;
	private int size_height;
	
	private int pos_x;
	private int pos_y;
	
	private Dimension dim_screen;
	private Dimension dim_window;
}
