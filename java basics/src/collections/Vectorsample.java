package collections;

import java.util.Vector;

public class Vectorsample {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println(v);
		for (int i =0;i<=10;i++) {
			v.addElement(i);
		}
		System.out.println(v);
		v.addElement("a");
		System.out.println(v);
		// TODO Auto-generated method stub

	}

}
