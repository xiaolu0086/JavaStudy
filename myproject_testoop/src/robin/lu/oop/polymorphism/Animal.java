package robin.lu.oop.polymorphism;

public class Animal {
	String name;
	
	public void voice(){
		System.out.println("普通动物叫声！");
	}
}

class Cat extends Animal{
	public void voice(){
		System.out.println("喵喵！");
	}
	
	public void catchMouse(){
		System.out.println("抓老鼠");
	}
}

class Dog extends Animal{
	public void voice(){
		System.out.println("汪汪！");
	}
}

class Pig extends Animal{
	public void voice(){
		System.out.println("哼哼！");
	}
}
