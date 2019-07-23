package project_convenience_store.gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import project_convenience_store.Product_manager;
import project_convenience_store.product.Product;

@SuppressWarnings("serial")
public class Main_frame extends Base_frame {
	private static Main_frame main_frame = new Main_frame(); 	
	
	private Product_manager product_database;
	
	public Font font_menu;
	public Font font_info;
	
	public Main_north_panel north_panel;
	public Main_east_panel east_panel;
	public Main_center_panel center_panel;
	
// 생성자
	private Main_frame() {
		super();
		
		this.product_database = Product_manager.get_manager();
		
		this.set_frame_title();
		
		this.init_font();
		
		this.init_north_panel();
		this.init_east_panel();
		this.init_center_panel();
		
		this.change_to_main_mode();
		
		this.setVisible(true);
	}
	
	
// 타이틀 초기화
	@Override
	protected void set_frame_title() {
		this.setTitle("ZS25 system");
	}
	
	
// Main_frame 객체 반환
	public static Main_frame get_frame() {
		return Main_frame.main_frame;
	}
	
	
//--------------------------------------------------//
//	//											//	//	
//					--- 초기화 ---					//
//	//											//	//
//--------------------------------------------------//
	
	
// 폰트 초기화
	private void init_font() {
		this.font_menu = new Font(null, Font.PLAIN, 25);
		this.font_info = new Font(null, Font.PLAIN, 20);
	}
	
	
// north_panel 초기화
	private void init_north_panel() {
		this.north_panel = new Main_north_panel(this.font_menu);
		this.add(this.north_panel, BorderLayout.NORTH);
	}
	
	
// east_panel 초기화
	private void init_east_panel() {
		this.east_panel = new Main_east_panel(this.font_menu);
		this.add(this.east_panel, BorderLayout.EAST);		
	}
	
	
// center_panel 초기화
	private void init_center_panel() {
		this.center_panel = new Main_center_panel(this.font_info);
		this.add(this.center_panel, BorderLayout.CENTER);
	}
	
	
//--------------------------------------------------//
//	//											//	//	
//					--- 조작부 ---					//
//	//											//	//
//--------------------------------------------------//
	
	
// 메인 모드 전환
	public void change_to_main_mode() {
		this.north_panel.change_to_main_mode();
		this.east_panel.change_to_main_mode();
		this.center_panel.change_to_main_mode();
	}
	
	
// 관리 모드 전환
	public void change_to_manage_mode() {
		this.north_panel.change_to_manage_mode();
		this.east_panel.change_to_manage_mode();
		this.center_panel.change_to_manage_mode();
	}
	
	
// 상품 정보 전체 출력
	public void output_all_product_info() {
		Iterator<HashMap<String, Product>> iterator = 
				this.product_database.get_all_product().iterator();
		
		Iterator<String> product_iterator = null;
		
		HashMap<String, Product> cur_kind = null;
		Set<String> kind_key = null;
		
		Product cur_product = null;
		
		while(iterator.hasNext()) {
			cur_kind = iterator.next();
			kind_key = cur_kind.keySet();
			product_iterator = kind_key.iterator();
			
			while(product_iterator.hasNext()) {
				cur_product = cur_kind.get(product_iterator.next());
				
				String name = cur_product.get_name();
				int origin_price = cur_product.get_origin_price();
				int sales_price = cur_product.get_sales_price();
				int profit = cur_product.get_profit();
				int remain_number = cur_product.get_remain_number();
				
				this.center_panel.add_manage_attribute(
						name, origin_price, sales_price, profit, remain_number);
			}
		}
	}
}
