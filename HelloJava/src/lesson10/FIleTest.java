package lesson10;

import java.io.File;

public class FIleTest {

	public static void main(String[] args) {
		File f1 = new File("FileTest.txt");
		System.out.println(" f1.getPath(): " +f1.getPath());
		System.out.println(" f1.getAbsolutePath(): " +f1.getAbsolutePath());
		System.out.println(" f1.getName(): " +f1.getPath());
		System.out.println(" f1.toString(): "+f1.toString());
		System.out.println(" f1.length(): "+f1.length());
		System.out.println(" f1.exists(): "+f1.exists());

	}

}
