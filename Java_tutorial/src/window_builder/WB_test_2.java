package window_builder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class WB_test_2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WB_test_2 frame = new WB_test_2();
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
	public WB_test_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(42, 34, 25, 41);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(132, 44, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(132, 95, 116, 21);
		contentPane.add(textField_1);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(42, 85, 78, 41);
		contentPane.add(lblPassword);
		
		textField_2 = new JTextField();
		textField_2.setBounds(132, 145, 116, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setBounds(56, 194, 100, 50);
		contentPane.add(btnAdd);
		
		JButton btnFind = new JButton("FIND");
		btnFind.setBounds(168, 194, 100, 50);
		contentPane.add(btnFind);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setBounds(280, 194, 100, 50);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBounds(392, 194, 100, 50);
		contentPane.add(btnDelete);
	}
}
