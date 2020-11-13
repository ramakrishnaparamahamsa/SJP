package collections;
import java.util.LinkedList;

public class LinkedListdemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("sachin");
		ll.add(10);
		ll.add(null);
		ll.add("sachin");//[sachin,10,null,sachin]
		ll.add(0,"venky");//[venky,sachin,10,null,sachin]
		ll.set(1, "sam");//[venky,sam,10,null,sachin]
		ll.removeLast();//[venky,sam,10,null]
		ll.addFirst(20);//[20,venky,sam,10,null]
		System.out.println(ll);

	}

}
