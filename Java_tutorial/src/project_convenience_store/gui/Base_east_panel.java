package project_convenience_store.gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Base_east_panel extends JPanel {
	private JPanel main_panel;
	private JPanel manage_panel;
	
	private JLabel total_price_title;
	private JLabel total_price;
	private JButton button_calc;
	
	private JButton button_totalization;
	private JButton button_new_product;
	
	
// 생성자
	public Base_east_panel() {
		super();
		
		init_main_panel();
		init_manage_panel();
		
		this.add(this.main_panel);
		this.add(this.manage_panel);
		
		this.setVisible(true);
	}
	
	
// 메인부 패널 초기화
	private void init_main_panel() {
		this.main_panel = new JPanel(new GridLayout(1, 0, 10, 20));
	}
	
	
// 관리부 패널 초기화
	private void init_manage_panel() {
		
	}
	
}
