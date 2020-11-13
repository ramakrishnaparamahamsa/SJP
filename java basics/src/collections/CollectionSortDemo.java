package collections;
import java.util.*;

class CollectionSortDemo {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("z");
		l.add("b");
		l.add("e");
		l.add("o");
		l.add("l");
		System.out.println("before sorting:"+ l);
		Collections.sort(l, new MyComparator());
		System.out.println("after sorting:"+ l);
		
	}

}class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String s1 = (String)obj1;
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
	
}
