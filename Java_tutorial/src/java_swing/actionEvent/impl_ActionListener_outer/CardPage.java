package java_swing.actionEvent.impl_ActionListener_outer;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CardPage extends JPanel {
	private CardLayout layout;
	public final static int TOTAL_PAGE_NUM = 4;
	
	
// 생성자
	public CardPage() {
		super();
		this.init_card();
	}
	
	
// 카드 초기화
	private void init_card() {
		this.layout = new CardLayout();
		this.setLayout(this.get_layout());
		
		this.create_page("Chocobe 프로그램 설치를 시작합니다");
		this.create_page("Chocobe 프로그램 설치 과정 - 1단계");
		this.create_page("Chocobe 프로그램 설치 과정 - 2단계");
		this.create_page("Chocobe 프로그램의 설치가 완료 되었습니다");
	}
	
	
// 페이지 생성 메소드
	private void create_page(String _text) {
		JTextField page = new JTextField();
		page.setText(_text);
		page.setHorizontalAlignment(JTextField.CENTER);
		page.setEnabled(false);
		
		page.setBackground(Color.GRAY);
		Font font = new Font(null, Font.PLAIN, 30);
		page.setFont(font);
		
		this.add(page);
	}
	
	
// layout getter	
	public CardLayout get_layout() {
		return this.layout;
	}
}
