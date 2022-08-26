package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class hashset {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add('A');
		hs.add("Dnyanraj");
		hs.add(500);
		hs.add(null);
		hs.add(true);
		hs.add(null);
		hs.add(500);
		System.out.println(hs);//[null, A, 500, Dnyanraj, true]
        System.out.println(hs.size());//5
        System.out.println(hs.contains(500));//true
        System.out.println(hs.isEmpty());//false
        
        hs.remove(500);
        System.out.println(hs);//[null, A, Dnyanraj, true]
        
       
        //iterator
         Iterator itr=hs.iterator();
         while(itr.hasNext());
         System.out.println(itr.next());
         
         //for each loop
         for(Object d:hs) 
    		 System.out.println(d);
	}

}
