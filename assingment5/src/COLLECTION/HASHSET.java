package COLLECTION;

import java.util.HashSet;
import java.util.Iterator;

public class HASHSET {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		
		h.add("rahul");
		h.add(100);
		h.add("rahul");
		h.add(null);
		h.add(true);
		h.add(null);
		h.add(100);
		h.add("amol");
		
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		System.out.println(h.contains(100));
		
		h.remove(7);
		System.out.println(h);
		
		Iterator a=h.iterator();
		while(a.hasNext())
			System.out.println(a.next());
		
		for(Object b:h)
		System.out.println(b);
				
		
		
		
h.clear();
		System.out.println(h);
			
		
		
		
	}

}
