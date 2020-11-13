package io;

import java.io.FileWriter;
import java.io.IOException;

public class WritinginFile {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("abc.txt");
		fw.write(100);
		fw.write('\n');
		fw.write("Thank you sachin");
		fw.write('\n');
		char [] ch = {'a','b','c','d'};
		fw.write(ch);
		fw.flush();
		fw.close();

	}

}