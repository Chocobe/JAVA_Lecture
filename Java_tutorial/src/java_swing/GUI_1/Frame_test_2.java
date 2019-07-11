package java_swing.GUI_1;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// swing부분이 복잡해 지므로, 일반적으로 따로이 상속받은 Frame 클래스를 만들어 사용한다.
// JFrame을 상속받으면, 클래스명 자체가 객체로 만들어져 있기 때문에, this로 접근하여 사용가능하다.
class MyFrame extends JFrame {
	private int xpos, ypos;
	
	Dimension dim_1, dim_2;
	
	JLabel lbl;
	
	JButton button_1;
	JButton button_2;
	JButton button_3;
	JButton button_4;
	JButton button_5;
	
	JTextField tf_1 = new JTextField(10);
	JTextField tf_2 = new JTextField("ID를 입력하세요 : ");
	
	JPanel panel_1;
	JPanel panel_2;
	
	public MyFrame() {
		super();
		init();
		start();
		
		this.setSize(600, 150);
		// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("JFrame2");
		this.setVisible(true);
		
		// 전체 화면 크기값
		this.dim_1 = Toolkit.getDefaultToolkit().getScreenSize();
		this.dim_2 = this.getSize();
		
		// 화면의 해상도 크기값과 프로그램의 창 크기값으로 중앙값 구하기 -> 창의 위치값을 중앙으로 설정
		this.xpos = (int)dim_1.getWidth() / 2 - (int)dim_2.getWidth() / 2;
		this.ypos = (int)dim_1.getHeight() / 2 - (int)dim_2.getHeight() / 2;
		this.setLocation(this.xpos, this.ypos);
	}
	
	// 초기화 동작부 (예제로써 동작부를 사용했지만, 동작부에는 event 요소들이 포함되는게 일반적이다.)
	private void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 창의 크기 조정 가능 여부 설정
		this.setResizable(true);
		
		// this.setBounds(x, y, width, height) : setSize() 와 setLocation()을 합친 메소드
		
		
	}
	
	// 초기화 화면 구성부
	private void init() {
//		// 화면의 해상도(모니터 크기값)를 얻기 위해, Toolkit 객체를 생성 (getDefaultTollkit()은 펙토리 메소드 패턴)
//		Toolkit tool_kit = Toolkit.getDefaultToolkit();
//		// 실제 화면 해상도를 받는 부분
//		Dimension screen_size = tool_kit.getScreenSize();
//
//		// 화면 해상도값을 위치값으로 사용
//		this.setLocation(screen_size.width / 2 - 300 / 2, screen_size.height / 2 - 300 / 2);
		
		// 배치방법 설정하기
		// 인자로 FlowLayout()을 사용했는데, 이는 기본값으로 중앙 정렬에서 왼쪽으로 순차정렬해 준다.
		// 정렬방식을 결정하는 인자는 XXXLayout() 으로 제공된다.
		this.setLayout(new FlowLayout());
		

		// 라벨 생성
		this.lbl = new JLabel("안녕하세요");
		
		// 패널 생성
		this.panel_1 = new JPanel();
		this.panel_2 = new JPanel();
		
		// 버튼 객체 생성
		this.button_1 = new JButton("버튼_1");
		this.button_2 = new JButton("버튼_2");
		this.button_3 = new JButton("버튼_3");
		this.button_4 = new JButton("버튼_4");
		this.button_5 = new JButton("버튼_5");
		
		// 버튼 비활성화 설정
		this.button_3.setEnabled(false);
		
		// 생성된 버튼을 화면에 넣기
		// 패널에 객체 추가
		panel_1.add(lbl);
		panel_1.add(button_1);
		
		this.tf_2.setEditable(false);
		panel_1.add(this.tf_2);
		panel_1.add(this.tf_1);
		
		panel_2.add(button_2);		
		panel_2.add(button_3);
		panel_2.add(button_4);
		panel_2.add(button_5);
		
		// 패널을 프레임에 추가
		this.add(panel_1);
		this.add(panel_2);
		
		// 버튼을 프레임에 추가
//		this.add(button_2);
//		this.add(button_3);
//		this.add(button_4);
//		this.add(button_5);
	}
}

public class Frame_test_2 {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		
	}
}
