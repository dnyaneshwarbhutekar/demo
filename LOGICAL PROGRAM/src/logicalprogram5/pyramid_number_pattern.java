package logicalprogram5;

public class pyramid_number_pattern {
	public static void main(String[] args) {
		
		for(int i=1;i<10;i++) {
			for(int j=1;j<10-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" "+k);
			}
			System.out.println();
		}
	}

}
