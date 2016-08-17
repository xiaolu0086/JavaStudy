package robin.lu.oop.testFinal;

public /* final */ class Animal {// final修饰类，说明这个类不能被继承
	String eye;

	public /* final */ void run() {// final加到方法前面意味着方法不能被子类重写
		System.out.println("跑跑");
		double d = Math.PI;
	}

}

class Bird extends Animal {

	public void run() {
		super.run();
		System.out.println("我是一只鸟，飞飞");
	}

}