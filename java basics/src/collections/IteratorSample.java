package collections;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorSample {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		for(int i=0;i<=10;i++) {
			l.add(i);
	}
		Iterator itr = l.iterator();
		while(itr.hasNext()) 
		{
			Integer I = (Integer)itr.next();
			if (I%2==0) {
				System.out.println(I);
			}else { 
			itr.remove();
			}
		}System.out.println(l);
}
}
