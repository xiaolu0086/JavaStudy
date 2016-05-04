public class TestCharType{
	
	public static void main(String[] args){
		
		//字符用单引号表示
		char c1 = 'a';
		char c2 = '我'; //unicode 0-65535
		char c3 = '\''; //“\”为转义符  \n换行 \t制表符 \\表示一个\
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		char c4 = 'a';
		int i = c4 + 2;
		System.out.println(i);  //字符相加是通过转为ASCII码之后，再相加
		
		char c5 = (char)i; //将ASCII码99强制转换为char字符c
		System.out.println(c5); 
		
		//打印a-z
		for(int j = 0;j < 26;j++){
			char temp  = (char)(c4 + j);
			System.out.print(temp);
		}
		
		//java里面的字符串定义为String类,用双引号表示
		String str = "abc";
		System.out.println(str);
		
		//布尔型 1位
		boolean b = true;
		if(b == true){  //一般写成if(b)  防止出现if(b=true)的错误
			System.out.println("true");
		}
	}
}