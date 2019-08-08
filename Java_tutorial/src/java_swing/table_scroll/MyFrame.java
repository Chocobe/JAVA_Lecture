package java_swing.table_scroll;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class MyFrame extends JFrame {
	JPanel southPanel;
	JButton insertButton;
	JButton deleteButton;
	JButton selectAllButton;
	JTable table;
	JScrollPane scroll;
	
	
	public MyFrame() {
		super();
		initButton();
		initTable();
		initFrame();
		combineComponent();
	}
	
	
	public void initFrame() {
		this.setBounds(500, 200, 400, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void guiRun() {
		combineComponent();
		this.setVisible(true);
	}
	
	
	public void initButton() {
		this.insertButton = new JButton("입력버튼");
		this.deleteButton = new JButton("삭제버튼");
		this.selectAllButton = new JButton("출력버튼");
	}
	
	
	public void initTable() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("번호");
		model.addColumn("이름");
		model.addColumn("연락처");
		model.addColumn("이메일");
		model.addColumn("주소");
		
		table = new JTable(model);
		// 테이블 크기 고정
		table.getTableHeader().setResizingAllowed(false);
		// 테이블 위치 고정
		table.getTableHeader().setReorderingAllowed(false);
		
		scroll = new JScrollPane();
		scroll.setViewportView(table);
	}
	
	
	public void combineComponent() {
		this.southPanel = new JPanel();
		
		this.southPanel.add(insertButton);
		this.southPanel.add(deleteButton);
		this.southPanel.add(selectAllButton);
		
		this.getContentPane().add(southPanel, BorderLayout.SOUTH);
		this.getContentPane().add(scroll);
	}
	
	
	public void insertTestData(
					String _no, String _name, String _tel,
					String _email, String _addr) {
		
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.addRow(new String[] {_no, _name, _tel, _email, _addr});
		table.setModel(model);
	}
}
