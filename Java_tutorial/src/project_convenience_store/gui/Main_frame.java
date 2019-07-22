package project_convenience_store.gui;

@SuppressWarnings("serial")
public class Main_frame extends Base_frame {

	public Main_frame() {
		super();
		this.set_frame_title();
		
		this.setVisible(true);
	}
	
	
	@Override
	protected void set_frame_title() {
		this.setTitle("ZS25 system");
	}
	
}
