package collection;
import java.util.Vector;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Enumeration;

public class VECTOR {
	
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("good");
		v.add('A');
		v.add(500);
		v.add(null);
		v.add(false);
		v.add(12.32f);
		v.add(12346799588l);
		v.add('A');
		System.out.println(v);//[good, A, 500, null, false, 12.32, 12346799588, A]

		System.out.println(v.size());//8
		
		System.out.println(v.get(2));//500
		
		//modify/replace/update
		v.set(4, true);
		System.out.println(v);//[good, A, 500, null, true, 12.32, 12346799588, A]

		
		System.out.println(v.contains(1000));//false
		
		System.out.println(v.isEmpty());//false
		
		System.out.println(v.capacity());//10
		
		//insert info in between vector -> right shift operation
		
		v.add(5,"sawana");
		System.out.println(v.get(5));//sawana
		System.out.println(v.get(6));//12.32

		System.out.println(v);//[good, A, 500, null, true, sawana, 12.32, 12346799588, A]

		
		//remove/delete info in vector -> left shift operation
		 v.remove(5);
		 
		System.out.println(v.get(5));//12.32
		System.out.println(v);
	
	System.out.println("print all info in vector using itrator");
	Iterator itr=v.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());}
	
	System.out.println("print all info in vector using listiterator");
	ListIterator litr=v.listIterator();
	while(litr.hasNext()) {
		System.out.println(litr.next());
		
	}
	System.out.println("print all info in vector using for loop");
		for(int i=0;i<=v.size()-1;i++) {
		System.out.println(v.get(i));}
		
		System.out.println("print all info in vector using for each loop");
		for(Object d:v) {
			System.out.println(d);
		}
		System.out.println("print al infi in vector using enumeration");
		Enumeration en=v.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		
		
	}

}
