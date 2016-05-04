package com.robin.test.doc;

/**
 * 测试递归，并写了一个阶乘的例子
 * 
 * @author luyp
 *
 */
public class TestRecursion {
	static int a = 0;

	public static void test01() {
		a++;
		System.out.println("test01:" + a);

		if (a <= 10) {
			test01();
		} else {
			System.out.println("Over!");
		}
	}
	
	/**
	 * 我是test02();
	 */
	public static void test02() {
		System.out.println("TestRecursion.test02()");
	}
	
	/**
	 * 计算阶乘。阶乘的意思是：5*4*3*2*1
	 * @param n
	 * @return factorial's result
	 */
	public static long factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		test01();
		System.out.println(factorial(5));
	}
}
