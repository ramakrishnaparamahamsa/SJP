package collections;
import java.util.*;
import java.util.Map.Entry;

public class HashMapSample {
	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put("CHIRU", 100);
		m.put("NAG", 200);
		m.put("BALI", 300);
		m.put("VENKI", 150);
		m.put("CHARAN", 2500);
		System.out.println(m);//{VENKI=150, BALI=300, NAG=200, CHIRU=100, CHARAN=2500}
		m.put("NAG", 1000);
		System.out.println(m);//{VENKI=150, BALI=300, NAG=1000, CHIRU=100, CHARAN=2500}
		System.out.println(m.put("NAG", 2000));//1000
		System.out.println(m);//{VENKI=150, BALI=300, NAG=2000, CHIRU=100, CHARAN=2500}
		Set s = m.keySet();
		System.out.println(s);//[VENKI, BALI, NAG, CHIRU, CHARAN]
		Collection c = m.values();
		System.out.println(c);//[150, 300, 2000, 100, 2500]
		Set s1 = m.entrySet();
		System.out.println(s1);//[VENKI=150, BALI=300, NAG=2000, CHIRU=100, CHARAN=2500]
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey()+"...... "+m1.getValue());
			if(m1.getKey().equals("CHARAN")) {
				m1.setValue(10000);
			}	
		}
		System.out.println(m);
		
	}
}
