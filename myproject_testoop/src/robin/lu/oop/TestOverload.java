package robin.lu.oop;

/**
 * ²âÊÔÖØÔØ
 * 
 * @author luyp
 *
 */

public class TestOverload {
	public static void main(String[] args) {
		MyMath m = new MyMath();
		int r = m.add(10, 20);
		System.out.println(r);
	}
}

class MyMath {
	int a;
	
	public MyMath(){
		
	}
	
	public MyMath(int a) {
		this.a = a;
	}

	public int add(int a, int b) {
		return a + b;
	}

	public int add(double a, int b) {
		return (int) (a + b);
	}

	public int add(int b, double a) {
		return (int) (a + b);
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}
}
