package collections;
import java.util.TreeSet;

public class TreeSetSample {

	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add("a");
		t.add("A");
		t.add("B");
		t.add("Z");
		//t.add(newInteger(10));//CCE */
		//t.add(null);// NPE
		System.out.println(t);//[A,B,Z,a]

		

	}

}
