package myproject01;

/**
 * 测试while语句
 * 
 * @author luyp
 *
 */
public class TestWhile {
	public static void main(String[] args) {
		int a = 1;// 初始化
		while (a <= 100) {// 条件判断
			System.out.println(a); // 循环体
			a++;// 迭代
		}

		System.out.println("while结束");

		// 计算1+2+...+100
		int b = 1;
		int sum = 0;
		while (b <= 100) {
			sum += b;
			b++;
		}
		System.out.println(sum);
	}
}
