package database_oracle.database_with_swing_sample_1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

//import database_oracle.database_with_swing_sample_1.Menu;

@SuppressWarnings("serial")
public class GuiFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("NO");
	private final JTextField tfNo = new JTextField();
	private final JLabel label = new JLabel("ID");
	private final JTextField tfId = new JTextField();
	private final JLabel label_1 = new JLabel("NAME");
	private final JTextField tfName = new JTextField();
	private final JLabel label_2 = new JLabel("TEL");
	private final JTextField tfTel = new JTextField();
	private final JLabel label_3 = new JLabel("ADDR");
	private final JTextField tfAddr = new JTextField();
	private final JScrollPane scrollPane = new JScrollPane();
	private final JTable table = new JTable();
	private final JButton btAdd = new JButton("ADD");
	private final JButton btFind = new JButton("FIND");
	private final JButton btAll = new JButton("All");
	private final JButton btDel = new JButton("DELETE");
	private final JButton btCancel = new JButton("CANCEL");

	MemberDAO dao=new MemberDAO();  
	MemberDTO dto=new MemberDTO();
	DefaultTableModel model=new DefaultTableModel();
	
	public static final int NONE=0;
	public static final int ADD=1;
	public static final int DEL=2;
	public static final int FIND=3;
	public static final int ALL=4;
	
	int cmd=NONE;

	public GuiFrame() {
		initGUI();
		start();
		
		try {
			dao.dbConnect();
		} catch (Exception e) {
			System.out.println("DB연결 실패!!!!"+e.getMessage());
		}//db와 커넥션
		//////////////////
		model.addColumn("회원번호");
		model.addColumn("아이디");
		model.addColumn("이  름");
		model.addColumn("전화번호");
		model.addColumn("주  소");
		
		//model을 view와 연결---------
		table.setModel(model);
		table.getTableHeader().setBackground(
				Color.black);
		table.getTableHeader().setForeground(
				Color.yellow);
		table.getTableHeader().setReorderingAllowed(false);
		table.setRowHeight(20);
		initialTf();
		
		setVisible(true);

	}
	private void start() {
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dao.close();
				//db와 연결된 자원 반납
				System.exit(0);
			}
		});
		
		table.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				System.out.println("mousePressed()"); // TODO Auto-generated Event stub mousePressed()
				int row=table.getSelectedRow();
				setTitle(row+"행");
				for(int i=0;i<5;i++){
					Object obj
					=table.getValueAt(row, i);
					String objStr=obj.toString();
					switch(i){
					case 0:
						tfNo.setText(objStr);
						break;
					case 1:
						tfName.setText(objStr);
						break;
					case 2:
						tfId.setText(objStr);
						break;
					case 3:
						tfTel.setText(objStr);
						break;
					case 4:
						tfAddr.setText(objStr);
						break;
						
					}//switch---------
					
				}//for----------
			}
		});

		
		btAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Add actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
				if(cmd!=ADD){
					setEnabled(ADD);
					tfId.requestFocus();//커서
					
				}else{
					add();
					setEnabled(NONE);
					cmd=NONE;
					initialTf();
					clearTf();
				}
			}
		});

		btFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Find actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
				if(cmd!=FIND){
					setEnabled(FIND);
					tfName.requestFocus();
				}else{
					showData(FIND);
					cmd=NONE;
					setEnabled(cmd);
					initialTf();
					clearTf();
					
				}
			}
		});
		
		btAll.setText("ALL");
		btAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
				cmd=ALL;
				setEnabled(cmd);
				initialTf();
				showData(ALL);
			}
		});

		btDel.setText("DELETE");
		btDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Delete actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
				if(cmd!=DEL){
					setEnabled(DEL);
					tfId.requestFocus();
					
				}else{
					delete(); //id로 삭제
					setEnabled(NONE);
					cmd=NONE;
					initialTf();
					clearTf();
				}
			}
		});

		btCancel.setText("CANCEL");
		btCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
				cmd=NONE;
				setEnabled(cmd);
				initialTf();
			}
		});


	}
	private void initGUI() {
		setBounds(100, 100, 700, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.lblNewLabel.setBounds(12, 10, 73, 28);
		
		contentPane.add(this.lblNewLabel);

		this.tfNo.setBounds(12, 38, 128, 28);
		this.tfNo.setColumns(10);

		contentPane.add(this.tfNo);
		this.label.setBounds(12, 76, 73, 28);
		
		contentPane.add(this.label);
		this.tfId.setColumns(10);
		this.tfId.setBounds(12, 104, 128, 28);
		
		contentPane.add(this.tfId);
		this.label_1.setBounds(12, 142, 73, 28);
		
		contentPane.add(this.label_1);
		this.tfName.setColumns(10);
		this.tfName.setBounds(12, 170, 128, 28);
		
		contentPane.add(this.tfName);
		this.label_2.setBounds(12, 208, 73, 28);
		
		contentPane.add(this.label_2);
		this.tfTel.setColumns(10);
		this.tfTel.setBounds(12, 236, 128, 28);
		
		contentPane.add(this.tfTel);
		this.label_3.setBounds(12, 262, 73, 28);
		
		contentPane.add(this.label_3);
		this.tfAddr.setColumns(10);
		this.tfAddr.setBounds(12, 290, 128, 28);
		
		contentPane.add(this.tfAddr);
		this.scrollPane.setBounds(198, 10, 335, 226);
		
		contentPane.add(this.scrollPane);
		/*this.table.setForeground(Color.YELLOW);
		this.table.setBackground(Color.BLACK);
		this.table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\uD68C\uC6D0\uBC88\uD638", "\uC774\uB984", "\uC804\uD654\uBC88\uD638", "\uC774\uBA54\uC77C", "\uC8FC\uC18C"
			}
		));*/
	
		this.scrollPane.setViewportView(this.table);
		this.btAdd.setBounds(213, 262, 85, 33);
		
		contentPane.add(this.btAdd);
		this.btFind.setBounds(298, 262, 85, 33);
		
		contentPane.add(this.btFind);
		this.btAll.setBounds(387, 262, 85, 33);
		
		contentPane.add(this.btAll);
		this.btDel.setBounds(475, 262, 85, 33);
		
		contentPane.add(this.btDel);
		this.btCancel.setBounds(559, 262, 85, 33);
		
		contentPane.add(this.btCancel);
	}
	public void initialTf(){
		//tf들을 비활성화
		boolean b=false;
		tfNo.setEditable(b);
		tfId.setEditable(b);
		tfName.setEditable(b);
		tfTel.setEditable(b);
		tfAddr.setEditable(b);
		
	}//initialTf()--------
	public void setEditable(int n){
		//tf의 편집 가능 여부를 결정하는 메소드
		boolean b=false;
		switch(n){
		case ADD:
			tfId.setEditable(!b);
			tfName.setEditable(!b);
			tfTel.setEditable(!b);
			tfAddr.setEditable(!b);			
			break;
		case FIND://이름으로 검색
			tfName.setEditable(!b);
			break;
		case DEL:// 아이디로 삭제
			tfId.setEditable(!b);
			break;
		case NONE:
		case ALL:
			initialTf();
			break;
		}
		
	}//setEditable()---------
	
	/**버튼의 활성화 여부를 결정하는 메소드*/
	public void setEnabled(int n){
		boolean b=false;
		this.intialBt(b);
		switch(n){
		case ADD:
			btAdd.setEnabled(!b);
			btCancel.setEnabled(!b);
			cmd=ADD;
			break;
		case DEL:
			btDel.setEnabled(!b);
			btCancel.setEnabled(!b);
			cmd=DEL;
			break;
		case FIND:
			btFind.setEnabled(!b);
			btCancel.setEnabled(!b);
			cmd=FIND;
			break;
		case ALL:
			btAll.setEnabled(!b);
			btCancel.setEnabled(!b);
			cmd=ALL;
			break;
			
		case NONE:
			this.intialBt(!b);//모든 버튼 활성화
			break;
		}
		this.setEditable(cmd);
		//tf의 활성화 여부 결정..
		
	}
	/**버튼 비활성화 메소드*/
	public void intialBt(boolean b){
		btAdd.setEnabled(b);
		btDel.setEnabled(b);
		btAll.setEnabled(b);
		btFind.setEnabled(b);
		btCancel.setEnabled(b);		
	}
	/**tf를 비워주는 메소드*/
	public void clearTf(){
		tfNo.setText("");
		tfId.setText("");
		tfName.setText("");
		tfTel.setText("");
		tfAddr.setText("");
	}
	
	
	
	public void add(){
		//사용자가 입력한 값 받아오기
		dto.setId(tfId.getText());		
		dto.setName(tfName.getText());
		dto.setTel(tfTel.getText());
		dto.setAddr(tfAddr.getText());
		String msg="";
		//유효성 체크
		if(dto.getId()==null||dto.getName()==null
				||dto.getId().trim().equals("")
				||dto.getName().trim().equals("")){
			msg="ID와 Name값 입력하세요";
			JOptionPane.showMessageDialog(this,msg);
			return;
		}//if-------
		
//		db에 입력
		int n = this.dao.insertMember(dto);
		
		if(n > 0) {
			msg="회원 가입 성공!";
		} else {
			msg="회원 가입 실패";
		}
		JOptionPane.showMessageDialog(this, msg);
		showData(ALL);
	
	}//add()-------------------

	
	public void showData(int cmd) {
		MemberDTO[] arr = null;
		
		if(cmd == ALL) {
			arr = dao.selectAll();
			
		} else if(cmd == FIND) {
			String name = tfName.getText();
			
			arr = dao.selectByName(name);
			
		} 
		
		if(arr == null || arr.length == 0) {
			JOptionPane.showMessageDialog(this, "현재 등록된 회원 없음");
			return;
		}
		
		String[] colNames = { "회원번호", "아이디", "이름", "전화번호", "주소" };
		String[][] data = new String[arr.length][5];
		
		for(int i = 0; i < arr.length; i++) {
			data[i][0] = arr[i].getNo() + "";
			data[i][1] = arr[i].getId();
			data[i][2] = arr[i].getName();
			data[i][3] = arr[i].getTel();
			data[i][4] = arr[i].getAddr();
		}
		
		model.setDataVector(data, colNames);
		table.setModel(model);
	}
	

	public void delete() {
		// 삭제할 ID 입력 
		// ID 입력 없을 시 - JOptionPane.showMessageDialog();
		// 정말 hong님의 정보를 삭제하겠습니까? - JOptionPane.showConfirmDialog();
		
		String id = tfId.getText();
		
		if(id.equals("")) {
			JOptionPane.showMessageDialog(this, "ID를 입력하세요");
			return;
			
		} else {
			int answer = 0;
			answer = JOptionPane.showConfirmDialog(this, "정말" + id + "를 삭제하시겠습니까?");
			
			System.out.println(answer);
			
			if(answer == JOptionPane.YES_OPTION) {
				int isDeletion = dao.deleteMember(id.trim());
				
				if(isDeletion != 0) {
					JOptionPane.showMessageDialog(this, "삭제 완료");
					showData(ALL);
					clearTf();
					
				} else {
					JOptionPane.showMessageDialog(this, "대상 ID가 없습니다");
				}
				
			} else {
				return;
			}
		}
	}
	
	
	public static void main(String[] args) {
		new GuiFrame();
		
	}
}














