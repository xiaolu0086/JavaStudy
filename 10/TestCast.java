public class TestCast{
	
	public static void main(String[] args){
		
		byte b1 = 123;
		//byte b2 = 300;
		//char c1 = -3;
		
		//测试自动（隐式）转型
		char c2 = 'a';
		int i1 = c2;
		long d01 = 123123;
		float f1 = d01;
		
		//测试强制转型
		int i2 = -100;
		char c3 = (char)i2; //-100超过char的表述范围，所以转换成完全不同的值，无意义！
		
		//表达式中的类型提升问题
		int a = 3;
		long b = 4;
		double d = 5.3;
		int c = (int)(a + b);
		float f = (float)(a + d);
		
		int money  = 1000000000;
		int years = 20;
		long total  = (long)money * years; //返回负数
		System.out.println(total);
		
	}
	
}