package COLLECTION;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		
		l.add(500);
		l.add("nilesh");
		l.add(500);
		l.add(null);
		l.add(true);
		l.add(null);
		l.add(12.52);
		l.add("nilesh");
		
		System.out.println(l.get(1));
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		System.out.println(l.contains(500));
		l.set(1, 1000l);
		System.out.println(l);
		l.add(5,123);
		System.out.println(l);
		l.remove(5);
		System.out.println(l);
		
		
		System.out.println("print all original order");
		for(int i=0;i<=l.size()-1;i++)
		System.out.println(l.get(i));
		
		System.out.println("print all reverse order");
		for(int k=l.size()-1;k>=0;k--)
			System.out.println(l.get(k));
		
		System.out.println("print all using for each loop");
		for(Object p:l)
			System.out.println(p);
		
		System.out.println("print all using iterator");
		Iterator d=l.iterator();
		while(d.hasNext());
		System.out.println(d.next());
		
		
		
		
		
		
		
	}

}
