package java_swing.keyEvent.move_dog;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings("all")
public class MyPanel extends JPanel {	
	private KeyListener myKeyEvent;
	
	private BufferedImage img;
	private int img_x = 100;
	private int img_y = 100;
	
	public MyPanel() {
		super();
		this.init_KeyListener();
		
		try {
			this.read_image();
			
		} catch(IOException e) {
			System.out.println("no Image");
			System.exit(1);	// 0 이외의 값은 비정상 종료 실행
		}
		
		this.addKeyListener(this.myKeyEvent);
		
		this.requestFocus();
		this.setFocusable(true);
	}
	
	
	// 현재 프로젝트의 절대경로 가져오기 (src 폴더 이전까지 경로값)
	private void read_image() throws IOException {
		Path path = Paths.get("");
		String directory = path.toAbsolutePath().toString();
		directory += "\\src\\java_swing\\keyEvent\\move_dog\\dog.jpg";
		
		this.img = ImageIO.read(new File(directory));
	}
	
	
	// 이미지를 화면(img_x, img_y)위치에 그리는 메소드
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(this.img, this.img_x, this.img_y, null);
	}
	
	
	private void init_KeyListener() {
		this.myKeyEvent = new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// 미사용
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// 미사용
			}
			
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
				}// end switch()
				
				repaint();
			}// end KeyPressed()
		};// end new KeyListener()
	}// end init_KeyListener()
}
