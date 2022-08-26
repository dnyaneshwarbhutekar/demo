package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		
		ts.add(200);
		ts.add(20);
		ts.add(10);
		ts.add(50);
		ts.add(300);
		ts.add(30);
		ts.add(10);
		
		//ts.add(null);//null point exception
		
		
		System.out.println(ts);//[10, 20, 30, 50, 200, 300]
        System.out.println(ts.contains(200));//true
        System.out.println(ts.size());//6
        System.out.println(ts.isEmpty());//false
        
        ts.remove(20);
        System.out.println(ts);//10, 30, 50, 200, 300]
        
        //first() - use to get 1st element from treeset
        System.out.println(ts.first());//10
        
        //last()- use to get last element from treeset
        System.out.println(ts.last());//300
        
        //pollFirst()- delete first element from treeset
        ts.pollFirst();
        System.out.println(ts);//[30, 50, 200, 300]
        
        //polllast()-delete last element from treeset
        ts.pollLast();
        System.out.println(ts);//30, 50, 200]
        
        System.out.println("--print all info from treeset using itertor---");
        Iterator itr=ts.iterator();
        while(itr.hasNext())
        System.out.println(itr.next());
        
        System.out.println("--print all info from treeset using for each loop---");
        for(Object db:ts)
        System.out.println(db);
        
        System.out.println("---print all info from treeset by descending order---");
        Iterator ditr=ts.descendingIterator();
        while(ditr.hasNext())
        	System.out.println(ditr.next());

	}
	
		
	}


