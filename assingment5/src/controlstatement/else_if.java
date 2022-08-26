package controlstatement;

public class else_if {
	public static void main(String[] args) {
		long marks=55;
		if(marks>=60) {
			System.out.println("first class");
		}
		else if(marks>=50) {
			System.out.println("second class");
		}
		else if(marks>=35) {
			System.out.println("pass");
		}
		else {
			System.out.println("wrong information");
		}
	}

}
