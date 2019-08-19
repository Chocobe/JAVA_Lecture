package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import project_07_MonsterHunter_Weapon_DB.WeaponDTO.WeaponsDTO;
import project_07_MonsterHunter_Weapon_DB.weaponsDAO.WeaponsDAO;
import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.MainFrame;

@SuppressWarnings("serial")
public class FavoriteGroupPanel extends JPanel {
	private MainFrame frame;

	private JTable dataTable;
	private String[] tupleName = { "무기", "이름", "공격력", "회심", "슬롯" };
	
	private ArrayList<WeaponsDTO> resultData;
	
	private InfoDialog infoDialog;
	private WeaponsDAO dao;
	
	public FavoriteGroupPanel(MainFrame frame) {
		this.frame = frame;
		this.dao = new WeaponsDAO(frame);	
		initPanel();
		initTable();
		setTableModel();
	}
	
	
	private void initPanel() {
		this.setLayout(new BorderLayout());
		this.setBackground(Color.GRAY);
	}
	
	
	private void initTable() {
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(this.tupleName);
		
		this.dataTable = new JTable();
		this.dataTable.getTableHeader().setReorderingAllowed(false);
		this.dataTable.getTableHeader().setResizingAllowed(false);
		this.dataTable.setFocusable(false);
		this.dataTable.setModel(model);
		
		this.dataTable.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseReleased(e);
				
				infoDialog = new InfoDialog(frame, "제거");
				infoDialog.showInfo(resultData.get(dataTable.getSelectedRow()));
			}
		});
		
		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(this.dataTable);
		
		this.add(scroll);
	}
	
	
	public void setTableModel() {
		this.resultData = this.dao.selectFavorite();
		WeaponsDTO dto = new WeaponsDTO();
		
		String[][] searchData = new String[this.resultData.size()][5];
		
		for(int i = 0; i < this.resultData.size(); i++) {
			dto = this.resultData.get(i);
			
			searchData[i][0] = dto.getSort();
			searchData[i][1] = dto.getName();
			searchData[i][2] = String.valueOf(dto.getDamage());
			searchData[i][3] = String.valueOf(dto.getCritical());
			searchData[i][4] = String.valueOf(dto.getSlot_1());
		}
		
		DefaultTableModel model = 
						new DefaultTableModel(searchData, this.tupleName);
		
		this.dataTable.setModel(model);
	}
}
