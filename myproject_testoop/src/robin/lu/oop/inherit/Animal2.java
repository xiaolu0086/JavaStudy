package robin.lu.oop.inherit;

/**
 * 测试组合
 * 
 * @author luyp
 *
 */

public class Animal2 {
	String eye;

	public void run() {
		System.out.println("跑跑");
	}

	public void eat() {
		System.out.println("吃吃");
	}

	public void sleep() {
		System.out.println("zzzzzz");
	}

	public Animal2() {
		super();
		System.out.println("新建一个动物对象！");
	}

	public static void main(String[] args) {
		Bird2 bird2 = new Bird2();
		bird2.run();
	}
}

class Mammal2 {

	Animal2 animal2 = new Animal2();

	public void taisheng() {
		System.out.println("我是胎生");
	}
}

class Bird2 {
	Animal2 animal2;

	public void eggSheng() {
		System.out.println("卵生");
	}

	public void run() {
		animal2.run();
		System.out.println("我是一只鸟，飞飞");
	}

	public Bird2() {
		super();
		animal2 = new Animal2();
		System.out.println("新建一个鸟对象！");
	}
}