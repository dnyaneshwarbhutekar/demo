package collection;

import java.util.HashMap;

public class hmap {
	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		
		map.put("amol", 1);
		map.put("rahul", 2);
		map.put("nilesh", 3);
		map.put("abhi",4);
		
		System.out.println(map);//{amol=1, rahul=2, nilesh=3, abhi=4}

		System.out.println(map.size());//4
		
		System.out.println(map.values());//[1,2,3,4]

		
		System.out.println(map.keySet());//[amol, rahul, nilesh, abhi]
		
		System.out.println(map.entrySet());//[amol=1, rahul=2, nilesh=3, abhi=4]


		
		
	}

}
