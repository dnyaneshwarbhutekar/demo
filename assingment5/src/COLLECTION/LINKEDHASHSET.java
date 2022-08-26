package COLLECTION;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LINKEDHASHSET {
	public static void main(String[] args) {
		LinkedHashSet l=new LinkedHashSet();
		
		l.add("marathi");
		l.add("hindi");
		l.add(null);
		l.add(500);
		l.add(null);
		l.add(true);
		l.add("hindi");
		l.add(500);
		l.add(12.5);
		
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		System.out.println(l.contains(500));
		 
		l.remove("marathi");
		System.out.println(l);
		
		for(Object a:l)
		System.out.println(a);
		
		Iterator i=l.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		
		
		
		
		
	}

}
