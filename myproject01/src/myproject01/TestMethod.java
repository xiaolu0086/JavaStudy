package myproject01;

/**
 * 测试方法
 * @author luyp
 * 方法设计原则：方法本意是功能块，就是实现某个功能的语句集合
 */
public class TestMethod {
	public static void test01() {
		// 计算1..100奇数和与偶数和

		int oddSum = 0;
		int evenSum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				oddSum += i;
			} else {
				evenSum += i;
			}
		}

		System.out.println("1..100奇数和:" + oddSum);
		System.out.println("1..100偶数和:" + evenSum);
	}

	public static void test02(int a, int b, int c) {
		for (int j = 1; j <= a; j++) {
			if (j % b == 0) {
				System.out.print(j + "\t");
			}

			if (j % (b * c) == 0) {
				System.out.println();
			}
		}
	}

	public static int add(int a, int b) {
		int sum = a + b;
		return sum;		//return 两个作用：1.返回结果 2.终止方法执行
	}

	public static void main(String[] args) {
		test01();
		test02(100,6,3);
		
		int s = add(3, 5);
		System.out.println(s);
	}
}
