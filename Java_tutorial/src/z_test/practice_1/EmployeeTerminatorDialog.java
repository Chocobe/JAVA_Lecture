package z_test.practice_1;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

@SuppressWarnings("unused")
public class EmployeeTerminatorDialog 
				implements EmployeeTerminatorView {
	private JFrame frame;
	private JList<String> listBox;
	private JButton terminateButton;
	
	private EmployeeTerminatorController controller;
	
	private Vector<String> employees;
	
	public static final String EMPLOYEE_LIST_NAME = "Employee List";
	public static final String TERMINATE_BUTTON_NAME = "Terminate";
	
	
	public void initialize(EmployeeTerminatorController controller) {
		this.controller = controller;
		initializeEmployeeListBox();
		initializeTerminateButton();
		initializeContentPane();
	}
	
	
	private void initializeEmployeeListBox() {
		listBox = new JList<String>();
		listBox.setName(EMPLOYEE_LIST_NAME);
		listBox.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if(!e.getValueIsAdjusting()) {
					controller.selectionChanged(
							(String)listBox.getSelectedValue());
				}
			}
		});
	}
	
	
	private void initializeTerminateButton() {
		terminateButton = new JButton(TERMINATE_BUTTON_NAME);
		terminateButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.terminate();
			}
		});		
	}
	
	
	private void initializeContentPane() {
		frame = new JFrame("Employee List");
		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(listBox);
		frame.getContentPane().add(terminateButton);
		frame.getContentPane().setSize(300, 600);
		frame.pack();
	}
	
	
	public Container getContentPane() {
		return frame.getContentPane();
	}
	
	
	public JFrame getFrame() {
		return frame;
	}
	
	
	@Override
	public void enableTerminate(boolean enable) {
		terminateButton.setEnabled(enable);
	}
	
	
	@Override
	public void setEmployeeList(Vector<String> employees) {
		this.employees = employees;
		listBox.setListData(employees);
		frame.pack();
	}
	
	
	@Override
	public void clearSelection() {
		listBox.clearSelection();
	}
}
