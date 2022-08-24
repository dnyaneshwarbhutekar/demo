package logicalprogram5;

public class remove_whitespace_inString {
	public static void main(String[] args) {
		String str="abc  deg  ijk  lmn  opq";
		str=str.replaceAll(" ", "");
		System.out.println(str);
	}

}
