package robin.lu.array.mycollection;

/**
 * 模拟实现JKD中的ArrayList
 * 
 * @author luyp
 *
 */
public class MyArrayList {

	private Object[] value;

	private int size;

	public MyArrayList() {
		// value = new Object[16];
		this(10);
	}

	public MyArrayList(int size) {
		if (size < 0) {
			try {
				throw new Exception(); // 手动抛出异常
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		value = new Object[size];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int indexOf(Object obj) {
		if (obj == null) {
			return -1;
		} else {
			for (int i = 0; i < value.length; i++) {
				if (obj == value[i]) {
					return i;
				}
			}
			return -1;
		}
	}

	public int lastIndexOf(Object obj) {
		if (obj == null) {
			return -1;
		} else {
			for (int i = value.length; i >= 0; --i) {
				if (obj == value[i]) {
					return i;
				}
			}
			return -1;
		}
	}

	public void add(Object obj) {
		value[size] = obj;
		size++;

		if (size >= value.length) {
			// 装不下了，扩容吧
			int newCapaticy = value.length * 2;
			Object[] newList = new Object[newCapaticy];

			// System.arraycopy(src, srcPos, dest, destPos, length);
			for (int i = 0; i < value.length; i++) {
				newList[i] = value[i];
			}

			value = newList;
		}
	}

	public Object get(int index) {
		rangeCheck(index);

		return value[index];
	}

	public Object set(int index, Object obj) {
		rangeCheck(index);

		Object oldValue = value[index];
		value[index] = obj;

		return oldValue;
	}

	private void rangeCheck(int index) {
		if (index < 0 || index > size - 1) {// [0,size-1]
			try {
				throw new Exception(); // 手动抛出异常
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// 测试
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList(4);
		list.add("aaa");
		list.add(new Human("张三"));
		list.add("bbbb");

		Human h = (Human) list.get(1);
		System.out.println(h.getName());

		System.out.println(list.size());
	}
}
