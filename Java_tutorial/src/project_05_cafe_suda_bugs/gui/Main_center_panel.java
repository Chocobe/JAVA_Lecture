package project_05_cafe_suda_bugs.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import project_05_cafe_suda_bugs.Product_manager;
import project_05_cafe_suda_bugs.product.Product;

@SuppressWarnings("serial")
public class Main_center_panel extends JPanel {
// 메인 필드 컴포넌트
	private JPanel panel_main_field;
	public JLabel label_main_name;
	public JLabel label_main_sales_price;
	public JLabel label_main_number;
	
	
	private JComboBox<String> combox_product_name;
	private JPanel panel_main_attribute;
	private JTextField text_select_number;
	public JLabel one_price;
	public JButton button_confirm;
	public JButton button_cancel;
	
	private int[] confirmed_price;
	private int[] confirmed_product_count;
	private String[] confirmed_product_name;
	private int confirmed_count;
	private int cur_product_remain;
	private String cur_product_name;
	
	
// 관리 필드 컴포넌트
	private JPanel panel_manage_field;
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
	private ActionListener action_listener;
	
	
// 생성자
	public Main_center_panel(Font _font) {
		super();
		this.font = _font;
		
		this.init_item_listener();
		
		this.init_action_listener();
		
		this.init_main();
		
		this.init_main_field_component();
		
		this.init_manage_field_component();
		
		this.init_main_panel();
		
		this.init_manage_panel();
	}
	
	
// confirmed
	public int[] get_confirmed_price() {
		return this.confirmed_price;
	}
	
	public int[] get_confirmed_product_count() {
		return this.confirmed_product_count;
	}
	
	public String[] get_confirmed_product_name() {
		return this.confirmed_product_name;
	}
	
	public int get_confirmed_count() {
		return this.confirmed_count;
	}

	public int get_total_price() {
		int sum = 0;
		for(int i : this.confirmed_price) {
			sum += i;
		}
		
		return sum;
	}


// this 초기화
	public void init_main() {
		this.setPreferredSize(new Dimension(700, 100));
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.border_field = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK);
		this.border_attribute = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK);
		
		this.dim_name = new Dimension(200, 21);
		this.dim_others = new Dimension(120, 21);
		
		
	}
	
	
// 메인 필드 컴포넌트 초기화
	private void init_main_field_component() {
		this.panel_main_field = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 10));
		this.panel_main_attribute = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
		
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
		
		this.button_confirm = new JButton("결정");
		this.button_confirm.setFont(this.font);
		this.button_confirm.addActionListener(this.action_listener);
		
		this.button_cancel = new JButton("취소");
		this.button_cancel.setFont(this.font);
		this.button_confirm.addActionListener(this.action_listener);
		
		this.confirmed_count = 0;
		this.confirmed_product_name = new String[5];
		this.confirmed_price = new int[5];
		this.confirmed_product_count = new int[5];
		this.cur_product_remain = 0;
	}
	

// 관리 필드 컴포넌트 초기화
	private void init_manage_field_component() {
		this.panel_manage_field = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 10));
		
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
		this.panel_main_field.add(this.label_main_name);
		this.panel_main_field.add(this.label_main_number);
		this.panel_main_field.add(this.label_main_sales_price);
		
		this.add(this.panel_main_field);
	}
	
	
// 관리 패널 초기화(add)
	private void init_manage_panel() {
		this.panel_manage_field.add(this.label_manage_name);
		this.panel_manage_field.add(this.label_manage_origin_price);
		this.panel_manage_field.add(this.label_manage_sales_price);
		this.panel_manage_field.add(this.label_manage_profit);
		this.panel_manage_field.add(this.label_manage_remain_number);
		
		this.add(this.panel_manage_field);
	}
	

// 메인 속성 라벨 생성
	public void add_main_attribute() {
		this.panel_main_attribute.setPreferredSize(new Dimension(630, 500));
		
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

		this.button_confirm = new JButton("결정");
		this.button_confirm.setFont(this.font);
		this.button_confirm.addActionListener(this.action_listener);
		
		this.button_cancel = new JButton("취소");
		this.button_cancel.setFont(this.font);
		this.button_cancel.addActionListener(this.action_listener);
		
		this.panel_main_attribute.add(this.combox_product_name);
		this.panel_main_attribute.add(this.text_select_number);
		this.panel_main_attribute.add(this.one_price);

		this.add(this.panel_main_attribute);
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
		this.panel_main_attribute = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
		this.init_main_panel();
		
		// 콤보박스 추가
		this.add_main_attribute();	// 컴포넌트 추가/수정 필요
		this.panel_main_attribute.add(this.button_confirm);
		this.panel_main_attribute.add(this.button_cancel);
		
		this.panel_main_field.setVisible(true);
		this.panel_manage_field.setVisible(false);
		
		repaint();
	}
	
	
// 관리 모드 전환
	public void change_to_manage_mode() {
		this.removeAll();
		this.init_manage_panel();
		
		Main_frame.get_frame().output_all_product_info();
		
		this.panel_main_field.setVisible(false);
		this.panel_manage_field.setVisible(true);
		
		repaint();
	}
	
	
// ItemListener 초기화
	private void init_item_listener() {
		this.item_listener = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println(e.getItem());
					
					String product_name = (String)e.getItem();
					Product cur_product = Product_manager.get_manager().get_product(product_name);
					
					one_price.setText(Integer.toString(cur_product.get_sales_price()));
					cur_product_remain = cur_product.get_remain_number();
					cur_product_name = product_name;
					
				}// end if
			}// end itemStateChanged()
		};
	}// end init_item_listener()
	
	

	
	
// 결제금 초기화
	public void init_confirmed() {
		for(int i = 0; i < this.confirmed_price.length; i++) {
			this.confirmed_price[i] = 0;
			this.confirmed_product_name[i] = "";
			this.confirmed_product_count[i] = 0;	
		}
		
		this.confirmed_count = 0;
		this.cur_product_remain = 0;
	}
	
	
// 과정 취소(결제 취소)
	private void init_sequence() {
		
		for(int i = 0; i < confirmed_product_name.length; i++) {
			System.out.print("상품명 : " + confirmed_product_name[i] + " ");
			System.out.print("가격 : " + confirmed_price[i] + " ");
			System.out.print("구매 개수 : " + confirmed_product_count[i]);
			System.out.println();
		}
		
		init_confirmed();
		
		Main_frame.get_frame().east_panel.set_total_price(0);
		change_to_manage_mode();
		change_to_main_mode();
	}
	
	
// ActionListener 초기화
	private void init_action_listener() {
		this.action_listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();
				
				switch(command) {
				case "결정":
					int number = 0;
					int price = 0;
					
					System.out.println(number);
					System.out.println(price);
					
					if(confirmed_count < 5) {
						int require_number = 0;

						try {
							number = Integer.parseInt(text_select_number.getText());
							price = Integer.parseInt(one_price.getText());
							
							require_number = number;
						
						} catch(Exception err) {
							init_sequence();
							
							return;
						}// end try ~ catch
						
						if(require_number > cur_product_remain) {
							// 팝업 출력 필요
							init_sequence();
							
							return;
						}// end if
						
						combox_product_name.setEnabled(false);
						text_select_number.setEnabled(false);
						
						if(confirmed_count < 4) {
							add_main_attribute();
							panel_main_attribute.setVisible(false);
							panel_main_attribute.setVisible(true);
						}// end if
						
						confirmed_product_count[confirmed_count] = number;
						confirmed_price[confirmed_count] = number * price;
						confirmed_product_name[confirmed_count] = cur_product_name;
						
						int sum = get_total_price();
						
						Main_frame.get_frame().east_panel.set_total_price(sum);
						
						System.out.println(confirmed_count);
						confirmed_count++;
					}// end if
					
					System.out.println("결정 동작 이상해");
					break;
				// end case "결정":
					
				case "취소":
					init_sequence();
					
					System.out.println("취소 동작");
					break;
				}// end switch
			}// end actionPerformed()
		};
	}// end init_action_listener()
}
