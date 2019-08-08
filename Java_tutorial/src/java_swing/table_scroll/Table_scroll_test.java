package java_swing.table_scroll;

public class Table_scroll_test {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		
		frame.insertTestData("1", "김", "010", "naver", "BUSAN");
		frame.insertTestData("3", "이", "011", "daum", "SEOUL");
		frame.insertTestData("11", "박", "012", "N/A", "INCHEON");
		
		frame.guiRun();
		
	}
}
