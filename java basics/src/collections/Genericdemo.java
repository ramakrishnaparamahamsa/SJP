package collections;

import java.util.*;

public class Genericdemo {
	public static void m1(ArrayList l) {
		l.add(10);
		l.add(10.5);
		
	}public static void main (String[]args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("sac");
		l.add("hi");
		System.out.println(l);
		m1(l);
		System.out.println(l);
		
	}

}
