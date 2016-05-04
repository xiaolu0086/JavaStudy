public class TestDataType{
	
	public static void main(String[] args){
		
		//数字默认赋值类型为int，数字在类型范围内可以直接赋值，反之则不行
		byte a1 = 100; //byte范围是-128~127 1个字节，8位
		short a2 = 10000; //short范围是-2的15次方~2的15次方， 2个字节
		int a3 = 10000000; //int范围是-2的31次方~2的31次方，4个字节
		
		//给long赋值需要在数字末尾添加字母L，
		//可以使用小写字母，建议使用大写字母
		long a4 = 100000000000L; //long的范围是-2的63次方~2的63次方，8个字节，表示再大的整数可以使用BigInteger
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		int a5 = 10;
		System.out.println(Integer.toBinaryString(a5));//十进制转二进制
		System.out.println(Integer.toOctalString(a5));//十进制转八进制
		System.out.println(Integer.toHexString(a5));//十进制转十六进制
		
		int a6 = 010;// 八进制在数字前加0
		System.out.println(a6);  //打印默认为10进制
		
		int a7 = 0xf;//十六进制在数字前加0x
		System.out.println(a7);
		
	}
}