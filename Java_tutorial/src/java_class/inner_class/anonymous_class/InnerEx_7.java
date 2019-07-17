package java_class.inner_class.anonymous_class;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 익명 클래스를 사용하지 않은 경우

public class InnerEx_7 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new EventHandler());
	}
}


class EventHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionListener occured");
	}	
}