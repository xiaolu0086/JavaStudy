package robin.lu.oop.inherit;

public class Animal {
	String eye;

	public void run() {
		System.out.println("跑跑");
	}

	public void eat() {
		System.out.println("吃吃");
	}
	
	public void sleep(){
		System.out.println("zzzzzz");
	}
	
	public Animal(){
		super();
		System.out.println("新建一个动物对象！");
	}
}

class Mammal extends Animal {
	
	public void taisheng() {
		System.out.println("我是胎生");
	}
}

class Bird extends Animal {
	
	public void eggSheng(){
		System.out.println("卵生");
	}
	
	public void run(){
		super.run();
		System.out.println("我是一只鸟，飞飞");
	}
	
	public Bird(){
		super();
		System.out.println("新建一个鸟对象！");
	}
}