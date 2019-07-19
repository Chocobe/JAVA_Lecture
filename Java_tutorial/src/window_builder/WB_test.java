package window_builder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class WB_test extends JFrame {

	private JPanel contentPane;
	private JButton btnLeft;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WB_test frame = new WB_test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WB_test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		btnLeft = new JButton("왼쪽 버튼");
		btnLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.add(btnLeft, BorderLayout.WEST);
		
		JButton btnNorth = new JButton("위쪽 버튼");
		btnNorth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNorth, BorderLayout.NORTH);
		
		JButton btnCenter = new JButton("중앙 버튼");
		contentPane.add(btnCenter, BorderLayout.CENTER);
		
		JButton btnRight = new JButton("오른쪽 버튼");
		contentPane.add(btnRight, BorderLayout.EAST);
		
		JButton btnSouth = new JButton("아래쪽 버튼");
		contentPane.add(btnSouth, BorderLayout.SOUTH);
	}

}
