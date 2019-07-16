package school_management;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
class SchoolGui extends JFrame {
	SchoolApp sa = new SchoolApp();
	
	// 업무처리 로직을 가진 클래스 - 콘솔 애플리케이션
	Person p;
	JTextArea ta;
	
	// 등록, 삭제, 검색, 출력, 저장
	JButton reg, del, find, print, save;
	
	// 학생 버튼, 선생님 버튼, 직원 버튼, 검색 버튼, 검색 종료
	JButton btStudent, btTeacher, btStaff, btFindOk, btFindFinish;
	
	// 확인, 취소, 닫기
	JButton btOk, btCancel, btClose;
	
	// 대화상자 3개
	JDialog dial1, dial2, dial3;
	
	// 이름 라벨, 주소 라벨, 아이디 라벨, 기타 라벨(반 이름, 과목, 부서)
	JLabel lbName, lbAddr, lbId, lbPub;
	
	// 입력 컴포넌트 : 이름, 주소, 아이디, 기타, 검색
	JTextField tfName, tfAddr, tfId, tfPub, tfFindname;
	
	
	public SchoolGui() {
		super("학생 관리 프로그램");
		init();
		start(); // 이벤트 생성용
		
		setSize(500, 500);
		setVisible(true);
	}
	
//
// 모르는 부분	
//
	public void start() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
//
//
	
	
	// GUI 화면구성하는 메소드
	private void init() {
		ta = new JTextArea();
		add(ta, BorderLayout.CENTER);
	
//
// 모르는 부분
//
		JPanel panel = new JPanel(new GridLayout(0, 1, 10, 10)) {
			// 여백 생성하기
			public Insets getInsets() {
				return new Insets(10, 10, 10, 10);
			}
		};
//
//
		panel.setBackground(Color.CYAN);
		
		panel.add(reg = new JButton("등 록"));
		panel.add(find = new JButton("검 색"));
		panel.add(del = new JButton("삭 제"));
		panel.add(print = new JButton("출 력"));
		panel.add(save = new JButton("저 장"));		
		this.add(panel, BorderLayout.EAST);
		
		// Dialog 만들기
		// Dialog 생성자의 메소드 중, modal을 true로 주면, 현재 Dialog가 완료 되어야 이전창을 선택 가능
		dial1 = new JDialog(this, true);
		dial2 = new JDialog(this, true);
		dial3 = new JDialog(this, "**검색**", true);
		
		// Dial1에 컴포넌트 부착하기
		btStudent = new JButton("학생");
		btTeacher = new JButton("강사");
		btStaff = new JButton("직원");
		btClose = new JButton("닫기");
		
		dial1.setTitle("**등록**");
		dial1.setLayout(new GridLayout(1, 0));
		dial1.add(btStudent);
		dial1.add(btTeacher);
		dial1.add(btStaff);
		dial1.add(btClose);
	}
}


// SchoolGuiMain 클래스
public class SchoolGuiMain {
	public static void main(String[] args) {
		new SchoolGui();
	}
}
