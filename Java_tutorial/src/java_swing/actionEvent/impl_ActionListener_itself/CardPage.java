package java_swing.actionEvent.impl_ActionListener_itself;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CardPage extends JPanel {
	public final static int TOTAL_PAGE_NUM = 4;
	private CardLayout card_layout;
	
	public CardPage() {
		super();		
		init();
	}
	
	
	private void init() {
		this.card_layout = new CardLayout();
		this.setLayout(this.get_layout());
		
		this.create_page("Chocobe 프로그램 설치 시작");
		this.create_page("Chocobe 프로그램 설치 중 : 1단계");
		this.create_page("Chocobe 프로그램 설치 중 : 2단계");
		this.create_page("Chocobe 프로그램 설치가 완료되었습니다");
	}
	
	
	private void create_page(String _text) {
		JTextField page = new JTextField();
		page.setText(_text);
		page.setEnabled(false);
		page.setHorizontalAlignment(JTextField.CENTER);
		
		Font font = new Font(null, Font.PLAIN, 30);
		page.setFont(font);
		page.setBackground(Color.DARK_GRAY);
		
		this.add(page);
	}
	
	
	public CardLayout get_layout() {
		return this.card_layout;
	}
}
