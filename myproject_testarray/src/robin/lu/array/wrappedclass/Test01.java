package robin.lu.array.wrappedclass;


/**
 * ²âÊÔ°ü×°Àà
 * @author luyp
 *
 */
public class Test01 {

	public static void main(String[] args) {
		Integer i = new Integer(1000);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toHexString(i));
		Integer i2 = Integer.parseInt("234");
		System.out.println(i2);

		Integer i3 = new Integer("333");
		System.out.println(i3.intValue());
	}
}
