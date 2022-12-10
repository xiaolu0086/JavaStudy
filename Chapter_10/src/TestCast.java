public class TestCast{
	
	public static void main(String[] args){
		
		byte b1 = 123;
		//byte b2 = 300;
		//char c1 = -3;
		
		//define type and values
		char c2 = 'a';
		int i1 = c2;
		long d01 = 123123;
		float f1 = d01;
		
		//convert int to char
		int i2 = -100;
		char c3 = (char)i2; //-100 in scope of char, can convert
		
		//define type and calculate
		int a = 3;
		long b = 4L;
		double d = 5.3;
		int c = (int)(a + b);
		float f = (float)(a + d);
		
		int money  = 1000000000;
		int years = 20;
		long total  = (long)money * years; //calculate total
		System.out.println(total);
		
	}
	
}