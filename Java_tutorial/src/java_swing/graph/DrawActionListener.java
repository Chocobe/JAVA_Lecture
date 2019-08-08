package java_swing.graph;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DrawActionListener implements ActionListener {
	
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	
	private DrawingPanel drawingPanel;
	
	public DrawActionListener(
					JTextField text1, JTextField text2, JTextField text3,
					DrawingPanel drawingPanel) {
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
		this.drawingPanel = drawingPanel;
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int korean = Integer.parseInt(text1.getText());
			int english = Integer.parseInt(text2.getText());
			int math = Integer.parseInt(text3.getText());
			
			drawingPanel.setScores(korean, english, math);
			drawingPanel.repaint();
			
		} catch(NumberFormatException num_e) {
			JOptionPane.showMessageDialog(drawingPanel, 
						"잘못된 숫자 포맷입니다.",
						"에러 메시지",
						JOptionPane.ERROR_MESSAGE);
		}
	}
}
