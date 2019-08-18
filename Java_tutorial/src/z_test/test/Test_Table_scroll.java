package z_test.test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Test_Table_scroll {

	private JFrame frame;
	private JPanel northPanel;
	private JPanel southPanel;
	private JButton northButton;
	private JButton southButton;
	private JPanel centerPanel;
	private JPanel centerFirstPanel;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test_Table_scroll window = new Test_Table_scroll();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Test_Table_scroll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		northPanel = new JPanel();
		frame.getContentPane().add(northPanel, BorderLayout.NORTH);
		
		northButton = new JButton("northButton");
		northPanel.add(northButton);
		
		southPanel = new JPanel();
		frame.getContentPane().add(southPanel, BorderLayout.SOUTH);
		
		southButton = new JButton("southButton");
		southPanel.add(southButton);
		
		centerPanel = new JPanel();
		frame.getContentPane().add(centerPanel, BorderLayout.CENTER);
		
		centerFirstPanel = new JPanel();
		centerFirstPanel.setPreferredSize(new Dimension(300, 50));
		centerFirstPanel.setBackground(Color.GRAY);
		centerPanel.add(centerFirstPanel);
		
		JPanel innerPanel = new JPanel(new BorderLayout());
		innerPanel.setPreferredSize(new Dimension(300, 100));
		
		scrollPane = new JScrollPane();
//		scrollPane.setBounds(0, 0, 100, 100);
		innerPanel.add(scrollPane);
		
		centerPanel.add(innerPanel);
		
		table = new JTable();
		table.setEnabled(false);
		String[][] data = {{"java", "시작"},
						   {"java", "hello"},
						   {"java", "hello"},
						   {"java", "hello"},
						   {"java", "hello"},
						   {"java", "hello"},
						   {"java", "hello"},
						   {"java", "hello"},
						   {"java", "hello"},
						   {"java", "hello"},
						   {"java", "hello"},
						   {"java", "hello"},
						   {"java", "hello"},
						   {"java", "hello"},
						   {"java", "hello"},
						   {"java", "hello"},
						   {"java", "hello"},
						   {"java", "hello"},
						   {"java", "hello"},
						   {"java", "hello"},
						   {"java", "hello"},
						   {"java", "마지막"}};
		String[] name = {"언어", "인사"};
		DefaultTableModel model = new DefaultTableModel(data, name);
		table.setModel(model);
		
		
		
		scrollPane.setViewportView(table);
	}

}
