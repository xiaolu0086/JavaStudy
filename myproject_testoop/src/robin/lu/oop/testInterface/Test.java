package robin.lu.oop.testInterface;

public class Test {
	public static void main(String[] args) {
		IFlyable f = new Stone();
		f.fly();
	}
}
