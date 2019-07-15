package java_swing.layout.card_layout;

import java.awt.BorderLayout;
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
		
		this.panel = new JPanel(new GridLayout(0, 5, 10, 0));
		addButton("<<", this.panel);
		addButton("<", this.panel);
		addButton(">", this.panel);
		addButton(">>", this.panel);
		addButton("종료", this.panel);
		this.add(this.panel, BorderLayout.NORTH);
		
		cards = new Cards();
		add(cards, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
	
	
	public void addButton(String str, Container target) {
		JButton button = new JButton(str);
		button.addActionListener(this);
		target.add(button);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		
		if(actionCommand.equals("종료")) {
			System.exit(0);
			
		} else if(actionCommand.equals("<<")) {
			this.cards.layout.first(this.cards);
			
		} else if(actionCommand.equals("<")) {
			this.cards.layout.previous(this.cards);
			
		} else if(actionCommand.equals(">")) {
			this.cards.layout.next(this.cards);
			
		} else if(actionCommand.equals(">>")) {
			this.cards.layout.last(this.cards);
		}
	}

	
	private class Cards extends JPanel {
		CardLayout layout;
		
		public Cards() {
			this.layout = new CardLayout();
			this.setLayout(layout);
			
			for(int i = 0; i < 10; i++) {
				this.add(new JButton("현재 카드의 번호는 " + i + "입니다."), BorderLayout.CENTER);
			}
		}
	}
}
