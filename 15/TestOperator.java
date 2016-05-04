public class TestOperator{
	
	public static void main(String[] args){
		//小数可以取余数
		double d = 10.2%3;
		System.out.println(d);
		
		//自增，自减
		int a = 3;
		int b = ++a;//a先自加1，再赋值给b，b=4
		int c = a++;//a先赋值給c，再自加1，c=4，a=5
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(a);
		
		//逻辑判断 短路检测
		//int c1 = 3/0;
		boolean b1 = 1>2&&2>(3/0);
		System.out.println(b1);
		
		//位的与、或、反、异或
		int m = 8;
		int n = 4;
		
		System.out.println(m&n);
		System.out.println(m|n);
		System.out.println(~m);
		System.out.println(m^n);
		
		//位的左移和右移
		int a1 = 3*2*2;
		int a2 = 3<<2;
		int a3 = 12>>2;
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		//扩展运算符+=,-=,*=,/=,%=
		int a4 = 3;
	    a4 += 3;
		System.out.println(a4);
		
		//boolean位运算
		System.out.println(true&false);
		
		//字符串连接
		String str = "5";
		int a5 = 4;
		System.out.println(str+a5);  //字符串相连
		
		//三元运算符
		int a6 = 7;
		int a7 = 3;
		String str1 = "a>b";
		String str2 = "a<=b";
		
		String str3;
		str3= a6 > a7 ? str1:str2;
		System.out.println(str3);
		System.out.println(str2);
		
		
	}
}