package robin.lu.commfunc.testdate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 可视化日历程序
 * 
 * @author luyp
 *
 */
public class VisualCalendar {
	public static void main(String[] args) {
		//获取输入日期
		System.out.println("请输入日期（按照格式2013-05-10）：");
		Scanner scanner = new Scanner(System.in);
		//String temp = "2013-05-10";
		String temp=scanner.nextLine();
		scanner.close();
		
		
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			//转换date
			Date date = format.parse(temp);
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			
			//将日历设置成1号前先保留输入日期
			int day=calendar.get(Calendar.DATE);
			calendar.set(Calendar.DATE, 1);
			
			//获取星期几和当月最后一天
			//System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
			//System.out.println(calendar.getActualMaximum(Calendar.DATE));
			int weekDate=calendar.get(Calendar.DAY_OF_WEEK);
			int maxDate=calendar.getActualMaximum(Calendar.DATE);
			
			
			
			System.out.println("日\t一\t二\t三\t四\t五\t六");
			
			//打印1号前的空格
			for(int i=1;i<weekDate;i++){
				System.out.print("\t");
			}
			
			//打印日历
			for (int i = 1; i <= maxDate; i++) {
				//标记输入日期
				if(i==day){
					System.out.print(i+"*\t");
				}else{
					System.out.print(i + "\t");
				}
				
				//周六换行
				int w=calendar.get(Calendar.DAY_OF_WEEK);
				if (w == Calendar.SATURDAY) {
					System.out.println();
				}
				calendar.add(Calendar.DATE, 1);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
