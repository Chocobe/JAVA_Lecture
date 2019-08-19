package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent.adminOptionComponent;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;

import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.SystemDialog;

public class AdminTableDialog extends JDialog{
	private SystemDialog parentDialog;
	
	public AdminTableDialog(SystemDialog parent) {
		this.parentDialog = parent;
		this.initDialog();
		this.initTopPanel();
		
		this.initCloseOperation();
		
		this.setVisible(true);
	}
	
	
	private void initDialog() {
		this.setBounds(this.parentDialog.getLocation().x +
					   			(int)this.parentDialog.getSize().getWidth(),
					   this.parentDialog.getLocation().y,
					   (int)this.parentDialog.getSize().getWidth(),
					   (int)this.parentDialog.getSize().getHeight());
		
	}
	
	
	private void initTopPanel() {
		parentDialog.initTopPanel(this, "Stored Weapon Data");
	}
	
	private void initOptionPanel() {
		
	}
	
	private void initTablePanel() {
		
	}
	
	
	private void initCloseOperation() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				parentDialog.dispose();
			}
		});
	}
}
