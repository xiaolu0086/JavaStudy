package robin.lu.oop.abstractClass;

public abstract class Animal {
	public String name;
	
	public abstract void run();//抽象方法的意义在于将设计和实现分开
	
	public void breath(){
		System.out.println("呼吸");
	}
	
	public Animal(){
		System.out.println("创建一个动物");
	}
}


class Cat extends Animal{
	
	@Override
	public void run(){
		System.out.println("猫步小跑");
	}
}

class Dog extends Animal{

	@Override
	public void run() {
		System.out.println("狗跑");
		
	}
	
}