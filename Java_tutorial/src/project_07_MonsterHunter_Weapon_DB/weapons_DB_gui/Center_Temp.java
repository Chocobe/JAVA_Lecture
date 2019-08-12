package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;

public class Center_Temp {
	private static final int SIZE_X;
	private static final int SIZE_Y;
	private static int location_x;
	private static int location_y;
	
	private static Dimension dim_screen;
	private static Dimension dim_window;
	
	private JFrame frame;
	private JTabbedPane tabbedPane;
	
	static {
		SIZE_X = 500;
		SIZE_Y = 600;
		initFrameSize();
	}
	
	
	// 화면 크기 초기화
		private static void initFrameSize() {
			Toolkit kit = Toolkit.getDefaultToolkit();
			dim_screen = kit.getScreenSize();
			dim_window = new Dimension(SIZE_X, SIZE_Y);
			
			location_x = ((int)dim_screen.getSize().getWidth() / 2) - (SIZE_X / 2);
			location_y = ((int)dim_screen.getSize().getHeight() / 2) - (SIZE_Y / 2);
		}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Center_Temp window = new Center_Temp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Center_Temp() {
		initialize();
		initPanel_Search();
		initPanel_Favorite();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		frame.setTitle("Monster Hunter Weapons DB");
		frame.setBounds(location_x, location_y, SIZE_X, SIZE_Y);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setLayout(new BorderLayout(10, 10));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);

	}
	
// 검색 텝
	private void initPanel_Search() {
		JPanel search = new JPanel();
		tabbedPane.addTab("Search", null, search, "검색");
	}
	
	
// 즐겨찾기 텝
	private void initPanel_Favorite() {
	// 메인 페널
		JPanel favorite;
		favorite = new JPanel();
		tabbedPane.addTab("Favorite", null, favorite, "즐겨찾기");
		
	// 무기 카테고리 추가
		JPanel panelSort = initPanel_Sort();
		favorite.add(panelSort);
		
	// 속성 카테고리 추가
		JPanel panelAttribute = initPanel_Attribute();
		favorite.add(panelAttribute);
	}
	
	
// 카테고리 페널 생성
	private JPanel createCategory(String title, int height) {
		JPanel tempPanel = new JPanel();
		
		TitledBorder titledBorder = new TitledBorder(
						new LineBorder(Color.LIGHT_GRAY, 2), title);
		tempPanel.setBorder(titledBorder);
		
		tempPanel.setPreferredSize(new Dimension(SIZE_X - 20, height));
		tempPanel.setBackground(Color.WHITE);
		tempPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 2));
		
		return tempPanel;
	}

	
// 무기 카테고리 세부
	private JPanel initPanel_Sort() {
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String command = e.getActionCommand();
				System.out.println("Sort Category : " + command);
				//
				// "검색"버튼 하나만 이벤트 걸고, 각 항목의 command값을 DTO로 저장할 것
				//
			}
		};
		
		JPanel tempPanel = createCategory("무기", 80);
		
		// 라디오 버튼
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton bigSword = new JRadioButton("대검");
		bigSword.setBackground(Color.WHITE);
		bigSword.addActionListener(listener);
		group.add(bigSword);
		tempPanel.add(bigSword);
		
		JRadioButton longSword = new JRadioButton("태도");
		longSword.setBackground(Color.WHITE);
		longSword.addActionListener(listener);
		group.add(longSword);
		tempPanel.add(longSword);
		
		JRadioButton onehandSword = new JRadioButton("한손검");
		onehandSword.setBackground(Color.WHITE);
		onehandSword.addActionListener(listener);
		group.add(onehandSword);
		tempPanel.add(onehandSword);
		
		JRadioButton doubleSword = new JRadioButton("쌍검");
		doubleSword.setBackground(Color.WHITE);
		doubleSword.addActionListener(listener);
		group.add(doubleSword);
		tempPanel.add(doubleSword);
		
		JRadioButton hammer = new JRadioButton("헤머");
		hammer.setBackground(Color.WHITE);
		hammer.addActionListener(listener);
		group.add(hammer);
		tempPanel.add(hammer);
		
		JRadioButton pipe = new JRadioButton("수렵피리");
		pipe.setBackground(Color.WHITE);
		pipe.addActionListener(listener);
		group.add(pipe);
		tempPanel.add(pipe);
		
		JRadioButton lance = new JRadioButton("랜스");
		lance.setBackground(Color.WHITE);
		lance.addActionListener(listener);
		group.add(lance);
		tempPanel.add(lance);
		
		JRadioButton gunLance = new JRadioButton("건랜스");
		gunLance.setBackground(Color.WHITE);
		gunLance.addActionListener(listener);
		group.add(gunLance);
		tempPanel.add(gunLance);
		
		
		
		
		return tempPanel;
	}
	
	
// 속성 카테고리 세부
	private JPanel initPanel_Attribute() {
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String command = e.getActionCommand();
				System.out.println("Attribute : " + command);
			}
		};
		
		JPanel tempPanel = createCategory("속성", 60);
		
		// 라디오 버튼
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton fireAttribute = new JRadioButton("불속성");
		fireAttribute.setBackground(Color.WHITE);
		fireAttribute.addActionListener(listener);
		group.add(fireAttribute);
		tempPanel.add(fireAttribute);
		
		return tempPanel;
	}
	
}
