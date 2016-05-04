package myproject01;

import java.util.Scanner;

/**
 * 测试Scanner类的使用，如何接受键盘的输入
 * 
 * @author luyp
 *
 */

public class TestScanner {
	public static void main(String[] args) {
		test02();
	}

	public static void test01() {
		Scanner s = new Scanner(System.in);
		String str = s.next();

		System.out.println("刚才输入的是:" + str);

		s.close();
	}

	public static void test02() {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个加数：");
		int a = s.nextInt();
		System.out.println("请再输入一个被加数：");
		int b = s.nextInt();
		int sum = a + b;

		System.out.println("计算结果为：" + sum);

		s.close();
	}
}
