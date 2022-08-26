
public class SPRINTFUNCTION {
public static void main(String[] args) {
	String N1="DNYANESHWAR";
	String N2="dnyaneshwar";
	String N3="dnyanraj";
	String N4="Dnyanu";
	
	System.out.println(N2.replace ('d', 'D'));
	System.out.println(N4.isEmpty());
	System.out.println(N4.concat(N2));
	System.out.println(N1.substring(5));
	System.out.println(N1.substring(4,8));
	System.out.println(N2.endsWith("ar"));
	System.out.println(N2.startsWith("dny"));
	System.out.println(N4.lastIndexOf('a'));
	System.out.println(N3.charAt(5));
	System.out.println(N2.contains(N4));
	System.out.println(N2.equals(N4));
    System.out.println(N2.equalsIgnoreCase(N4));
    System.out.println(N1.length());
    System.out.println(N2.toUpperCase());
    System.out.println(N1);
    System.out.println(N1.toLowerCase());
    if(N1.equals(N4)) {
    	System.out.println("both the string are equal");
    }else {
    	System.out.println("both the string are not equal");
    }if(N2.equalsIgnoreCase(N3)) {
    	System.out.println("both the string are equal");
}else {
	System.out.println();
}
	
}
}
