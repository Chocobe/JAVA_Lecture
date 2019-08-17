package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

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
	
	private String[] tupleName = { "이름", "예리도", "공격력", "회심", "슬롯" };
	
	private MainFrame frame;
	
	private WeaponsDAO dao;	
	
	public OptionGroupPanel(MainFrame frame) {
		this.frame = frame;
		initOptionPanels();
		initTable();
		this.dao = new WeaponsDAO();
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
		LineBorder border = new LineBorder(Color.GRAY);
		searchPanel.setBorder(border);
		searchPanel.setPreferredSize(new Dimension(frame.getSize_x() - 20, 38));
		
		JButton searchButton = new JButton("검색");
		searchButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String sql = "SELECT * FROM WEAPONS WHERE \t\n";
				sql += getSelectedOption();
				
				ArrayList<WeaponsDTO> data = dao.selectData(sql);
				
				for(int i = 0; i < data.size(); i++) {
					WeaponsDTO dto = data.get(i);
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
		
		return sql;
	}
	
	
	private void initTable() {
		this.tablePanel = new JPanel(new BorderLayout());
		tablePanel.setPreferredSize(new Dimension(frame.getSize_x() - 20, 100));
		
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(this.tupleName);
		
		this.dataTable = new JTable();
		this.dataTable.setModel(model);
		
		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(this.dataTable);
		
		tablePanel.add(scroll);
		
		this.add(tablePanel);
	}
}




















