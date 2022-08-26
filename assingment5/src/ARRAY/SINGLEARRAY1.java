package ARRAY;

import java.util.Arrays;

public class SINGLEARRAY1 {
	public static void main(String[] args) {
        
		int arr[]= {1,2,10,3,4,20,51,14,6,7,8,9};
		System.out.println(arr.length);
		
		System.out.println("print array info in original order");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("print array info in reverse order");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		System.out.println("ascending order");
		Arrays.sort(arr);
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
			
		}
		System.out.println("descending order");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}

}
