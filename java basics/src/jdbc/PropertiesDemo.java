package jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("data.properties");
		p.load(fis);
		p.setProperty("dimpu", "154");
		System.out.println(p);
		String s = p.getProperty("dimpu");
		FileOutputStream fos = new FileOutputStream("data.properties");
		p.store(fos,"thanks for update");
		
		

	}

}
