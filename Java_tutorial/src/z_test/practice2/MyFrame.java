package z_test.practice2;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class MyFrame extends JFrame {
	private JPanel panel_1;
	private JTable table;
	private DefaultTableModel model;
	private JScrollPane scroll;
	
	
	public MyFrame() {
		this.setBounds(500, 300, 300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		initTable();
		initPanel();
		combineComponents();
	}
	
	
	private void initTable() {
		model = new DefaultTableModel();
		model.addColumn("이름");
		model.addColumn("번호");
		
		table = new JTable(model);
		table.getTableHeader().setReorderingAllowed(false);
		table.getTableHeader().setResizingAllowed(false);
		table.setEnabled(false);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		scroll = new JScrollPane();
		scroll.setViewportView(table);
	}
	
	
	private void initPanel() {
		TitledBorder border = BorderFactory.createTitledBorder(new LineBorder(Color.BLACK), "타이틀");
		
		panel_1 = new JPanel(new BorderLayout());
		panel_1.setBorder(border);		
	}
	
	
	private void combineComponents() {
		panel_1.add(scroll, BorderLayout.CENTER);
		this.getContentPane().add(panel_1);
	}
	
	
	public void runFrame() {
		this.setVisible(true);
	}
}
