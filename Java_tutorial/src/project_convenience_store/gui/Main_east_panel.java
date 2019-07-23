package project_convenience_store.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Main_east_panel extends JPanel {
	private JPanel main_panel;
	private JPanel manage_panel;
	
	private JLabel main_title;
	private JPanel total_price_panel;
	private JLabel total_price;
	private JButton button_calc;
	
	private JLabel manage_title;
	private JButton button_totalization;
	private JButton button_new_product;
	
	private ActionListener action_listener;
	
	private Font font;
	
// 생성자
	public Main_east_panel(Font _font) {
		super();
		
		this.font = _font;
		
		this.init_main_panel();
		
		this.init_manage_panel();
	}
	
	
// 메인부 패널 초기화
	private void init_main_panel() {
		this.setPreferredSize(new Dimension(200, 300));
		
		this.main_title = new JLabel("    Total price    ");
		this.main_title.setFont(this.font);
		
		this.total_price = new JLabel("1111");
		this.total_price.setFont(this.font);
		
		this.total_price_panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		this.total_price_panel.setBackground(Color.LIGHT_GRAY);
		this.total_price_panel.add(this.total_price);
		
		this.button_calc = new JButton("계산");
		this.button_calc.setFont(this.font);
		// button_calc.addActionListener
		
		this.main_panel = new JPanel(new GridLayout(0, 1, 20, 25));
		this.main_panel.add(this.main_title);
		this.main_panel.add(this.total_price_panel);
		this.main_panel.add(this.button_calc);
		
		this.add(main_panel);
	}
	
	
// 관리부 패널 초기화
	private void init_manage_panel() {
		this.manage_title = new JLabel("Manager Mode");
		this.manage_title.setFont(font);
		
		this.button_totalization = new JButton("정산");
		this.button_totalization.setFont(this.font);
		// addActionListener
		
		this.button_new_product = new JButton("신규");
		this.button_new_product.setFont(font);
		// addActionListener
		
		this.manage_panel = new JPanel(new GridLayout(0, 1, 20, 25));
		this.manage_panel.add(this.manage_title);
		this.manage_panel.add(this.button_totalization);
		this.manage_panel.add(this.button_new_product);
		this.manage_panel.setVisible(false);
		
		this.add(manage_panel);
	}
	
	
	public void visible_main_panel() {
		this.main_panel.setVisible(true);
		this.manage_panel.setVisible(false);
		System.out.println("visible_main_panel 동작");
	}
	
	
	public void visible_manage_panel() {
		this.manage_panel.setVisible(true);
		this.main_panel.setVisible(false);
		System.out.println("visible_manage_panel 동작");
	}
}
