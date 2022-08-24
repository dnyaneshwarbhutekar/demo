package logicalprogram5;

import java.util.HashMap;
import java.util.Set;

public class find_repeating_char_in_String_using_Hashmap {
	public static void main(String[] args) {
		String str="abcdabcdaeeeeeegtftfdt";
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<=str.length()-1;i++) {
			char ch=str.charAt(i);
			
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
				
			}else {
				map.put(ch,1);
			}
			
		}
		Set<Character> keys = map.keySet();
		System.out.println(keys);
		for(Character key:keys) {
			System.out.println(key+":"+map.get(key));
			
		}
	}

}
