package school_management;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	School_service school_service = new School_service();
	MyHandler my;
	
	// 업무처리 로직을 가진 클래스 - 콘솔 애플리케이션
	Person p;
	JTextArea ta;
	
	// 등록, 삭제, 검색, 출력, 저장
	JButton reg, del, find, print, save;
	
	// 학생 버튼, 선생님 버튼, 직원 버튼, 검색 버튼, 검색 종료
	JButton btStudent, btTeacher, btStaff, btFindOk, btFindClose;
	
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
		
		reg.addActionListener(my);
		find.addActionListener(my);
		del.addActionListener(my);
		print.addActionListener(my);
		save.addActionListener(my);
		
		btStudent.addActionListener(my);
		btTeacher.addActionListener(my);
		btStaff.addActionListener(my);
		
		btOk.addActionListener(my);
		btCancel.addActionListener(my);
		
		btFindOk.addActionListener(my);
		btClose.addActionListener(my);
		
		ta.setEnabled(false);
	}
//
//
	
	
	// GUI 화면구성하는 메소드
	private void init() {
		ta = new JTextArea();
		add(ta, BorderLayout.CENTER);
	
		this.setLocation(600, 200);
		
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
		
		// dial1에 컴포넌트 부착하기
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
		
		// dial2에 컴포넌트 부착하기
		JPanel dp1 = new JPanel();
		JPanel dp2 = new JPanel();
		JPanel dp3 = new JPanel();
		
		dp1.setLayout(new GridLayout(4, 1));
		dp2.setLayout(new GridLayout(4, 1));
		
		dial2.add(dp1, BorderLayout.WEST);
		dial2.add(dp2, BorderLayout.CENTER);
		dial2.add(dp3, BorderLayout.SOUTH);
		
		dp1.add(lbName = new JLabel("이름"));
		dp1.add(lbAddr = new JLabel("주소"));
		dp1.add(lbId = new JLabel("ID"));
		dp1.add(lbPub = new JLabel("기타"));
		
		dp2.add(tfName = new JTextField(10));
		dp2.add(tfAddr = new JTextField(10));
		dp2.add(tfId = new JTextField(10));
		dp2.add(tfPub = new JTextField(10));	
		
		dp3.add(btOk = new JButton("처리"));
		dp3.add(btCancel = new JButton("취소"));
		
		// dial3에 검색 또는 삭제 관련 컴포넌트 부착
		JLabel lb = new JLabel("이름을 입력하세요");
		dial3.add(lb, BorderLayout.NORTH);
		JPanel dp4 = new JPanel();
		dial3.add(dp4, BorderLayout.CENTER);
		tfFindname = new JTextField(20);
		dp4.add(tfFindname);
		btFindOk = new JButton("확인");
		btFindClose = new JButton("닫기");
		dp4.add(btFindOk);
		dp4.add(btFindClose);
		
		
		
		// ActionListener 객체 생성
		my = new MyHandler();
	}
	
	// ActionListener를 구현하는 클래스 작성하기
	class MyHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) { // e.getSource() 메소드를 통해 Object형으로 받을 수 있다.
			Object temp_object = e.getSource();
			
			if(temp_object == reg) {
				dial1.pack();
				dial1.setLocation(900, 450);
				dial1.setVisible(true);
				
			} else if(temp_object == find) {
				dial3.setTitle("**검색**");
				dial3.pack();
				dial3.setLocation(900, 450);
				dial3.setVisible(true);
				
			} else if(temp_object == del) {
				dial3.setTitle("**삭제**");
				dial3.pack();
				dial3.setLocation(900, 450);
				dial3.setVisible(true);				
				
			} else if(temp_object == print) {
				String str = school_service.print_all();
				ta.append(str + "\n");
				
			} else if(temp_object == save) {
				System.out.println("파일에 저장");
				
			} else if(temp_object == btStudent) { // 학생버튼
				dial2.setTitle("**학생 등록**");
				lbId.setText("학번");
				lbPub.setText("학급");
				dial2.pack();
				dial2.setLocation(900, 450);
				dial2.setVisible(true);
				
			} else if(temp_object == btTeacher) { // 강사버튼
				dial2.setTitle("**강사 등록**");
				lbId.setText("교번");
				lbPub.setText("과목");
				dial2.pack();
				dial2.setLocation(900, 450);
				dial2.setVisible(true);
				
			} else if(temp_object == btStaff) { // 직원버튼
				dial2.setTitle("**직원 등록**");
				lbId.setText("사번");
				lbPub.setText("부서");
				dial2.pack();
				dial2.setLocation(900, 450);
				dial2.setVisible(true);
				
			} else if(temp_object == btOk) { // 확인 버튼
				// 사용자 정보 등록
				String name = tfName.getText();
				String addr = tfAddr.getText();
				String id = tfId.getText();
				String pub = tfPub.getText();
				
				// 어떤 객체냐에 따라 호출할 메소드 선택
				String title = dial2.getTitle();
				System.out.println(title);
				
				// 문자열 인덱스 2부터 4의 직전까지 가져오기
				String word = title.substring(2, 4);
				System.out.println(word);
				
				if(word.equals("학생")) {
					p = new Student();
					((Student)p).set_class_name(pub);
					
				} else if(word.equals("강사")) {
					p = new Teacher();
					((Teacher)p).set_subject(pub);
					
				} else if(word.equals("직원")) {
					p = new Staff();
					((Staff)p).set_department(pub);
				}
				
				p.set_name(name);
				p.set_address(addr);
				p.set_id(id);
				
				school_service.add_person(p);
				tfName.setText("");
				tfId.setText("");
				tfAddr.setText("");
				tfPub.setText("");
				
				// tfName에 포커스를 위치 시킴
				tfName.requestFocus();
				
			} else if(temp_object == btCancel) { // 취소 버튼
				// 현재 입력한 데이터 삭제(취소)
				dial2.dispose();
			}
			
			if(temp_object == btFindOk) { // 검색과 삭제 확인
				String title = dial3.getTitle();
				String word = title.substring(2, 4);
				System.out.println(word);
				
				if(word.equals("검색")) {
					String name = tfFindname.getText();
					String msg = school_service.find_person(name);
					ta.append(msg + "\n");
					
				} else {
					String name = tfFindname.getText();
					String msg = school_service.delete_person(name);
					tfFindname.setText("");
				}
				
			} else if(temp_object == btFindClose) { // 닫기 버튼
				dial3.dispose();
			}
		}
	}
}


// SchoolGuiMain 클래스
public class SchoolGuiMain {
	public static void main(String[] args) {
		new SchoolGui();
	}
}
