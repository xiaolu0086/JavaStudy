package robin.lu.oop;

public class Student {
	//静态数据
	String name;
	int id;
	int age;
	String gender;
	int weight;
	
	//动态行为
	public void study(){
		System.out.println(name+"在学习！");
	}
	
	public void sayHello(String sname){
		System.out.println(name+"向"+sname+"说：你好！");
	}
	
	public static void main(String[] args){
		Student s1 = new Student();
		s1.name="张三";
		s1.study();
		s1.sayHello("李四");
		
		Student s2 =new Student();
		s2.name="老张";
		s2.age=18;
	}
}
