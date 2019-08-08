package java_swing.paint;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;

public class GraphicExample_1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("자동차 그리기");
		frame.setLocation(500, 300);
		frame.setPreferredSize(new Dimension(400, 300));
		
		Container contentPane = frame.getContentPane();
		
		CarDrawingPanel drawingPanel = new CarDrawingPanel();
		contentPane.add(drawingPanel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
