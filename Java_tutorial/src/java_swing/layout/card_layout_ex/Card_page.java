package java_swing.layout.card_layout_ex;

import java.awt.CardLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Card_page extends JPanel {
	// 사용할 페이지 수
	public static final int TOTAL_PAGE_NUM = 5;
	// 이 컨테이너에 적용한 CardLayout 객체
	private CardLayout layout;
	
	
// 생성자
	public Card_page() {
		super();
		this.layout = new CardLayout();
		this.setLayout(this.layout);
		this.create_page();
	}
	
	
// layout 객체
	public CardLayout get_layout() {
		return this.layout;
	}
	
	
// 페이지 생성
	private void create_page() {
		JTextField page_1 = new JTextField();
		page_1.setText("Chocobe 프로그램 설치를 시작합니다");
		page_1.setEnabled(false);
		page_1.setHorizontalAlignment(JTextField.CENTER);
		
		JTextField page_2 = new JTextField();
		page_2.setText("Chocobe 프로그램 설치 중 : STEP 1");
		page_2.setEnabled(false);
		page_2.setHorizontalAlignment(JTextField.CENTER);
		
		JTextField page_3 = new JTextField();
		page_3.setText("Chocobe 프로그램 설치 중 : STEP 2");
		page_3.setEnabled(false);
		page_3.setHorizontalAlignment(JTextField.CENTER);
		
		JTextField page_4 = new JTextField();
		page_4.setText("Chocobe 프로그램 설치 중 : STEP 3");
		page_4.setEnabled(false);
		page_4.setHorizontalAlignment(JTextField.CENTER);
		
		JTextField page_5 = new JTextField();
		page_5.setText("Chocobe 프로그램 설치 완료");
		page_5.setEnabled(false);
		page_5.setHorizontalAlignment(JTextField.CENTER);
		
		this.add(page_1);
		this.add(page_2);
		this.add(page_3);
		this.add(page_4);
		this.add(page_5);
	}
}
