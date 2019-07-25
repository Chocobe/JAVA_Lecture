package project_cafe_suda_bugs.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public abstract class Base_frame extends JFrame {
	protected final static int size_x;
	protected final static int size_y;
	
	private Dimension dim_screen;
	private Dimension dim_window;
	
	private int location_x;
	private int location_y;
	
	
// 클래스 변수 초기화
	static {
		size_x = 1000;
		size_y = 700;
	}
	
	
// 생성자
	protected Base_frame() {
		super();
		this.init_frame();
	}
	
	
// 프레임 초기화
	private void init_frame() {
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
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setResizable(false);
	}
	
	
// 프레임 타이틀
	protected abstract void set_frame_title();
}
