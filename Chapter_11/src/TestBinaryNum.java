public class TestBinaryNum{
	
	public static void main(String[] args){
		//by bit split by '_' every 4 bits
		int a = 0b0000_0000_0000_0000_0000_0000_0000_0011;
		//by number split by '_' every 4 numbers
		int b = 1_1232_3212;
		
		System.out.println(a);
		System.out.println(b);
	}
}