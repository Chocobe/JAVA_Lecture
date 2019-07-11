package java_swing.GUI_1;

import javax.swing.JFrame;

public class Frame_test_1 {
	public static void main(String[] args) {
		// JFrame 객체 생성. (인자 : 타이틀 명)
		JFrame frame = new JFrame("Frame Test");
		
		// JFrame 객체의 창 크기
		frame.setSize(300, 300);
		
		// 프레임의 상단의 기본 기능(최소화, 최대화, 종료)
		// 이 부분을 만들어 주지 않으면, 종료는 되지만 스레드는 종료되지 않아 리소스를 낭비하게 된다.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 프레임을 볼 수 있도록 하는 것
		frame.setVisible(true);
		
		//
		//위의 3단계가 swing의 필수 기본 설정이다.
		//
	}
}
