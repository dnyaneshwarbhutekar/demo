package ARRAY;

import java.util.Arrays;

public class examole7 {
	public static void main(String[] args) {
		int arr[]= {10,20,5,4,758,45,6,25,11,24,52,6,3,00,};
		System.out.println("orginal order");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]+"  ");
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
