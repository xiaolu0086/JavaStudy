package robin.lu.array;

/**
 * 数组的基本概念
 * @author luyp
 *
 */

public class Test01 {
	public static void main(String[] args) {
		/*
		 * 1.数据是相同数据类型(数据类型为任意类型)的有序集合 2.数组也是对象。数组元素相当于对象的成员变量。（见内存图）
		 * 3.数组长度是确定的，不变的。如果越界则报ArrayIndexOutofBoundsException
		 */
		int[] a = new int[3];
		a[0] = 23;
		a[1] = 28;
		a[2] = 32;

		double[] b = new double[2];

		Car[] cars = new Car[10];
		cars[0] = new Car("奔驰");
		cars[1] = new Car("宝马");
		cars[2] = new Car("比亚迪");

		System.out.println(cars[0].name);
		System.out.println(a.length);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
