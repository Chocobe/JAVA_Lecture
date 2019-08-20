package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent.adminOptionComponent;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import project_07_MonsterHunter_Weapon_DB.WeaponDTO.WeaponsDTO;
import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.SystemDialog;
import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent.InfoDialog;
import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent.SortPanel;

@SuppressWarnings("serial")
public class AdminTableDialog extends JDialog{
	private SystemDialog parentDialog;
	private JPanel outerPanel;
	private SortPanel sortPanel;
	private JTable infoTable;
	
	private String[] tupleName = { "무기", "이름", "공격력", "회심", "슬롯" };
	private ArrayList<WeaponsDTO> resultData;
	
	
// 초기화
	public AdminTableDialog(SystemDialog parent) {
		this.parentDialog = parent;
		
		this.initDialog();
		this.initTopPanel();
		
		this.initOptionPanel();
		
		this.initCloseOperation();
		
		this.initTablePanel();
		
		this.setVisible(true);
	}
	
	
// Dialog 초기화
	private void initDialog() {
		this.setTitle("전체 데이터");
		this.setBounds(this.parentDialog.getLocation().x +
					   			(int)this.parentDialog.getSize().getWidth(),
					   this.parentDialog.getLocation().y,
					   (int)this.parentDialog.getSize().getWidth(),
					   (int)this.parentDialog.getSize().getHeight());
		
		this.outerPanel = new JPanel();
		this.add(outerPanel);
	}
	
	
// TopPanel 초기화
	private void initTopPanel() {
		parentDialog.initTopPanel(this, "Stored Weapon Data");
	}

// OptionPanel 초기화
	private void initOptionPanel() {
		this.sortPanel = new SortPanel(this);
		this.outerPanel.add(this.sortPanel);
	}
		
	
// 자신 반환 메소드
	private AdminTableDialog getMe() {
		return this;
	}
	
	
// TablePanel 초기화
	private void initTablePanel() {
		MouseAdapter listener = new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				super.mouseReleased(e);
				
				InfoDialog infoDialog = new InfoDialog(getMe(), "삭제");
				infoDialog.showInfo(resultData.get(infoTable.getSelectedRow()));
			}
		};
		
		
		JPanel tablePanel = new JPanel(new BorderLayout());
		tablePanel.setPreferredSize(
						new Dimension((int)this.getSize().getWidth() - 30,
						(int)this.getSize().getHeight() - 210));
		
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(this.tupleName);
		
		this.infoTable = new JTable(model);
		this.infoTable.getTableHeader().setReorderingAllowed(false);
		this.infoTable.getTableHeader().setResizingAllowed(false);
		this.infoTable.setColumnSelectionAllowed(false);
		this.infoTable.addMouseListener(listener);
		
		
		JScrollPane scroll = new JScrollPane(this.infoTable);
		tablePanel.add(scroll, BorderLayout.CENTER);
		
		this.outerPanel.add(tablePanel);
	}
	
	
// DefaultTableModel setter
	public void setModel(DefaultTableModel model) {
		this.infoTable.setModel(model);
	}
	
	
// 창닫기 동작 초기화
	private void initCloseOperation() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				parentDialog.dispose();
			}
		});
	}
	
	
// 테이블 필드명 getter
	public String[] getTupleName() {
		return this.tupleName;
	}
	
	
// Model에 입력된 데이터 setter
	public void setResultData(ArrayList<WeaponsDTO> resultData) {
		this.resultData = resultData;
	}
}
