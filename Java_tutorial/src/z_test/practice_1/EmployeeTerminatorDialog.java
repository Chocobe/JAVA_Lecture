package z_test.practice_1;

import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

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
		
	}
	
	
	private void initializeEmployeeListBox() {
		listBox = new JList<String>();
		listBox.setName(EMPLOYEE_LIST_NAME);
		listBox.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				// 수정중
			}
		});
	}
	
	
	@Override
	public void enableTerminate(boolean enable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEmployeeList(Vector<String> employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearSelection() {
		// TODO Auto-generated method stub
		
	}
}
