package robin.lu.oop;

public class Test1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "张三";
		s1.age = 18;

		Computer c = new Computer();
		c.brand = "DELL";
		c.CPUSpeed = 1800;

		s1.computer = c;
		System.out.println(s1.computer.brand);

		c.brand = "联想 ";
		System.out.println(s1.computer.brand);

		String str1 = "联想 ";
		System.out.println(str1 == c.brand);
	}
}
