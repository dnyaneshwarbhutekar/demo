package COLLECTION;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HASHSET1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("amul");
		al.add(100);
		al.add("amul");
		al.add(100);
		al.add("rahul");
		al.add(null);
		al.add(true);
		al.add(null);
		
		System.out.println(al);
		HashSet h=new HashSet(al);
		System.out.println(h);
		
		LinkedHashSet lhs=new LinkedHashSet(al);
		System.out.println(lhs);
		
		
		
	}

}
