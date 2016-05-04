package myproject01;

public class TestFor {
	public static void main(String[] args) {
		int a = 1;// 初始化
		while (a <= 100) {// 条件判断
			System.out.println(a); // 循环体
			a++;// 迭代
		}

		System.out.println("while结束");
		
		for(int i=1;i<=100;i++){	//初始化，条件判断，迭代
			System.out.println(i);	//循环体
		}
		
		System.out.println("for结束");

	}
}
