package COLLECTION;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;


public class VECTOR {
	public static void main(String[] args) {
		Vector v=new Vector();
		
		v.add(100);
		v.add("abhi");
		v.add("amol");
		v.add(null);
		v.add(true);
		v.add('D');
		v.add("amol");
		v.add("abhi");
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println((v.contains(100)));
		System.out.println(v.isEmpty());
		System.out.println(v.get(1));
		
		v.set(2, "rahul");
		System.out.println(v.get(2));
		System.out.println(v);
		
		v.remove(5);
		System.out.println(v.get(4));
		System.out.println(v);
		
		v.add(5,'F');
		System.out.println(v);
		
		for(int i=0;i<=v.size()-1;i++) {
			System.out.println(v.get(i));
		}
		for(Object p:v) {
			System.out.println(p);
			
			Iterator a=v.iterator();
			while(a.hasNext()) {
				System.out.println(a.next());
			}
			ListIterator b=v.listIterator();
			while(b.hasNext()) {
				System.out.println(b.next());
			}
			System.out.println(v.capacity());
			
			Enumeration h=v.elements();
			while(h.hasMoreElements()) {
				System.out.println(h.nextElement());
				
			}
			
			
			
		}
	}

}
