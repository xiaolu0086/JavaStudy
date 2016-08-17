package robin.lu.oop.testThis;

public class Student {
	// 静态数据
	String name;
	int id;

	public Student(String name, int id) {
		this();//调用其他构造方法 Constructor call must be the first statement in a constructor
		this.name = name;
		this.id = id;
	}
	
	public Student(){
		System.out.println("构造一个方法");
	}

	// 动态行为
	public void study() {
		this.name = "张三";
		System.out.println(name + "在学习！");
	}

	public void sayHello(String sname) {
		System.out.println(name + "向" + sname + "说：你好！");
	}

}
