package z_test.practice2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CenterPanel extends JPanel {
	private DefaultTableModel model;
	private JTable table;
	private JScrollPane scroll;
	
	private JFrame frame;
	
	
	public CenterPanel() {
		initTable();
	}
	
	
	public void initFrame(JFrame _frame) {
		this.frame = _frame;
	}
	
	
	private void initTable() {
		model = new DefaultTableModel();
		model.addColumn("이름");
		model.addColumn("주소");
		
		table = new JTable(model);
		table.getTableHeader().setResizingAllowed(false);
		table.getTableHeader().setReorderingAllowed(false);
		
		scroll = new JScrollPane(table);
		
		this.add(scroll);
	}
}
