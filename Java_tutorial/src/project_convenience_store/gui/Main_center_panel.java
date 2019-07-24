package project_convenience_store.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import project_convenience_store.Product_manager;
import project_convenience_store.product.Product;

@SuppressWarnings("serial")
public class Main_center_panel extends JPanel {
// 메인 필드 컴포넌트
	private JPanel main_field_panel;
	public JLabel label_main_name;
	public JLabel label_main_sales_price;
	public JLabel label_main_number;
	
	private JComboBox<String> combox_product_name;
	private JTextField text_select_number;
	public JLabel one_price;
	
	
// 관리 필드 컴포넌트
	private JPanel manage_field_panel;
	public JLabel label_manage_name;
	public JLabel label_manage_origin_price;
	public JLabel label_manage_sales_price;
	public JLabel label_manage_remain_number;
	public JLabel label_manage_profit;
	
	
// label 길이
	private Dimension dim_name;
	private Dimension dim_others;
	

// 경계선
	private Border border_field;
	private Border border_attribute;
	private Font font;
	
	
	private ItemListener item_listener;
	
	
// 생성자
	public Main_center_panel(Font _font) {
		super();
		this.font = _font;
		
		this.init_item_listener();
		
		this.init_main();
		
		this.init_main_field_component();
		
		this.init_manage_field_component();
		
		this.init_main_panel();
		
		this.init_manage_panel();
		
		this.add_main_attribute();
	}
	

// this 초기화
	public void init_main() {
		this.setPreferredSize(new Dimension(700, 500));
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.border_field = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK);
		this.border_attribute = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK);
		
		this.dim_name = new Dimension(200, 21);
		this.dim_others = new Dimension(120, 21);
		
		
	}
	
	
// 메인 필드 컴포넌트 초기화
	private void init_main_field_component() {
		this.main_field_panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 10));
		
		this.label_main_name = new JLabel("상품명", JLabel.LEFT);
		this.label_main_name.setFont(this.font);
		this.label_main_name.setPreferredSize(this.dim_name);
		this.label_main_name.setBorder(border_field);
		
		this.label_main_sales_price = new JLabel("단위가격", JLabel.RIGHT);
		this.label_main_sales_price.setFont(this.font);
		this.label_main_sales_price.setPreferredSize(this.dim_others);
		this.label_main_sales_price.setBorder(this.border_field);
		
		this.label_main_number = new JLabel("개 수", JLabel.RIGHT);
		this.label_main_number.setFont(this.font);
		this.label_main_number.setPreferredSize(this.dim_others);
		this.label_main_number.setBorder(this.border_field);
	}
	

// 관리 필드 컴포넌트 초기화
	private void init_manage_field_component() {
		this.manage_field_panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 10));
		
		this.label_manage_name = new JLabel("상품명", JLabel.LEFT);
		this.label_manage_name.setFont(font);
		this.label_manage_name.setPreferredSize(this.dim_name);
		this.label_manage_name.setBorder(this.border_field);
		
		this.label_manage_sales_price = new JLabel("판매가", JLabel.RIGHT);
		this.label_manage_sales_price.setFont(font);
		this.label_manage_sales_price.setPreferredSize(this.dim_others);
		this.label_manage_sales_price.setBorder(this.border_field);
		
		this.label_manage_origin_price = new JLabel("원 가", JLabel.RIGHT);
		this.label_manage_origin_price.setFont(this.font);
		this.label_manage_origin_price.setPreferredSize(this.dim_others);
		this.label_manage_origin_price.setBorder(this.border_field);
		
		this.label_manage_remain_number = new JLabel("재 고", JLabel.RIGHT);
		this.label_manage_remain_number.setFont(this.font);
		this.label_manage_remain_number.setPreferredSize(this.dim_others);
		this.label_manage_remain_number.setBorder(this.border_field);
		
		this.label_manage_profit = new JLabel("수익금", JLabel.RIGHT);
		this.label_manage_profit.setFont(this.font);
		this.label_manage_profit.setPreferredSize(this.dim_others);
		this.label_manage_profit.setBorder(this.border_field);
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
		
		this.add(this.manage_field_panel);
	}
	
	
//
// JLabel ->> JTextField 변경하기
// 메인 속성 라벨 생성
	public void add_main_attribute() {
		JPanel temp_panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
		temp_panel.setPreferredSize(new Dimension(500, 500));
		
		ArrayList<String> all_product_name = Product_manager.get_manager().get_all_product_name();
		String[] all_name = all_product_name.toArray(new String[all_product_name.size()]);
		this.combox_product_name = new JComboBox<String>(all_name);
		this.combox_product_name.setFont(this.font);
		this.combox_product_name.setPreferredSize(new Dimension(195, 30));
		this.combox_product_name.addItemListener(this.item_listener);
		
		this.text_select_number = new JTextField(7);
		this.text_select_number.setFont(this.font);
		
		this.one_price = new JLabel("",JLabel.RIGHT);
		this.one_price.setFont(this.font);
		this.one_price.setPreferredSize(new Dimension(110, 30));
		
		this.one_price.setBorder(this.border_attribute);
		
		temp_panel.add(this.combox_product_name);
		temp_panel.add(this.text_select_number);
		temp_panel.add(this.one_price);
		
		this.add(temp_panel);		
	}
	
	
// 관리 속성 라벨 생성
	public void add_manage_attribute(String _name, int _origin_price,
			int _sales_price, int _profit, int _remain_number) {
		
		JPanel temp_panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 10));
		
		JLabel temp_name = new JLabel(_name, JLabel.LEFT);
		temp_name.setFont(this.font);
		temp_name.setPreferredSize(this.dim_name);
		temp_name.setBorder(this.border_attribute);
		
		JLabel temp_origin_price = new JLabel(Integer.toString(_origin_price), JLabel.RIGHT);
		temp_origin_price.setFont(this.font);
		temp_origin_price.setPreferredSize(this.dim_others);
		temp_origin_price.setBorder(this.border_attribute);
		
		JLabel temp_sales_price = new JLabel(Integer.toString(_sales_price), JLabel.RIGHT);
		temp_sales_price.setFont(this.font);
		temp_sales_price.setPreferredSize(this.dim_others);
		temp_sales_price.setBorder(this.border_attribute);
		
		JLabel temp_profit = new JLabel(Integer.toString(_profit), JLabel.RIGHT);
		temp_profit.setFont(this.font);
		temp_profit.setPreferredSize(this.dim_others);
		temp_profit.setBorder(this.border_attribute);
		
		JLabel temp_number = new JLabel(Integer.toString(_remain_number), JLabel.RIGHT);
		temp_number.setFont(this.font);
		temp_number.setPreferredSize(this.dim_others);
		temp_number.setBorder(this.border_attribute);
		
		temp_panel.add(temp_name);
		temp_panel.add(temp_origin_price);
		temp_panel.add(temp_sales_price);
		temp_panel.add(temp_profit);
		temp_panel.add(temp_number);
		
		this.add(temp_panel);
	}
	
	
// 메인 모드 전환
	public void change_to_main_mode() {
		this.removeAll();
		this.init_main_panel();
		
		// 콤보박스 추가
		 this.add_main_attribute();	// 컴포넌트 추가/수정 필요
		

		
		this.main_field_panel.setVisible(true);
		this.manage_field_panel.setVisible(false);
		
		repaint();
	}
	
	
// 관리 모드 전환
	public void change_to_manage_mode() {
		this.removeAll();
		this.init_manage_panel();
		
		Main_frame.get_frame().output_all_product_info();
		
		this.main_field_panel.setVisible(false);
		this.manage_field_panel.setVisible(true);
		
		repaint();
	}
	
	
	private void init_item_listener() {
		this.item_listener = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println(e.getItem());
					
					String cur_product_name = (String)e.getItem();
					Product cur_product = Product_manager.get_manager().get_product(cur_product_name);
					
					one_price.setText(Integer.toString(cur_product.get_sales_price()));
					repaint();
				}// end if
			}// end itemStateChanged()
		};
	}// end init_item_listener()
}
