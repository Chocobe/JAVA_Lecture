package project_convenience_store.gui;

import java.awt.BorderLayout;
import java.awt.Font;

@SuppressWarnings("serial")
public class Main_frame extends Base_frame {
	private static Main_frame main_frame = new Main_frame(); 	
	
	public Font font_menu;
	
	public Main_north_panel north_panel;
	public Main_east_panel east_panel;
	
	private Main_frame() {
		super();
		
		this.set_frame_title();
		
		this.init_font();
		
		this.init_north_panel();
		this.init_east_panel();
		
		this.setVisible(true);
	}
	
	
	public static Main_frame get_main_frame() {
		return Main_frame.main_frame;
	}
	
	
	private void init_font() {
		this.font_menu = new Font(null, Font.PLAIN, 25);
	}
	
	
	private void init_north_panel() {
		this.north_panel = new Main_north_panel(this.font_menu);
		this.add(this.north_panel, BorderLayout.NORTH);
	}
	
	
	private void init_east_panel() {
		this.east_panel = new Main_east_panel(this.font_menu);
		this.add(this.east_panel, BorderLayout.EAST);		
	}
	
	
	private void init_center_panel() {
		
	}
	
	
	@Override
	protected void set_frame_title() {
		this.setTitle("ZS25 system");
	}
}
