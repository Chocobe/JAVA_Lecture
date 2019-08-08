package z_test.practice_1;

import java.util.Vector;

public class EmployeeTerminatorModel 
			implements EmployeeTerminatorController {
	private EmployeeTerminatorView view;
	private Vector<String> employees;
	private String selectedEmployee;
	
	
	public void initialize(Vector<String> employees,
				EmployeeTerminatorView view) {
		this.employees = employees;
		this.view = view;
		
		view.setEmployeeList(employees);
		view.clearSelection();
		view.enableTerminate(false);
	}
	
	
	@Override
	public void selectionChanged(String employee) {
		view.enableTerminate(employee != null);
		selectedEmployee = employee;
	}

	@Override
	public void terminate() {
		if(selectedEmployee != null) {
			employees.remove(selectedEmployee);
		}
		
		view.setEmployeeList(employees);
		view.clearSelection();
		view.enableTerminate(false);
	}
}
