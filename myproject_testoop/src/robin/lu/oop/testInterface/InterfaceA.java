package robin.lu.oop.testInterface;

public interface InterfaceA {
	void aaa();
}

interface InterfaceB{
	void bbb();
}

interface InterfaceC extends InterfaceA,InterfaceB{
	void ccc();
}

class TestClass implements InterfaceC{

	@Override
	public void aaa() {
		System.out.println("TestClass.aaa()");
		
	}

	@Override
	public void bbb() {
		System.out.println("TestClass.bbb()");
		
	}

	@Override
	public void ccc() {
		System.out.println("TestClass.ccc()");
		
	}
	
}