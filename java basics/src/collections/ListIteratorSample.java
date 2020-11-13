package collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorSample {
public static void main(String[] args) {
		LinkedList l = new LinkedList();
				l.add("Balakrishna");
				l.add("Chiru");
				l.add("Venki");
				l.add("Nag");
				 
				System.out.println(l);
				ListIterator li = l.listIterator();
				while(li.hasNext()) {
					String s = (String)li.next();
					if(s.equals("Chiru")) {
						li.set("Charan");
					}else if(s.equals("Venki")) {
						li.add("Rana");
					}else if(s.equals("Nag")) {
						li.remove();
					}
					
				}
				System.out.println(l);
				
			}
	}


