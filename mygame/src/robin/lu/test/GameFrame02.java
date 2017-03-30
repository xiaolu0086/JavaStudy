package robin.lu.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 测试窗口轨迹沿着各种轨迹移动
 * 
 * @author luyp
 *
 */
public class GameFrame02 extends Frame { // GUI编程awt,swing等。

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
	private boolean left;
	private boolean up;

	@Override
	public void paint(Graphics g) {

		g.drawImage(img, (int) x, (int) y, null);

		/*
		 * if (left) { x -= 3; } else { x += 3; }
		 * 
		 * if(x>(500-110)){ left=true; }
		 * 
		 * if(x<0){ left=false; }
		 */

		if (up) {
			y -= 10;
		} else {
			y += 10;
		}

		if (y > (500 - 110)) {
			up = true;
		}

		if (y < 20) {
			up = false;
		}

		// System.out.println(x);
	}

	class PaintThread extends Thread {
		public void run() {
			while (true) {
				repaint();
				try {
					Thread.sleep(30); // 1s=1000ms
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		GameFrame02 gf = new GameFrame02();
		gf.launchFrame();
	}
}
