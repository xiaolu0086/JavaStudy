public class TestFloatType{
	
	public static void main(String[] args){
		
		//double长度为8字节 float长度为4个字节
		//double表示数字范围-1.798E-308~1.798E308,float表示数字范围-3.403E-38~3.403E38
		double d1 = 1.23; 
		float f1 = 1.23f; //浮点常量默认为double，给float赋值数字最后需要加f
		
		double d2 = 314e-2; //用科学计数法表示浮点数
		System.out.println(d2);
		
		double d3 = 1/10;
		float f3 =0.1f;
		System.out.println(d3==f3);  //浮点数表示精度不同，故不相等,double和float精确不能表示所有的小数，精确表示可以使用BigDecimal
		
	}
}