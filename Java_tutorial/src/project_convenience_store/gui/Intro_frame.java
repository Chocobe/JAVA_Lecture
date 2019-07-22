package project_convenience_store.gui;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Intro_frame extends Base_frame {	
	public Intro_frame() {
		super();
		this.set_default_close_operation();
		
		this.setVisible(true);
	}
	
	
	@Override
	protected void set_default_close_operation() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	@Override
	protected void set_frame_title() {
		// TODO Auto-generated method stub
		
	}
}
