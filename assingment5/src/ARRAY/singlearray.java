package ARRAY;

public class singlearray {
	public static void main(String[] args) {
		String arr[]=new String[6];
		arr[0]="Dnyanu";
		arr[1]="yuvraj";
		arr[2]="smita";
		arr[3]="mohini";
		arr[4]="prashant";
		arr[5]="ganesh";
		
		System.out.println(arr[0]);//dnyanu
		
		for(int i=0;i<=5;i++) {
		System.out.print(arr[i]+"  ");
		}
		for(int i=arr.length-1;i>=0;i--) {
		System.out.println(arr[i]);
	}}
}
