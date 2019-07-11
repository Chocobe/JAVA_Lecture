package java_swing.GUI_2;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame_5 extends JFrame implements ActionListener {
	private int pos_x;
	private int pos_y;
	
	private Dimension dim_screen;
	private Dimension dim_window;
	
	JButton button_1 = new JButton("<<");
	JButton button_2 = new JButton(">>");
	
	JPanel panel;
	Cards card;
	
	public MyFrame_5() {
		super();
		init();
		this.setSize(600, 300);
		
		this.dim_screen = Toolkit.getDefaultToolkit().getScreenSize();
		this.dim_window = this.getSize();
		
		this.pos_x = (int)dim_screen.getWidth() / 2 - (int)this.dim_window.getWidth() / 2;
		this.pos_y = (int)dim_screen.getHeight() / 2 - (int)this.dim_window.getHeight() / 2;
		
		this.setLocation(this.pos_x, this.pos_y);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	
	private void init() {
		this.panel = new JPanel(new GridLayout(0, 5, 10, 0));
		addButton("<<", this.panel);
		addButton("<", this.panel);
		addButton(">", this.panel);
		addButton(">>", this.panel);
		addButton("종료", this.panel);
		this.add(this.panel, "North");
		this.card = new Cards();
		this.add(card, "Center");
	}
	
	
	private void addButton(String _title, JPanel _panel) {
		JButton button = new JButton(_title);
		
		// 버튼객체에 ActionListener기능을 추가하는 것. 인수는 대상 -> this(버튼 자신)
		button.addActionListener(this);
		_panel.add(button);
	}
	
	
	// ActionListener의 매소드 (하나뿐이다) 
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("종료")) {
			System.exit(0);
			
		} else if(e.getActionCommand().equals("<<")) {
			// 첫번째 카드로 이동
			this.card.layout.first(this.card);
			
		} else if(e.getActionCommand().equals("<")) {
			// 이전 카드로 이동
			this.card.layout.previous(this.card);
			
		} else if(e.getActionCommand().equals(">")) {
			// 다음 카드로 이동
			this.card.layout.next(this.card);
			
		} else if(e.getActionCommand().equals(">>")) {
			// 마지막 카드로 이동
			this.card.layout.last(this.card);
		}
	}
	
	
	private class Cards extends JPanel {
		CardLayout layout;
		
		public Cards() {
			// super() 필요없나???
			this.layout = new CardLayout();
			this.setLayout(layout);
			
			for(int i = 1; i <= 10; i++) {
				this.add(new JButton("현재 카드의 번호는 " + i + "입니다."), "Center");
			}
		}
	}
}


public class CardLayout_test {
	public static void main(String[] args) {
		MyFrame_5 frame = new MyFrame_5();
	}
}
