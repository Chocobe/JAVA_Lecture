package z_test.practice_1;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

public class ShowEmployeeTerminator {
	static Vector<String> employees = new Vector<String>();
	static EmployeeTerminatorDialog dialog;
	
	public static void main(String[] args) {
		initializeEmployeeVector();
		initializeDialog();
		runDialog();
	}
	
	
	private static void initializeEmployeeVector() {
		employees.add("Bob");
		employees.add("Bill");
		employees.add("Robert");
	}
	
	
	private static void initializeDialog() {
		EmployeeTerminatorModel model = new EmployeeTerminatorModel();
		dialog = new EmployeeTerminatorDialog();
		dialog.initialize(model);
		model.initialize(employees, dialog);
	}
	
	
	private static void runDialog() {
		dialog.getFrame().addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				for(int i = 0; i < employees.size(); i++) {
					String s = (String)employees.elementAt(i);
					System.out.println(s);
				}
				System.exit(0);
			}
		});
		
		dialog.getFrame().setVisible(true);
	}
}
