package robin.lu.array2;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 323, 23, 543, 12, 59 };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("该元素的索引：" + Arrays.binarySearch(a, 12));
		
		System.out.println(args[0]);
		
		for(int i:a){
			System.out.println(i);
		}
	}
}
