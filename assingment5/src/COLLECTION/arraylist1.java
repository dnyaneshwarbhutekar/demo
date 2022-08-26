package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylist1 {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		
		a.add("dnyanu");
		a.add(null);
		a.add(100);
		a.add('A');
		a.add(null);
		a.add(true);
		
		System.out.println(a.get(0));
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.contains(100));
		a.set(1, false);
		System.out.println(a);
		a.remove(3);
		System.out.println(a);
		a.add(3,200);
		System.out.println(a);
		
		for(Object o:a) {
		System.out.println(o);
		
		}
		for(int i=0;i<=a.size()-1;i++) {
			System.out.println(a.get(i));
		}
		Iterator d=a.iterator();
		while(d.hasNext()) {
			System.out.println(d.next());
			
		}
		ListIterator l=a.listIterator();
		while(l.hasNext()) {
			System.out.println(l.next());
			
		}
	}

}
