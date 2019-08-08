package z_test.practice_1;

import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;

public class EmployeeTerminatorDialog 
				implements EmployeeTerminatorView {
	private JFrame frame;
	private JList<String> listBox;
	private JButton terminateButton;
	
	private EmployeeTerminatorController controller;
	private Vector<String> employees;
	
	public static final String EMPLOYEE_LIST_NAME = "Employee List";
	public static final String TERMINATE_BUTTON_NAME = "Terminate";
	

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
