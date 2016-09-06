package robin.lu.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader2 {
	public static void main(String[] args) {
		String str = readFile();
		System.out.println(str);
	}

	static String readFile(){
		FileReader reader = null;

		try {
			System.out.println("aaa");
			reader = new FileReader("C:\\Test\\1.txt");  //checked!!!  2.txt
			char c = (char) reader.read();
			char c2 = (char) reader.read();
			System.out.println("bbb");
			System.out.println("" + c + c2);
			return "step1";
		} catch (FileNotFoundException e) {
			System.out.println("ccc");
			e.printStackTrace();
			return "step2";		//先确定返回值，并不会直接结束运行
		} catch (IOException e) {
			e.printStackTrace();
			return "step3";
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
				System.out.println("ddd");
				return "step4";		//不要在finally中使用return
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}