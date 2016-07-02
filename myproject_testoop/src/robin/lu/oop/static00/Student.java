package robin.lu.oop.static00;

public class Student {
	//静态数据
	String name;
	int id;
	
	static int ss;
	
	public static void printSS(){
		System.out.println(ss);
	}
	
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
		
	}
}
