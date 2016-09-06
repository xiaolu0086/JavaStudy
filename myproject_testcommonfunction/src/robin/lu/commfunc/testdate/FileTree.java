package robin.lu.commfunc.testdate;

import java.io.File;

public class FileTree {
	public static void main(String[] args) {
		File file = new File("C:\\Test");
		printFile(file,0);
	}

	static void printFile(File file, int level) {
		if (!file.exists()) {
			return;
		}

		for (int i = 0; i < level; i++) {
			System.out.print("-");
		}

		System.out.println(file.getName());

		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				printFile(f, level + 1);
			}
		}
	}
}
