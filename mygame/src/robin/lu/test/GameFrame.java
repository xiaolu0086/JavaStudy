package robin.lu.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 游戏 基本知识测试类
 * 
 * @author luyp
 *
 */
public class GameFrame extends Frame { // GUI编程awt,swing等。

	Image img = GameUtil.getImage("images/solar.jpg");

	/**
	 * 加载窗口
	 */
	public void launchFrame() {
		setSize(500, 500);
		setLocation(100, 100);
		setVisible(true);

		new PaintThread().start(); // 启动重画线程

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});
	}

	private double x = 100, y = 100;

	@Override
	public void paint(Graphics g) {
		Color c = g.getColor();

		Font f = new Font("宋体", Font.BOLD, 100);
		g.setFont(f);

		g.drawLine(100, 100, 200, 200);
		g.drawRect(100, 100, 200, 200);
		g.drawOval(100, 100, 200, 200);
		g.drawString("张三", 200, 200);
		g.fillRect(100, 100, 20, 20);

		g.setColor(Color.RED);
		g.fillOval(300, 300, 20, 20);

		g.drawImage(img, (int) x, (int) y, null);
		x += 3;
		//y += 3;

		g.setColor(c);
	}

	class PaintThread extends Thread {
		public void run() {
			while (true) {
				repaint();
				try {
					Thread.sleep(40); // 1s=1000ms
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		GameFrame gf = new GameFrame();
		gf.launchFrame();
	}
}
