public class TestDataType{
	
	public static void main(String[] args){
		
		//study java basic data type
		byte a1 = 100; //byte scope -128~127
		short a2 = 10000; //short scope -32768~37767 2byte
		int a3 = 10000000; //int scope -2^31~2^31 4byte
		
		//long must add L at the end of number
		//If the number is bigger than the long, should use BigInteger to operate the number.
		long a4 = 100000000000L; //long scope -2^63~2^63 8byte
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		int a5 = 10;
		System.out.println(Integer.toBinaryString(a5));//convert to Binary
		System.out.println(Integer.toOctalString(a5));//convert to Octal
		System.out.println(Integer.toHexString(a5));//convert to Hex

		// Octal, should add 0 at the beginning of number.
		int a6 = 010;
		System.out.println(a6);  //print decimal

		//Hex,should add 0x at the beginning of number.
		int a7 = 0xf;
		System.out.println(a7);
		
	}
}