package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent.adminOptionComponent;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.SystemDialog;
import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent.SortPanel;

public class AdminTableDialog extends JDialog{
	private SystemDialog parentDialog;
	private JPanel outerPanel;
	private SortPanel sortPanel;
	private JTable infoTable;
	
	private String[] tupleName = { "무기", "이름", "공격력", "회심", "슬롯" };
	
	public AdminTableDialog(SystemDialog parent) {
		this.parentDialog = parent;
		this.initDialog();
		this.initTopPanel();
		
		this.initOptionPanel();
		
		this.initCloseOperation();
		
		this.initTablePanel();
		
		this.setVisible(true);
	}
	
	
	private void initDialog() {
		this.setBounds(this.parentDialog.getLocation().x +
					   			(int)this.parentDialog.getSize().getWidth(),
					   this.parentDialog.getLocation().y,
					   (int)this.parentDialog.getSize().getWidth(),
					   (int)this.parentDialog.getSize().getHeight());
		
		this.outerPanel = new JPanel();
		this.add(outerPanel);
	}
	
	
	private void initTopPanel() {
		parentDialog.initTopPanel(this, "Stored Weapon Data");
	}
	
	private void initOptionPanel() {
		this.sortPanel = new SortPanel(this);
		this.outerPanel.add(this.sortPanel);
		// SortPanel ActionListener 추가할 것
	}
		
	
	private void initTablePanel() {
		JPanel tablePanel = new JPanel(new BorderLayout());
		tablePanel.setPreferredSize(
						new Dimension((int)this.getSize().getWidth() - 30,
						(int)this.getSize().getHeight() - 210));
		
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(this.tupleName);
		
		this.infoTable = new JTable(model);
		
		JScrollPane scroll = new JScrollPane(this.infoTable);
		tablePanel.add(scroll, BorderLayout.CENTER);
		
		this.outerPanel.add(tablePanel);
		
		// 테스트
	}
	
	
	public void setModel(DefaultTableModel model) {
		this.infoTable.setModel(model);
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
	
	
	public String[] getTupleName() {
		return this.tupleName;
	}
}
