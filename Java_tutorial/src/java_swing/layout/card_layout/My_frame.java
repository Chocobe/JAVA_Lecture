package java_swing.layout.card_layout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class My_frame extends JFrame implements ActionListener {
	private int size_x;
	private int size_y;
	
	private Dimension dim_screen;
	private Dimension dim_window;
	
	private int pos_x;
	private int pos_y;
	
	public My_frame() {
		this.init();
	}
	
	
	public void init() {
		this.size_x = 500;
		this.size_y= 500;
		this.setSize(this.size_x, this.size_y);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		this.dim_screen = kit.getScreenSize();
		this.dim_window = this.getSize();
		this.pos_x = (int)this.dim_screen.getWidth() / 2 - (int)this.dim_window.getWidth() / 2;
		this.pos_y = (int)this.dim_screen.getHeight() / 2 - (int)this.dim_window.getHeight() / 2;
		this.setLocation(this.pos_x, this.pos_y);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
	}
	
	
	public void add_component() {
		// y축:무한대, x축:5개씩, 수평간격:10, 수직간격:0
		JPanel panel = new JPanel(new GridLayout(0, 5, 10, 0));
		
	}
	
	
	public void add_button(String _title, Container _target_panel) {
		JButton button = new JButton(_title);
		button.addActionListener(this);
		_target_panel.add(button);
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
