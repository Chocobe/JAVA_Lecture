package school_management;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class SchoolGui extends JFrame {
	// 업무처리 로직을 가진 클래스 - 콘솔 애플리케이션
	Person p;
	JTextArea ta;
	
	// 등록, 삭제, 검색, 출력, 저장
	JButton reg, del, find, print, save;
	
	// 학생 버튼, 선생님 버튼, 직원 버튼, 검색 버튼, 전체 출력버튼 
	JButton btStudent, btTeacher, btStaff, btFinder, btFindAll;
	
	// 확인, 취소, 닫기
	JButton btOk, btCancel, btClose;
	
	// 대화상자 3개
	JDialog dial1, dial2, dial3;
	
	// 이름 라벨, 주소 라벨, 아이디 라벨, 기타 라벨(반 이름, 과목, 부서)
	JLabel lbName, lbAddr, lbId, lbPub;
	
	// 입력 컴포넌트 : 이름, 주소, 아이디, 기타, 검색
	JTextField tfName, tfAddr, tfId, tfPub, tfFindname;
}

public class SchoolGuiMain {
	public static void main(String[] args) {
		
	}
}
