package robin.lu.commfunc.testdate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDataFormat {
	public static void main(String[] args) {
		//数字时间转化为字符串
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss，属于本月的第W周 ");
		Date d = new Date(12321673123L);
		String str = df.format(d); // 将时间对象按照格式化字符串，转化成字符串
		System.out.println(str);
		
		System.out.println("###################################");
		
		//时间字符串转化为数字时间
		String str2 = "1977-7-7 10:23:15";
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try {
			Date d2 = df2.parse(str2);
			System.out.println(d2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
