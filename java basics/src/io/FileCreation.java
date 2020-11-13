package io;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) throws IOException {
		File f = new File("abc.txt");
		System.out.println(f.exists());
		f.createNewFile();// creates a file
		System.out.println(f.exists());
		File f1 = new File("sach");
		f1.mkdir();// creates a directory
		System.out.println(f1.exists());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());

	}

}
