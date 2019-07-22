package vending_machine.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public abstract class Base_frame extends JFrame {
	protected final static int size_x;
	protected final static int size_y;
	
	protected Dimension dim_screen;
	protected Dimension dim_window;
	
	protected int location_x;
	protected int location_y;

	
// 클래스 변수 초기화
	static {
		size_x = 700;
		size_y = 500;
	}
	
	
// 생성자
	protected Base_frame() {
		this.setSize(Base_frame.size_x, Base_frame.size_y);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		this.dim_screen = kit.getScreenSize();
		this.dim_window = this.getSize();
		this.location_x =
				(int)this.dim_screen.getWidth() / 2 -
				(int)this.dim_window.getWidth() / 2;
		this.location_y =
				(int)this.dim_screen.getHeight() / 2 -
				(int)this.dim_window.getHeight() / 2;
		this.setLocation(this.location_x, this.location_y);
		
		this.setLayout(new BorderLayout());
	}
	
	
	protected abstract void set_default_close_operation();
	
	
// 
}
