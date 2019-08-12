package z_test.test;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

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
		
		ButtonGroup weapons_group = new ButtonGroup();
		
		JRadioButton radio_1 = new JRadioButton("대검");
		weapons_group.add(radio_1);
		top_1.add(radio_1);
		
		JRadioButton radio_2 = new JRadioButton("태도");
		weapons_group.add(radio_2);
		top_1.add(radio_2);
		
		JToggleButton button_1 = new JToggleButton("Button_1");
		top_1.add(button_1);
		weapons_group.add(button_1);
		
		JToggleButton button_2 = new JToggleButton("Button_2");
		top_1.add(button_2);
		weapons_group.add(button_2);

		
		
		
		JPanel Second = new JPanel();
		tabbedPane.addTab("Second", null, Second, null);
		
		JMenuBar menuBar = new JMenuBar();
		frame.getContentPane().add(menuBar, BorderLayout.NORTH);
		
		JMenu mnMenu = new JMenu("Menu_1");
		mnMenu.addSeparator();
		menuBar.add(mnMenu);
		
		JMenuItem mntmSubmenu = new JMenuItem("Sub_Menu_1");
		mnMenu.add(mntmSubmenu);
		
		JMenuItem mntmSubmenu_1 = new JMenuItem("Sub_Menu_2");
		mnMenu.add(mntmSubmenu_1);
		
		JMenu mnMenu_1 = new JMenu("Menu_2");
		menuBar.add(mnMenu_1);
		
		JMenuItem mntmSubmenu_2 = new JMenuItem("Sub_Menu_3");
		mnMenu_1.add(mntmSubmenu_2);
		
		JMenuItem mntmSubmenu_3 = new JMenuItem("Sub_Menu_4");
		mnMenu_1.add(mntmSubmenu_3);
	}
}
