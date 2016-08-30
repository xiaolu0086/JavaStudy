package robin.lu.array.teststring;

/**
 * 1.练习String类的常用方法
 * 2.结合数组查看源码
 * 3.提高：查看String类中的其他源码
 * @author luyp
 *
 */
public class TestString {
	public static void main(String[] args) {
		String str="abcd";
		System.out.println(str.charAt(2));
		String str2=new String("abcd");
		System.out.println(str.equals(str2)); //比较内容是否相等 
		System.out.println(str==str2);
		
		String str3="def";
		String str4="def";
		System.out.println(str3.equals(str4));
		System.out.println(str3==str4);
		
		System.out.println(str3.indexOf('e'));
		String s=str3.substring(1);
		System.out.println(s);
		
		System.out.println(str3.replace('e', '*'));
		
		String str6="abcde,rrtt,cccee";
		String[] strArray=str6.split(",");
		for(int i=0;i<strArray.length;i++){
			System.out.println(strArray[i]);
		}
		
		String str7="  aa bb  ";
		String str77=str7.trim();
		System.out.println(str77.length());
	}
	
}
