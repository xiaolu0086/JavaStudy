public class TestOperator{
	
	public static void main(String[] args){

		//Remainder
		double d = 10.2%3;
		System.out.println(d);
		
		//different ++a & a++
		int a = 3;
		int b = ++a;//first a+1 then set b ,so b=4
		int c = a++;//first set c, c=4, then a+1, final a=5
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(a);
		
		//can't divide by 0
		//int c1 = 3/0;

		boolean b1 = 1>2&&2>(3/0);
		System.out.println(b1);
		
		//AND,OR,INVERT
		int m = 8;
		int n = 4;

		//and
		System.out.println(m&n);

		//or
		System.out.println(m|n);

		//invert
		System.out.println(~m);

		//xor
		System.out.println(m^n);
		
		//bit operate
		int a1 = 3*2*2;
		int a2 = 3<<2;
		int a3 = 12>>2;
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		//+=,-=,*=,/=,%=
		int a4 = 3;
	    a4 += 3;
		System.out.println(a4);
		
		//boolean
		System.out.println(true&false);
		
		//string add int
		String str = "5";
		int a5 = 4;
		System.out.println(str+a5);  //string joint
		
		//condition expression
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