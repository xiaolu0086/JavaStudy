package robin.lu.array.stringbuilder;

/**
 * 测试可变字符序列。StringBuilder(线程不安全，效率高),StringBuffer(线程安全，效率低) String不可变字符序列
 * 
 * @author luyp
 *
 */
public class Test01 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();//字符串初始长度为16
		StringBuilder sb1 = new StringBuilder(32);//字符串初始长度为32
		StringBuilder sb2 = new StringBuilder("abcd");//字符数组长度为20，value[]={'a','b','c','d',\u0000,\u0000...}
		
		sb2.append("ef");
		sb2.append(true).append(321).append("随便"); //通过return this实现方法链
		
		System.out.println(sb2.toString());
		
		System.out.println("###################");
		
		StringBuilder gh=new StringBuilder();
		for (int i = 0; i < 1000; i++) {
			gh.append(i);
		}
		
		System.out.println(gh.toString());
	}
	
}
