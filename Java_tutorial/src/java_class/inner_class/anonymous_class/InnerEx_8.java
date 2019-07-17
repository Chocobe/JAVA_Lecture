package java_class.inner_class.anonymous_class;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 무명 클래스를 사용한 경우

public class InnerEx_8 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occured");
			}
		});
	}
}