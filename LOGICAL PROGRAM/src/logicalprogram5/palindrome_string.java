package logicalprogram5;

public class palindrome_string {
	public static void main(String[] args) {
		String s="anna";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.endsWith(rev)) {
			System.out.println("string is palindrome");
		}else {
			System.out.println("string is not palindrome");
		}
	}

}
