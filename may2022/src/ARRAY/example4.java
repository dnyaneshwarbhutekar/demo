package ARRAY;

public class example4 {
public static void main(String[] args) {
	int arr[]= {10,20,50,555,485,7,8,6,35,525,};
	//print original order 
	for(int i=0;i<=arr.length-1;i++) {
System.out.println(arr[i]);	
}//print reverse order
for(int i=arr.length-1;i>=0;i--) {
	System.out.println(arr[i]);
}   

}
}