package INTERFACE;

public class imple implements dnyanu1,dnyanu2,dnyanu3 {
	public void add() {
		int b=10;
		int s=20;
		System.out.println(b+s); 
	}
	public void String() {
		String mob ="9011608564";
		System.out.println(mob);
	}
	public void mul() {
		int i=50;
		int l=100;
		System.out.println(i*l);
	}
	public void sub() {
		int f=10;
		int d=120;
		System.out.println(f-d);
	}
	public void div() {
		int a=50;
		int b=10;
		System.out.println(a/b);
		
	}
	public static void main(String[] args) {
		imple i=new imple();
		i.div();
		i.add();
		i.mul();
		i.String();
		i.sub();
		
		
		
		
		
	}		
	
	}


