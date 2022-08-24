package logicalprogram5;

import java.util.HashMap;
import java.util.Set;

public class find_repeating_string_in_paragraph {
	public static void main(String[] args) {
		String str="abc abcd abc sdlc fog sdlc that is fog xcv bnm xcv bnm asd fgh jkl asd fgh jkl";
		
		//convert paragraph into array
		String arr[]=str.split("");
		
		//create hash map
		
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		
		for(int i=0;i<=arr.length-1;i++) {
			String s=arr[i];
			
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
				
			}else {
				map.put(s,1);
			}
		}
		System.out.println(map);
		
		Set<String> str2=map.keySet();
		for(String st:str2) {
			System.out.println(st+":"+map.get(st));
		}
	}

}
