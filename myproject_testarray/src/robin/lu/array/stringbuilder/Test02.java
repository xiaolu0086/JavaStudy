package robin.lu.array.stringbuilder;

/**
 * 测试StringBuilder的常用方法
 * 
 * @author luyp
 *
 */
public class Test02 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		sb.delete(3, 5).delete(3, 5);// abchijklmnopqrstuvwxyz
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

		StringBuffer sb2 = new StringBuffer();
		sb2.append("1234567890");
	}
}
