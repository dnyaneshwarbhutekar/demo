package polymorphism;

public class methodoverloading {
	public static void square() {
		int a = 2;
		System.out.println(a*a);
		
	}public static void square(long x) {
		System.out.println(x*x);
	}
 public static void main(String[] args) {
	methodoverloading m=new methodoverloading();
	m.square();
	m.square(5);
}
}
