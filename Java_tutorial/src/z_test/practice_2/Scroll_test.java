package z_test.practice_2;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Scroll_test {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Scroll & Table & Model Test");
		frame.setBounds(500, 300, 400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("번호");
		model.addColumn("이름");
		model.addColumn("연락처");
		model.addColumn("주소");
		
		JTable table = new JTable(model);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.getTableHeader().setReorderingAllowed(false);
		table.getTableHeader().setResizingAllowed(false);
		
		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(table);
		
		frame.getContentPane().add(scroll);
		
		frame.setVisible(true);
	}
}
