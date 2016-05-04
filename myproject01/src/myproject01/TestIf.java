package myproject01;

/**
 * 测试if语句
 * 
 * @author luyp
 *
 */

public class TestIf {
	public static void main(String[] args) {
		double d = Math.random(); // [0,1)之间的数
		int e = 1 + (int) (d * 6); // 取整就是取数字的整数部分 [0,5]

		System.out.println(e);
		System.out.println("测试单项选择结构");
		if (e > 3) {
			System.out.println("大数");
		} else {
			System.out.println("小数");
		}

		System.out.println("###################################");
		System.out.println("测试多项选择结构");
		if (e == 6) {
			System.out.println("运气非常好！");
		} else if (e >= 4) {
			System.out.println("运气不错！");
		} else if (e >= 2) {
			System.out.println("运气一般！");
		} else {
			System.out.println("运气很差！");
		}

	}
}
