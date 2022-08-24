package logicalprogram5;

import java.util.HashMap;
import java.util.Set;

public class reove_duplicate_character_from_Sring_using_hashmap {
	public static void main(String[] args) {
		String s="akkshjsieeuhcbdujfriryhsjs";
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<=s.length()-1;i++) {
			char c = s.charAt(i);
			
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		Set<Character> keys = map.keySet();
		System.out.println(keys);
	}

}
