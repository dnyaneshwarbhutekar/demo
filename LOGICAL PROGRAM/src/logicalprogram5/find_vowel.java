package logicalprogram5;

public class find_vowel{
	public static void main(String[] args) {
		
		String str = "Dnyaneshwar";
		int count = 0;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i'||str.charAt(i)=='o'|| str.charAt(i)=='u') {
				count++;
				System.out.println("vowel "+str.charAt(i));
			}
		}System.out.println("number of vowel "+count);
	}

}
