package z_test.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Test_3 extends JFrame {
	private final static int SIZE_X;
	private final static int SIZE_Y;
	
	private final static String[] FIELD_NAME = {"Hello", "JAVA"};
	
	static {
		SIZE_X = 500;
		SIZE_Y = 500;
	}
	
	private JTable table;
	private DefaultTableModel model;
	
	public Test_3() {
		this.setSize(SIZE_X, SIZE_Y);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		initTable();
		
		JButton button = new JButton("버튼");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				addTuple();
			}
		});
		this.getContentPane().add(button, BorderLayout.SOUTH);
	}
	
	private void initTable() {
		JPanel outerPanel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(true);
		panel_1.setPreferredSize(new Dimension(500, 100));
		panel_1.setBackground(Color.BLUE);
		outerPanel.add(panel_1);
		
		this.table = new JTable();
		table.getTableHeader().setReorderingAllowed(false);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		this.model = new DefaultTableModel();
		model.setColumnIdentifiers(FIELD_NAME);
		
		table.setModel(model);
		
		JScrollPane scroll = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setBounds(10, 10, 200, 100);
		
		scroll.setViewportView(table);
		

//		panel.setPreferredSize(new Dimension(500, 100));
		outerPanel.add(scroll);
		
		this.add(outerPanel);
		
//		initSouthPanel();
	}
	
	
	private void initSouthPanel() {
		JButton button = new JButton("버튼1");
		this.add(button, BorderLayout.NORTH);
	}
	
	
	private void addTuple() {
		DefaultTableModel model = new DefaultTableModel();
		String[][] data = { {"Hi", "World"},
							{"Hello", "JAVA"},
							{"Hello", "JAVA"},
							{"Hello", "JAVA"},
							{"Hello", "JAVA"},
							{"Hello", "JAVA"},
							{"Hello", "JAVA"},
							{"Hello", "JAVA"},
							{"Hello", "JAVA"},
							{"Hello", "JAVA"},
							{"Hi", "World"}, 
							{"Hi", "World"},
							{"Hello", "JAVA"},
							{"Hello", "JAVA"},
							{"Hello", "JAVA"},
							{"Hello", "JAVA"},
							{"Hello", "JAVA"},
							{"Hello", "JAVA"},
							{"Hello", "JAVA"},
							{"Hello", "JAVA"},
							{"Hello", "JAVA"},
							{"Hi", "World"}};
		
		model.setDataVector(data, FIELD_NAME);		
		this.table.setModel(model);
	}
	
	
	public static void main(String[] args) {
		new Test_3();
		
	}
}
