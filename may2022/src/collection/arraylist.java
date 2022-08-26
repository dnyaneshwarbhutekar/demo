package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylist {
	public static void main(String[] args) {
//1.creat array list
		ArrayList al=new ArrayList();//built in class
		al.add("Dnyanu");
		al.add(100);
		al.add(null);
		al.add("Dnyanu");
		al.add(100);
		al.add(50.20f);
		al.add('A');
		al.add(null);
		al.add("qyantum");
		al.add('A');
		al.add("Dnyanu");
		

		System.out.println(al);//[Dnyanu, 100, null, Dnyanu, 100, 50.2, A, null, qyantum, A, Dnyanu]
		
		//get()
		System.out.println(al.get(5));//50.20
		
		//modify/replace -> set()
		System.out.println(al.set(3, "gopal"));
		System.out.println(al.get(3));//gopal
		System.out.println(al);//[Dnyanu, 100, null, gopal, 100, 50.2, A, null, qyantum, A, Dnyanu, Dnyanu, 100, null, Dnyanu, 100, 50.2, A, null, qyantum, A, Dnyanu]

		
	//size()
		System.out.println(al.size());//11
		
		//isEmpty()
        System.out.println(al.isEmpty());//false
        
        //contain()
     System.out.println(al.contains('A'));//true
     
     //remove()-by index
     al.remove(2);
     System.out.println(al);
     
     
     //insert info in between array list -> right shift operation
     al.add(1,"pune");
     System.out.println(al.get(1));//pune
     System.out.println(al.get(3));//gopal
     System.out.println(al);
     
     //delete info from arralist -> left shift operation
     al.remove(5);
     System.out.println(al.get(5));
     System.out.println(al);
     
     System.out.println("---print all the information of arraylist using iterator---");
     
     Iterator itr = al.iterator();
     while(itr.hasNext()) {
    	 System.out.println(itr.next());
    	 
     }
     System.out.println("print all information of arraylist using listiterator");
     ListIterator litr=al.listIterator();
     while(litr.hasNext()) {
    	 System.out.println(litr.next());
     }
     System.out.println("print all information in arraylist using for loop");
     for(int i=0;i<=al.size()-1;i++) {
    	 System.out.println(al.get(i));
     }
     System.out.println("print all information in arraylist using each loop");
     for(Object d1:al) {
    	 System.out.println(d1);
     }
	}

}
