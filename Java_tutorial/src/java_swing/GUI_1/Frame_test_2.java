package java_swing.GUI_1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// swing부분이 복잡해 지므로, 일반적으로 따로이 상속받은 Frame 클래스를 만들어 사용한다.
// JFrame을 상속받으면, 클래스명 자체가 객체로 만들어져 있기 때문에, this로 접근하여 사용가능하다.
class MyFrame extends JFrame {
	JButton button_1;
	JButton button_2;
	JButton button_3;
	JButton button_4;
	JButton button_5;
	
	public MyFrame() {
		init();
		start();
		
		this.setSize(300, 300);
		// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("JFrame2");
		this.setVisible(true);
		
	}
	
	// 초기화 동작부
	private void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	// 초기화 화면 구성부
	private void init() {
		// 버튼 객체 생성
		this.button_1 = new JButton("버튼_1");
		this.button_2 = new JButton("버튼_2");
		this.button_3 = new JButton("버튼_3");
		this.button_4 = new JButton("버튼_4");
		this.button_5 = new JButton("버튼_5");
		
		// 배치방법 설정하기
		// 인자로 FlowLayout()을 사용했는데, 이는 기본값으로 중앙 정렬에서 왼쪽으로 순차정렬해 준다.
		// 정렬방식을 결정하는 인자는 XXXLayout() 으로 제공된다.
		this.setLayout(new FlowLayout());
		
		// 생성된 버튼을 화면에 넣기
		this.add(button_1);
		this.add(button_2);
		this.add(button_3);
		this.add(button_4);
		this.add(button_5);
	}
}

public class Frame_test_2 {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		
	}
}
