package robin.lu.oop.testInterface;

public class MyClass implements MyInterface{

	@Override
	public void test01() {
		System.out.println("MyClass.test01()");
		
	}

	@Override
	public int test02(int a, int b) {
		System.out.println("MyClass.test02()");
		return a+b;
	}

}
