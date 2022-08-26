package STRING;

public class STRING_FUNCTION {
	public static void main(String[] args) {
		String d1="DNYANU";
	    String d2="dnyanu";
	    String d3="";
	    String d4="Dnyanu Bhutekar";
	    String d5="Dnyanu";
	//1.equal
	if(d1.equals(d4)) {
		System.out.println("both the string are equal");
	}else {
	System.out.println("both the string are not equal");
	}
	
	//2.equalsIgnoreCase
	if(d1.equalsIgnoreCase(d2)) {
		System.out.println("both the string are equal");
		
	}else {
		System.out.println("both the string are not equal");
	}
	//3.toLowerCase
	System.out.println(d1.toLowerCase());
	
	//4.toUpperCase
	System.out.println(d2.toUpperCase());
	
	//5.isEmpty
	System.out.println(d3.isEmpty());
	
	//6.startsWith
	System.out.println(d4.startsWith("D"));
	
	//7.endsWth
	System.out.println(d4.endsWith("r"));
	
	//8contains
	System.out.println(d4.contains(d5));
	
	//9concat
	System.out.println(d1.concat(d5));
	
	//10.replace
	System.out.println(d1.replace("U", "A"));
	
	//11.substring
	System.out.println(d4.substring(1,14));
	
	//12.lastindex
	System.out.println(d1.lastIndexOf('N'));
	
	//13.length
	System.out.println(d1.length());
	
	}
}