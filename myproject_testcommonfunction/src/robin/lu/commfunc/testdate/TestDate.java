package robin.lu.commfunc.testdate;

import java.util.Date;

/**
 * 测试Date类的用法
 * @author luyp
 *
 */
public class TestDate {
	public static void main(String[] args) {
		Date d = new Date();
		long t = System.currentTimeMillis();
		System.out.println(t);
		
		Date d2=new Date(1000);
		System.out.println(d2.toGMTString());
		d2.setTime(135156116);
		System.out.println(d2.getTime());
	}
}
