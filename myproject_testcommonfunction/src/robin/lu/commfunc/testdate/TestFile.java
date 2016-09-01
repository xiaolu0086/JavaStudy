package robin.lu.commfunc.testdate;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) {
		File f = new File("C:\\Test\\1.txt");
		File f2 = new File("C:\\Test");
		File f3 = new File(f2, "1.txt");
		File f4 = new File(f2, "2.txt");
		File f5 = new File(f2,"aa\\bb\\cc\\dd");
		
		//f5.mkdir();
		f5.mkdirs();
		
		try {
			f4.createNewFile();
			f4.delete();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (f.isFile()) {
			System.out.println("是一个文件");
		}

		if (f.isDirectory()) {
			System.out.println("是一个目录");
		}
	}

}
