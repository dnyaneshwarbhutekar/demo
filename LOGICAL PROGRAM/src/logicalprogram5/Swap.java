package logicalprogram5;

public class Swap {
	public static void main(String[] args) {
		 int a=50;
		 int b=100;
		 
		 int c=10;
		 int d=20;
		 
		 
		 a=a+b;//50+100=150
		 b=a-b;//150-100=50
		 a=a-b;//150-50=100
		 
		 System.out.println("a:"+a+ "b:"+b);
		 
		
		 
		 int temp = c;
		c=d;
	     d=temp;
		 System.out.println("c:"+c+ "d:"+d);
	}

}
