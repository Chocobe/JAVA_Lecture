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

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import project_convenience_store.Product_manager;


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
	private JButton button_supplement;
	
	private ActionListener action_listener;
	
	private JDialog pop_dialog;
	private JLabel label_profit;
	
	private int size_x;
	private int size_y;
	
	private Dimension dim_screen;
	private Dimension dim_window;
	
	private int location_x;
	private int location_y;
	
	private Font font;
	
	
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
		
		this.init_dialog_spec();
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
	
	
// 팝업창 초기화
	private void init_dialog_spec() {
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
		
		this.pop_dialog = new JDialog();
		this.pop_dialog.setTitle("정산");
		this.pop_dialog.setModal(true);
		this.pop_dialog.setSize(this.size_x, this.size_y);
		this.pop_dialog.setLocation(this.location_x, this.location_y);
		this.pop_dialog.setLayout(new BorderLayout());
		
		JButton button_ok = new JButton("확인");
		button_ok.setFont(this.font);
		button_ok.addActionListener(this.action_listener);
		
		JPanel panel_ok = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel_ok.add(button_ok);
		
		this.pop_dialog.add(panel_ok, BorderLayout.SOUTH);
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
	
	
// 정산 팝업
	private void inform_total_profit(int _profit) {
		this.label_profit = new JLabel("총 수익금 : " + Integer.toString(_profit), JLabel.CENTER);
		this.label_profit.setFont(this.font);
		
		this.pop_dialog.add(this.label_profit, BorderLayout.CENTER);
		
		this.pop_dialog.setVisible(true);
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
					inform_total_profit(sum);
					Main_frame.get_frame().change_to_main_mode();
					Main_frame.get_frame().change_to_manage_mode();
					
					break;
					
				case "확인":
					label_profit.setText("");
					pop_dialog.dispose();
					
					break;
					
				case "보충":
					System.out.println("보충 동작");
					break;
				}
			}
		};
	}
}
