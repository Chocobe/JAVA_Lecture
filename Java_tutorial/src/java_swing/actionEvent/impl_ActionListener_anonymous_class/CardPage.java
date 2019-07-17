package java_swing.actionEvent.impl_ActionListener_anonymous_class;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CardPage extends JPanel {
	public final static int TOTAL_PAGE_NUM = 4;
	private CardLayout layout;
	
	public CardPage() {
		super();
		this.init();
	}
	
	
	private void init() {
		this.layout = new CardLayout();
		this.setLayout(this.get_layout());
		
		this.create_page("Ready to install the Chocobe Program");
		this.create_page("Installing the Chocobe program : STEP_1");
		this.create_page("Installing the Chocobe program : STEP_2");
		this.create_page("Chocobe program installation complete");
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
		return this.layout;
	}
}
