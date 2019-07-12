package java_swing.key_event;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
class My_panel extends JPanel {
	
	// 이미지는 byte로 읽지만, byte 단위로 쓸 수는 없으므로 버퍼 사용
	BufferedImage img = null;
	int img_x = 100;
	int img_y = 100;
	
	public My_panel() {
		
		try {
			// 이미지 읽어 오기 (버퍼에 담기)
			img = ImageIO.read(new File("D:\\Kim_Young_Woo\\pang.jpg"));
			
		} catch (IOException e) {
			System.out.println("그림 파일이 없습니다");
			System.exit(0);
		}
		
		addKeyListener(new KeyListener() {			
			@Override
			public void keyPressed(KeyEvent e) {
				int keycode = e.getKeyCode();
				
				switch(keycode) {
				case KeyEvent.VK_UP:
					img_y -= 10;
					break;
					
				case KeyEvent.VK_DOWN:
					img_y += 10;
					break;
					
				case KeyEvent.VK_LEFT:
					img_x -= 10;
					break;
					
				case KeyEvent.VK_RIGHT:
					img_x += 10;
					break;
				}
				
				repaint();
			}
			
			@Override
			public void keyTyped(KeyEvent e) { }
			
			@Override
			public void keyReleased(KeyEvent e) { }
		});
		
		this.requestFocus();
		setFocusable(true);
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);
	}
}


@SuppressWarnings("serial")
public class CarGameTest extends JFrame {
	private Dimension dim_screen;
	private Dimension dim_window;
	
	private int pos_x;
	private int pos_y;
	
	public CarGameTest() {
		super();
		init();
		start();
		
		this.setTitle("무명 클래스 ActionListener 테스트");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		this.dim_screen = kit.getScreenSize();
		this.dim_window = this.getSize();
		
		this.pos_x = (int)this.dim_screen.getWidth() / 2 - (int)this.dim_window.getWidth() / 2;
		this.pos_y = (int)this.dim_screen.getHeight() / 2 - (int)this.dim_window.getWidth() / 2;
		this.setLocation(this.pos_x, this.pos_y);
		
		this.setVisible(true);
	}
	
	
	private void init() {
		this.add(new My_panel());
	}
	
	
	private void start() {
		
	}
	
	
	public static void main(String[] args) {
		new CarGameTest();
	}
}
