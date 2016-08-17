package robin.lu.oop.encapsulation02;

import robin.lu.oop.encapsulation01.Test01;

public class Test0001 extends Test01 {
	public static void main(String[] args) {
		Test0001 t = new Test0001();
		t.print();
	}
	
	public void ttt(){
		super.print();
		print();
	}
}
