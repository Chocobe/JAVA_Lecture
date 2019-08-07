package z_test.practice_1;

import java.util.Vector;

public interface EmployeeTerminatorView {
	void enableTerminate(boolean enable);
	void setEmployeeList(Vector<String> employee);
	void clearSelection();
}
