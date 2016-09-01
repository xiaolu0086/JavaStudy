package robin.lu.array.wrappedclass;

/**
 * 测试自动装箱和自动拆箱
 * 
 * @author luyp
 *
 */
public class Test02 {
	public static void main(String[] args) {
		// Integer a = new Integer(100);
		Integer a = 1000;  //jdk1.5之后  编译器自动添加new代码
		Integer b=2000;
		
		int c = b;  //new b.intValue;
		System.out.println(c);
		
		Integer d=1234;
		Integer d2=1234;
		
		System.out.println(d==d2);
		System.out.println(d.equals(d2));
		
		System.out.println("###########################");
		Integer d3=123;//[-128,127]之间的数，仍然当做基本数据类型来处理，提高效率
		Integer d4=123;
		System.out.println(d3==d4);
		System.out.println(d3.equals(d4));
	}
}
