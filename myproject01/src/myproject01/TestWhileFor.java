package myproject01;

public class TestWhileFor {
	public static void main(String[] args) {
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

		// 1..1000之间能被5整除的数,每行输出3个
		for (int j = 1; j <= 1000; j++) {
			if (j % 5 == 0) {
				System.out.print(j + "\t");
			}

			if (j % 15 == 0) {
				System.out.println();
			}
		}
		System.out.println();

		// 九九乘法口诀表
		System.out.println("九九乘法口诀表");
		
		for (int m = 1; m <= 9; m++) {
			for (int n = 1; n <= m; n++) {
				System.out.print(n + "*" + m + "=" + n * m + "\t");
			}
			System.out.println();
		}
	}
}
