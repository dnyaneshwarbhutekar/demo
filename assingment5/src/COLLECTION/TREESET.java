package COLLECTION;

import java.util.Iterator;
import java.util.TreeSet;

public class TREESET {
	public static void main(String[] args) {
		
		TreeSet t= new TreeSet();
		
		t.add(900);
		t.add(100);
		t.add(500);
		t.add(800);
		t.add(1000);
		t.add(123);
		t.add(450);
		t.add(12);
		t.add(52);
		System.out.println(t);
		System.out.println(t.size());
		System.out.println(t.isEmpty());
		System.out.println(t.contains(1000));
		
		t.remove(1000);
		System.out.println(t);
		
		Iterator di=t.descendingIterator();
		while(di.hasNext())
			System.out.println(di.next());
		
		System.out.println("display first value");
		System.out.println(t.first());
		
		System.out.println("display last value");
		System.out.println(t.last());
		
		System.out.println("delete first value");
		t.pollFirst();
		System.out.println(t);
		
		System.out.println("delete last value");
		t.pollLast();
		System.out.println(t);
		
		
		Iterator j=t.iterator();
		while(j.hasNext())
			System.out.println(j.next());
		
		for(Object h:t)
			System.out.println(h);
		
		System.out.println(t.size());
		System.out.println(t.contains(150));
		System.out.println(t.isEmpty());
		
		
		
		
		
	}

}
