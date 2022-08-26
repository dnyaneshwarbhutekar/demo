package collection;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class hashset1 {
	public static void main(String[] args) {
    //creat arraylist 
		ArrayList al=new ArrayList();//built in class
		
				al.add("reshma");
				al.add(200);
				al.add(true);
				al.add(200);
				al.add('A');
				al.add(true);
				al.add(200);
				al.add("reshma");
				al.add('A');
				
				System.out.println(al);//[reshma, 200, true, 200, A, true, 200, reshma, A]
				
				HashSet hs=new HashSet(al);
				System.out.println(hs);//[reshma, A, 200, true]
				
				LinkedHashSet lhs=new LinkedHashSet(al);
				System.out.println(lhs);//[reshma, 200, true, A]
				
				//TreeSet ts = new TreeSet();
				//System.out.println(ts);//class cast exception

				
				

				
	}

}
