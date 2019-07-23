package project_convenience_store.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Main_center_panel extends JPanel {
// 메인 필드 컴포넌트
	private JPanel main_field_panel;
	public JLabel label_main_name;
	public JLabel label_main_sales_price;
	public JLabel label_main_number;
	
	
// 관리 필드 컴포넌트
	private JPanel manage_field_panel;
	public JLabel label_manage_name;
	public JLabel label_manage_origin_price;
	public JLabel label_manage_sales_price;
	public JLabel label_manage_remain_number;
	public JLabel label_manage_profit;
	
	
	private Font font;
	
// 생성자
	public Main_center_panel(Font _font) {
		super();
		this.font = _font;
		
		this.init_main();
		
		this.init_main_field_component();
		
		this.init_manage_field_component();
		
		this.init_manage_panel();
		
		this.init_main_panel();
		
		this.visible_main_panel();
	}
	

// this 초기화
	public void init_main() {
		this.setPreferredSize(new Dimension(750, 500));
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
	}
	
	
// 메인 필드 컴포넌트 초기화
	private void init_main_field_component() {
		this.main_field_panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		this.label_main_name = new JLabel("상품명");
		this.label_main_name.setFont(this.font);
		this.label_main_name.setPreferredSize(new Dimension(200, 20));
		
		this.label_main_sales_price = new JLabel("가 격");
		this.label_main_sales_price.setFont(this.font);
		this.label_main_sales_price.setPreferredSize(new Dimension(120, 20));
		
		this.label_main_number = new JLabel("개 수");
		this.label_main_number.setFont(this.font);
		this.label_main_number.setPreferredSize(new Dimension(100, 20));
	}
	

// 관리 필드 컴포넌트 초기화
	private void init_manage_field_component() {
		this.manage_field_panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		this.label_manage_name = new JLabel("상품명");
		this.label_manage_name.setFont(font);
		this.label_manage_name.setPreferredSize(new Dimension(200, 20));
		
		this.label_manage_sales_price = new JLabel("판매가");
		this.label_manage_sales_price.setFont(font);
		this.label_manage_sales_price.setPreferredSize(new Dimension(150, 20));
		
		this.label_manage_origin_price = new JLabel("원 가");
		this.label_manage_origin_price.setFont(this.font);
		this.label_manage_origin_price.setPreferredSize(new Dimension(150, 20));
		
		this.label_manage_remain_number = new JLabel("재 고");
		this.label_manage_remain_number.setFont(this.font);
		this.label_manage_remain_number.setPreferredSize(new Dimension(120, 20));
		
		this.label_manage_profit = new JLabel("수익금");
		this.label_manage_profit.setFont(this.font);
		this.label_manage_profit.setPreferredSize(new Dimension(150, 20));
	}
	
	
// 메인 패널 초기화(add)
	private void init_main_panel() {
		this.main_field_panel.add(this.label_main_name);
		this.main_field_panel.add(this.label_main_number);
		this.main_field_panel.add(this.label_main_sales_price);
		
		this.add(this.main_field_panel);
	}
	
	
// 관리 패널 초기화(add)
	private void init_manage_panel() {
		this.manage_field_panel.add(this.label_manage_name);
		this.manage_field_panel.add(this.label_manage_origin_price);
		this.manage_field_panel.add(this.label_manage_sales_price);
		this.manage_field_panel.add(this.label_manage_profit);
		this.manage_field_panel.add(this.label_manage_remain_number);
		
		this.add(manage_field_panel);
	}
	
	
// 메인 패널 On
	public void visible_main_panel() {
		this.manage_field_panel.setVisible(false);
		this.main_field_panel.setVisible(true);
		System.out.println("메인");
	}
	
	
// 관리 패널 On
	public void visible_manage_panel() {
		this.main_field_panel.setVisible(false);
		this.manage_field_panel.setVisible(true);
		System.out.println("관리");
	}
}
