package jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesSample {

	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("data.properties");
		p.load(fis);
		System.out.println(p);
		String s = p.getProperty("sam");
		System.out.println(s);
		p.setProperty("rudra", "1");
		FileOutputStream fos = new FileOutputStream("data.properties");
		p.store(fos,"updated by sachin kumar");

	}

}
