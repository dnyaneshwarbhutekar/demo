package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		
		ll.add("Dnyanu");
		ll.add(100);
		ll.add(null);
		ll.add(10.25f);
		ll.add(null);
		ll.add("Dnyanu");
		
		System.out.println(ll);//[Dnyanu, 100, null, 10.25, null, Dnyanu]
		System.out.println(ll.size());//6
		System.out.println(ll.isEmpty());//false
		System.out.println(ll.contains(123));//false
		System.out.println(ll.get(1));//100
		ll.set(2, "full");
		System.out.println(ll);//[Dnyanu, 100, full, 10.25, null, Dnyanu]

		 ll.remove(1);
		 System.out.println(ll);
		 
		 //insret data in between linked list-> right shift operation
		 ll.add(1, null);
		 System.out.println(ll.get(1));//null
		 System.out.println(ll.get(2));//full
		 
		 //remove /delete data for linkedlist-> left shift operation
		 ll.remove(1);
		 System.out.println(ll.get(1));//full
		 
		 
		// for each loop
		 for(Object d:ll) {
		 System.out.println(d);}
		 
		 //for loop
		 for(int i=0;i<=ll.size()-1;i++) {
		 System.out.println(ll.get(i));}
		  
		 //iterator
		 Iterator itr=ll.iterator();
		 while(itr.hasNext()) {
		 System.out.println(itr.next());}
		 
		 //listiterator
		 
		 ListIterator litr=ll.listIterator();
		 while(litr.hasNext()) {
         System.out.println(litr.next());	}	
		 
		 
		 
		 
		 
		 

	}

}
