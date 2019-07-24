package project_convenience_store.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import project_convenience_store.Product_manager;
import project_convenience_store.product.Product;


@SuppressWarnings("serial")
public class Main_east_panel extends JPanel {
// 메인 모드 컴포넌트
	private JPanel main_panel;	
	private JLabel main_title;
	private JPanel total_price_panel;
	private JLabel total_price;
	private JButton button_calc;

// 관리 모드 컴포넌트
	private JPanel manage_panel;
	private JLabel manage_title;
	private JButton button_totalization;
	private JButton button_supplement;
	
	private ActionListener action_listener;

// 정산 팝업 컴포넌트
	private JDialog dialog_totalization;
	private JLabel label_profit;
	private JButton button_ok;
	private JPanel south_panel;
	
	private int size_x;
	private int size_y;
	
	private Dimension dim_screen;
	private Dimension dim_window;
	
	private int location_x;
	private int location_y;
	
// 보충 팝업 컴포넌트
	private JDialog dialog_supplement;
	private JList<String> list_product_name;
	private JLabel label_supply;
	private JTextField text_supply;
	private JButton button_supply;
	private JButton button_complete;
	
	private Font font;
	
	
// 에러 팝업 컴포넌트
	private JDialog dialog_err;
	private JPanel panel_err_center;
	private JPanel panel_err_south;
	private JLabel label_err;
	
	
//--------------------------------------------------//
//	//											//	//	
//					--- 초기화 ---					//
//	//											//	//
//--------------------------------------------------//
	
	
// 생성자
	public Main_east_panel(Font _font) {
		super();
		
		this.font = _font;
		
		this.init_action_listener();
		
		this.init_main_panel();
		
		this.init_manage_panel();
		
		this.init_totalization_dialog_spec();
		
		this.init_supplement_dialog_spec();
	}
	
	
	public void set_total_price(int _price) {
		this.total_price.setText(Integer.toString(_price));
	}
	
	
// 메인부 패널 초기화
	private void init_main_panel() {
		this.setPreferredSize(new Dimension(200, 300));
		
		this.main_title = new JLabel("    Total price    ");
		this.main_title.setFont(this.font);
		
		this.total_price = new JLabel("");
		this.total_price.setFont(this.font);
		
		this.total_price_panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		this.total_price_panel.setBackground(Color.LIGHT_GRAY);
		this.total_price_panel.add(this.total_price);
		
		this.button_calc = new JButton("계산");
		this.button_calc.setFont(this.font);
		this.button_calc.addActionListener(this.action_listener);
		
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
		this.button_totalization.addActionListener(this.action_listener);
		
		this.button_supplement = new JButton("보충");
		this.button_supplement.setFont(font);
		this.button_supplement.addActionListener(this.action_listener);
		
		this.manage_panel = new JPanel(new GridLayout(0, 1, 20, 25));
		this.manage_panel.add(this.manage_title);
		this.manage_panel.add(this.button_totalization);
		this.manage_panel.add(this.button_supplement);
		this.manage_panel.setVisible(false);
		
		this.add(manage_panel);
	}
	
	
// 정산 팝업창 초기화
	private void init_totalization_dialog_spec() {
		this.size_x = 500;
		this.size_y = 300;
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		this.dim_screen = kit.getScreenSize();
		this.dim_window = new Dimension(this.size_x, this.size_y);
		
		this.location_x =
				(int)this.dim_screen.getWidth() / 2 -
				(int)this.dim_window.getWidth() / 2;
		this.location_y =
				(int)this.dim_screen.getHeight() / 2 -
				(int)this.dim_window.getHeight() / 2;
		
		this.dialog_totalization = new JDialog();
		this.dialog_totalization.setTitle("정산");
		this.dialog_totalization.setModal(true);
		this.dialog_totalization.setSize(this.size_x, this.size_y);
		this.dialog_totalization.setLocation(this.location_x, this.location_y);
		this.dialog_totalization.setLayout(new BorderLayout());
		
		button_ok = new JButton("확인");
		button_ok.setFont(this.font);
		button_ok.addActionListener(this.action_listener);
		
		JPanel panel_ok = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel_ok.add(button_ok);
		
		this.dialog_totalization.add(panel_ok, BorderLayout.SOUTH);
	}
	
	
// 보충 팝업창 초기화
	private void init_supplement_dialog_spec() {
		JLabel label_supply_title = new JLabel("상품 보충");
		label_supply_title.setFont(this.font);
		JPanel panel_supply_title = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel_supply_title.add(label_supply_title);
		
		ArrayList<String> product_name = Product_manager.get_manager().get_all_product_name();
		String[] array_name = (String[])product_name.toArray(new String[product_name.size()]);
		
		this.list_product_name = new JList<String>(array_name);
		list_product_name.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_product_name.setPrototypeCellValue("make to set the Cell size");
		
		JPanel panel_list = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel_list.setPreferredSize(new Dimension(100, 50));
		panel_list.add(list_product_name);
		panel_list.add(new JScrollPane(list_product_name));
		
		JPanel panel_supply_outer = new JPanel(new FlowLayout());
		this.label_supply = new JLabel("추가 수량");
		this.text_supply = new JTextField(10);
		
		this.button_supply = new JButton("적용");
		this.button_supply.addActionListener(this.action_listener);
		
		JPanel panel_supply_inner = new JPanel(new FlowLayout());
		panel_supply_inner.add(this.button_supply);
		
		panel_supply_outer.add(this.label_supply);
		panel_supply_outer.add(this.text_supply);
		panel_supply_outer.add(panel_supply_inner);
		
		
		this.dialog_supplement = new JDialog();
		this.dialog_supplement.setTitle("보충");
		this.dialog_supplement.setModal(true);
		this.dialog_supplement.setSize(this.size_x, this.size_y);
		this.dialog_supplement.setLocation(this.location_x, this.location_y);
		this.dialog_supplement.setLayout(new BorderLayout());
		
		this.dialog_supplement.add(panel_supply_title, BorderLayout.NORTH);
		this.dialog_supplement.add(panel_list, BorderLayout.CENTER);
		this.dialog_supplement.add(panel_supply_outer, BorderLayout.SOUTH);
	}
	
	
//--------------------------------------------------//
//	//											//	//	
//					--- 동작부 ---					//
//	//											//	//
//--------------------------------------------------//
	
	
// 메인 모드로 전환
	public void change_to_main_mode() {
		this.main_panel.setVisible(true);
		this.manage_panel.setVisible(false);
		System.out.println("visible_main_panel 동작");
	}
	
	
// 관리 모드로 전환
	public void change_to_manage_mode() {
		this.manage_panel.setVisible(true);
		this.main_panel.setVisible(false);
		System.out.println("visible_manage_panel 동작");
	}
	
	
// 정산 팝업 열기
	private void open_total_profit(int _profit) {
		this.label_profit = new JLabel("총 수익금 : " + Integer.toString(_profit), JLabel.CENTER);
		this.label_profit.setFont(this.font);
		
		this.button_complete = new JButton("정산완료");
		this.button_complete.addActionListener(this.action_listener);
		
		south_panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		south_panel.add(button_complete);
		
		this.dialog_totalization.add(this.label_profit, BorderLayout.CENTER);
		this.dialog_totalization.add(south_panel, BorderLayout.SOUTH);
		
		this.dialog_totalization.setVisible(true);
	}
	
	
// 보충 팝업 열기
	private void open_supplement() {
		this.dialog_supplement.setVisible(true);
	}
	
	
// action_listener 초기화
	private void init_action_listener() {
		this.action_listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();
				
				switch(command) {
				case "정산":
					int sum = Product_manager.get_manager().init_profit();
					open_total_profit(sum);
					Main_frame.get_frame().change_to_main_mode();
					Main_frame.get_frame().change_to_manage_mode();
					
					break;
					
				case "정산완료":
					label_profit.setText("");
					dialog_totalization.dispose();
					
					break;
					
				case "확인":
					dialog_err.dispose();
					
					break;
					
				case "보충":
					System.out.println("보충 동작");
					open_supplement();
					
					break;
					
				case "적용":
					String cur_product_name = list_product_name.getSelectedValue();					
					int supply_number = 0;
					boolean is_valid = false;
					Product cur_product = null;
					
					try {
						supply_number = Integer.parseInt(text_supply.getText());
						is_valid = true;
						
					} catch(Exception err) {
						dialog_err = new JDialog();
						dialog_err.setTitle("Error");
						dialog_err.setSize(size_x, size_y);
						dialog_err.setLocation(location_x, location_y);
						dialog_err.setLayout(new BorderLayout());
						dialog_err.setModal(true);
						
						panel_err_center = new JPanel(new FlowLayout(FlowLayout.CENTER));
						label_err = new JLabel("유효한 입력값이 아닙니다");
						label_err.setFont(font);
						panel_err_center.add(label_err, BorderLayout.CENTER);
						
						panel_err_south = new JPanel(new FlowLayout(FlowLayout.CENTER));
						panel_err_south.add(button_ok);
						
						dialog_err.add(panel_err_center, BorderLayout.CENTER);
						dialog_err.add(panel_err_south, BorderLayout.SOUTH);
						
						dialog_err.setVisible(true);
						
						is_valid = false;
					}// end try ~ catch
					
					if(is_valid) {
						
						cur_product = 
								Product_manager.get_manager().get_product(cur_product_name);
						
						if(cur_product != null) {
							cur_product.supply_product(supply_number);
							
							Main_frame.get_frame().change_to_main_mode();
							Main_frame.get_frame().change_to_manage_mode();
							
							repaint();
							System.out.println("보충 완료");
							
							dialog_supplement.dispose();
						}// end if
					}// end if
					
					text_supply.setText("");
					
					break;
					
				case "계산":
					// 계산부 작성
					Product product = null;
					String[] product_name = null;
					int[] require_number = null;
					int loop = 0;
					
					product_name = Main_frame.get_frame().center_panel.get_confirmed_product_name();
					require_number = Main_frame.get_frame().center_panel.get_confirmed_price();
					loop = Main_frame.get_frame().center_panel.get_confirmed_count();
					
					
					System.out.println("계산 동작");
				}// end switch
			}// end actionPerformed()
		};
	}// end init_action_listener()
}
