public class TestCharType{
	
	public static void main(String[] args){
		
		//define char
		char c1 = 'a';
		char c2 = '\u0055'; //unicode 0-65535
		char c3 = '\''; //use escape define char,such as \n \t \\ \'
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		char c4 = 'a';
		int i = c4 + 2;
		System.out.println(i);  //ASCII code
		
		char c5 = (char)i; //ASCII char
		System.out.println(c5); 
		
		//print a-z
		for(int j = 0;j < 26;j++){
			char temp  = (char)(c4 + j);
			System.out.print(temp);
		}
		System.out.println("");
		
		//java characters is String object.
		String str = "abc";
		System.out.println(str);
		
		//boolean
		boolean b = true;

		//equal if(b) , if(b=true) is check set b to true result, this is not check b value is true
		if(b == true){
			System.out.println("true");
		}
	}
}