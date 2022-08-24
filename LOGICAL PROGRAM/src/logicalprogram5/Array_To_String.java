package logicalprogram5;

import java.util.Arrays;

public class Array_To_String {
	public static void main(String[] args) {
		String[] s=new String[3];
		
		s[0]="I";
		s[1]="am";
		s[2]="student";
		String s1=Arrays.toString(s);
		
		for(int i=1;i<s1.length()-1;i++) {
			System.out.print(s1.charAt(i));
		}
	}

}
