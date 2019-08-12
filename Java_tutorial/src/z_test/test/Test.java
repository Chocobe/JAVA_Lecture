package z_test.test;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;

public class Test {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
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
	public Test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel first = new JPanel();
		first.setToolTipText("");
		tabbedPane.addTab("FIrst", null, first, null);
		
		JPanel top_1 = new JPanel();		
		top_1.setBorder(new TitledBorder(null, "무기", TitledBorder.LEADING, TitledBorder.TOP, new Font("고딕", Font.BOLD, 15), null));
		top_1.setPreferredSize(new Dimension((int)frame.getSize().getWidth() - 30, 100));
		top_1.setBackground(new Color(0, 255, 153));
		top_1.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 10));
		first.add(top_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("대검");
		top_1.add(rdbtnNewRadioButton);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		top_1.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("New toggle button");
		top_1.add(tglbtnNewToggleButton_1);
		
		
		
		JPanel Second = new JPanel();
		tabbedPane.addTab("Second", null, Second, null);
	}
}
