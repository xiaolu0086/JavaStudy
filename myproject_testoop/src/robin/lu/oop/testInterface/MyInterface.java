package robin.lu.oop.testInterface;

public interface MyInterface {
	// 接口中只有常量和抽象方法！
	/*public static final 在接口中写或不写都有这个*/String MAX_GREAD = "BOSS";
	int MAX_SPEED = 120;
	
	/*public abstract*/public void test01();
	public int test02(int a,int b);
}
