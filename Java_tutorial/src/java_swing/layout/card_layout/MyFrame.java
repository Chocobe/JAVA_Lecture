package java_swing.layout.card_layout;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyFrame extends JFrame implements ActionListener {
	JPanel panel;
	Cards cards;
	
	public MyFrame() {
		this.setTitle("CardLayoutTest");
		this.setSize(400, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel(new GridLayout(0, 5, 10, 0));
		addButton("<<", panel);
		addButton("<", panel);
		addButton(">", panel);
		addButton(">>", panel);
		addButton("종료", panel);
		add(panel, "North");
		
		cards = new Cards();
		add(cards, "South");
		
		setVisible(true);
	}
	
	
	void addButton(String str, Container target) {
		JButton button = new JButton(str);
		button.addActionListener(this);
		target.add(button);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("종료")) {
			System.exit(0);
			
		} else if(e.getActionCommand().equals("<<")) {
			cards.layout.first(cards);
			
		} else if(e.getActionCommand().equals("<")) {
			cards.layout.previous(cards);
			
		} else if(e.getActionCommand().equals(">")) {
			cards.layout.next(cards);
			
		} else if(e.getActionCommand().equals(">>")) {
			cards.layout.last(cards);
		}
	}
	
	
	private class Cards extends JPanel {
		CardLayout layout;
		
		public Cards() {
			layout = new CardLayout();
			this.setLayout(layout);
			
			for(int i = 0; i < 10; i++) {
				this.add(new JButton("현재 카드 번호는 " + i + "번 입니다"));
			}
		}
	}
}
