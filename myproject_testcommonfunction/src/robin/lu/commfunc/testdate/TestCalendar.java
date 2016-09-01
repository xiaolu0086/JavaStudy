package robin.lu.commfunc.testdate;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 测试日期类
 * @author luyp
 *
 */
public class TestCalendar {
	public static void main(String[] args) {
		Calendar c = new GregorianCalendar();
		c.set(2011, Calendar.FEBRUARY, 10, 12, 23, 34);
		c.set(Calendar.YEAR, 2002);
		c.set(Calendar.MONTH, 1);
		c.set(Calendar.DATE,10);
		Date d = c.getTime();
		System.out.println(d);
		
		
		//测试日期计算
		c.add(Calendar.YEAR, 30);
		System.out.println(c.getTime());
	}
}
