package ARRAY;

public class example6 {
	public static void main(String[] args) {
		int arr[][]= {{10,20,30},{40,50,60}};
		System.out.println(arr.length);
		
		
		for(int i=0;i<=arr.length-1;i++) {//row
			
			for(int j=0;j<=arr.length-1;j++) {//column
				System.out.println(arr[i][j]);
				
			}
		}System.out.println();
		
	}

}
