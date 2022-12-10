public class TestFloatType{
	
	public static void main(String[] args){
		
		//double length 8 bytes float length 4 bytes
		//double scope -1.798E-308~1.798E308,float scope -3.403E-38~3.403E38
		double d1 = 1.23;
		System.out.println(d1);

		//define decimals default is double, float should add f at the end of number.
		float f1 = 1.23f;
		System.out.println(f1);

		//Scientific notation define double
		double d2 = 314e-2;
		System.out.println(d2);

		//double and float are lost number precision, if not should use BigDecimal.
		double d3 = 1/10;
		float f3 =0.1f;
		System.out.println(d3);
		System.out.println(f3);
		System.out.println(d3==f3);
		
	}
}