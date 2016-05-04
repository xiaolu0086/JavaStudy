package myproject01;

/**
 * 测试switch语句
 * 
 * @author luyp
 *
 */
public class TestSwitch {
	public static void main(String[] args) {
		System.out.println("##################################");
		System.out.println("测试switch语句");
		int e = 1 + (int) (6 * Math.random());

		switch (e)

		{ // e是int类型，或者可以自动转为int的byte,short,char;JDK7可以使用String
		case 6:
			System.out.println("运气非常好！");
			break;// 不加break会造成case穿透，从满足条件的case开始，每个都执行
		case 5:
			System.out.println("运气很不错！");
			break;
		case 4:
			System.out.println("运气还行吧！");
			break;
		default:
			System.out.println("运气不好！");
			break;
		}

		System.out.println("####################################");
		System.out.println("利用case穿透");

		char c = 'a';
		int rand = (int) (26 * Math.random());
		System.out.println(rand);
		char c2 = (char) (c + rand);
		System.out.print(c2 + " :");

		switch (c2)

		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("元音");
			break;
		case 'y':
		case 'w':
			System.out.println("半元音");
			break;
		default:
			System.out.println("辅音");
			break;
		}

	}
}
