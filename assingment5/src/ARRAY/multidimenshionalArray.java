package ARRAY;

public class multidimenshionalArray {
	public static void main(String[] args) {
		int arr[][] =new int [2][3];
		arr[0][0]=100;
		arr[0][1]=300;
		arr[0][2]=500;
        arr[1][0]=200;
        arr[1][1]=400;
        arr[1][2]=600;
        System.out.println(arr[1][2]);
        for(int i=0;i<=arr.length-1;i++) 
        	
        	for(int j=0;j<=arr.length-1;j++) {
            	System.out.println(arr[i][j]);
        
        }

		
	}

}
