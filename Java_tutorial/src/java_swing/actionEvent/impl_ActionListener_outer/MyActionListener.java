package java_swing.actionEvent.impl_ActionListener_outer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyActionListener implements ActionListener {	
	private JButton button_next;
	private JButton button_previous;

	private CardPage card;
	private int cur_page_num;
	
	public MyActionListener(JButton _next, JButton _previous, CardPage _card) {
		this.button_next = _next;
		this.button_previous = _previous;
		this.card = _card;
		
		this.cur_page_num = 1;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cur_command = e.getActionCommand();
		
		switch(cur_command) {
		case "NEXT":
			this.cur_page_num++;
			
			if(this.cur_page_num > CardPage.TOTAL_PAGE_NUM) {
				this.cur_page_num = CardPage.TOTAL_PAGE_NUM;
				break;
			}
			
			if(this.cur_page_num == CardPage.TOTAL_PAGE_NUM) {
				this.button_previous.setEnabled(false);
				this.button_next.setText("종료");
			}
			
			this.card.get_layout().next(this.card);
			break;
		// end case "NEXT":
			
		case "PREVIOUS":
			this.cur_page_num--;
			
			if(cur_page_num < 1) {
				this.cur_page_num = 1;
				break;
			}
			
			this.card.get_layout().previous(this.card);
			break;
			
		case "종료":
			System.exit(0);
		}// end switch()
	}// end actionPerformed()
	
}
