package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import project_07_MonsterHunter_Weapon_DB.WeaponDTO.WeaponsDTO;
import project_07_MonsterHunter_Weapon_DB.weaponsDAO.WeaponsDAO;
import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.MainFrame;

@SuppressWarnings("serial")
public class OptionGroupPanel extends JPanel {
	
	private OptionPanel sortPanel;
	private OptionPanel attributePanel;
	private OptionPanel slotLevelPanel;
	private OptionPanel numOfSlotPanel;
	private OptionPanel treePanel;
	private JPanel searchPanel;
	private JPanel tablePanel;
	private JTable dataTable;
	
	private String[] tupleName = { "이름", "공격력", "회심", "슬롯" };
	private ArrayList<WeaponsDTO> resultData;
	
	private MainFrame frame;
	
	private WeaponsDAO dao;
	private WeaponsDTO dto;
	private InfoDialog infoDialog;
	
	public OptionGroupPanel(MainFrame frame) {
		this.frame = frame;
		initOptionPanels();
		initTable();
		this.dao = new WeaponsDAO(frame);
	}
	
	
	private void initOptionPanels() {
		this.sortPanel = new SortPanel(this.frame);
		this.add(sortPanel);
		
		this.attributePanel = new AttributePanel(this.frame);
		this.add(attributePanel);
		
		this.slotLevelPanel = new SlotLevelPanel(this.frame);
		this.add(slotLevelPanel);
		
		this.numOfSlotPanel = new NumOfSlot(this.frame);
		this.add(numOfSlotPanel);
		
		this.treePanel = new TreePanel(this.frame);
		this.add(treePanel);
		
		this.initSearchButton();
		this.add(searchPanel);
	}
	
	
	private void initSearchButton() {
		this.searchPanel = new JPanel();
		LineBorder border = new LineBorder(Color.LIGHT_GRAY, 2);
		searchPanel.setBorder(border);
		searchPanel.setPreferredSize(new Dimension(frame.getSize_x() - 40, 38));
		searchPanel.setBackground(Color.WHITE);
		
		JButton searchButton = new JButton("검색");
		searchButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String sql = "SELECT * FROM WEAPONS WHERE \t\n";
				sql += getSelectedOption();
				
				resultData = dao.selectData(sql);
				
				for(int i = 0; i < resultData.size(); i++) {
					WeaponsDTO dto = resultData.get(i);
					System.out.println("--------------------------");
					System.out.println("NAME : " + dto.getName());
					System.out.println("SORT : " + dto.getSort());
					System.out.println("DAMAGE : " + dto.getDamage());
					System.out.println("CRITICAL : " + dto.getCritical());
					System.out.println("GRADE : " + dto.getGrade());
					System.out.println("ATTRIBUTE : " + dto.getAttribute());
					System.out.println("ATTRIBUTE_VAL : " + dto.getAttribute_val());
					System.out.println("SLOT_1 : " + dto.getSlot_1());
					System.out.println("SLOT_2 : " + dto.getSlot_2());
					System.out.println("SLOT_3 : " + dto.getSlot_3());
					System.out.println("NumOfSlot : " + dto.getNumOfSlot());
					System.out.println("MATERIAL : " + dto.getMaterial());
					System.out.println("TREE : " + dto.getTree());
					System.out.println("TreePosition : " + dto.getTree_position());
					System.out.println("--------------------------");
				}
				
				System.out.println("--------------------------");
				System.out.println("SQL : " + sql);
				System.out.println("--------------------------");
				
				setTableModel();
			}
		});
		
		this.searchPanel.add(searchButton);
	}
	
	
	public String getSelectedOption() {
		String sql = "";
		String sort = this.sortPanel.getSelectedOption();
		String attribute = this.attributePanel.getSelectedOption();
		String slot = this.slotLevelPanel.getSelectedOption();
		String numOfSlot = this.numOfSlotPanel.getSelectedOption();
		String tree = this.treePanel.getSelectedOption();
		
		sql = sort;
		
		if(!attribute.equals("")) {
			sql += " AND " + attribute;
		}
		
		if(!slot.equals("")) {
			sql += " AND " + slot;
		}
		
		if(!numOfSlot.equals("")) {
			sql += " AND " + numOfSlot;
		}
		
		if(!tree.equals("")) {
			sql += " AND " + tree;
		}
		
		System.out.println("sql : " + sql);
		
		return sql;
	}
	
	
	private void initTable() {
		this.tablePanel = new JPanel(new BorderLayout());
		tablePanel.setPreferredSize(new Dimension(frame.getSize_x() - 40, 120));
		
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(this.tupleName);
		
		this.dataTable = new JTable();
		this.dataTable.getTableHeader().setReorderingAllowed(false);
		this.dataTable.getTableHeader().setResizingAllowed(false);
		this.dataTable.setFocusable(false);
		this.dataTable.setModel(model);
		
		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(this.dataTable);
		
		tablePanel.add(scroll);
		
		this.dataTable.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent e) {
				super.mouseClicked(e);

				infoDialog = new InfoDialog(frame, "추가");
				infoDialog.showInfo(resultData.get(dataTable.getSelectedRow()));
			}			
		});
		
		this.add(tablePanel);
	}
	
	
	private void setTableModel() {
		String[][] searchedData = new String[this.resultData.size()][4];
		this.dto = null;

		for(int i = 0; i < this.resultData.size(); i++) {
			dto = this.resultData.get(i);
			
			searchedData[i][0] = dto.getName();
			searchedData[i][1] = String.valueOf(dto.getDamage());
			searchedData[i][2] = String.valueOf(dto.getCritical());
			searchedData[i][3] = String.valueOf(dto.getNumOfSlot());
		}
		
		DefaultTableModel model = 
						new DefaultTableModel(searchedData, this.tupleName);
		
		this.dataTable.setModel(model);
	}
	
}
