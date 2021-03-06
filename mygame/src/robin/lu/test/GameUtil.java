package robin.lu.test;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

/**
 * 游戏中常用的工具类(比如：图片加载等方法)
 * @author luyp
 *
 */
public class GameUtil {
	
	private GameUtil(){};  //工具类通常将构造方法私有化
	
	public static Image getImage(String path){
		URL u = GameUtil.class.getClassLoader().getResource(path);
		BufferedImage img = null;
		
		try {
			img=ImageIO.read(u);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return img;
	}
}
