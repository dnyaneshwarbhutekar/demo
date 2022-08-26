package polymorphism;

public class methodoverloading {
	public void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	public void add(int c,int d) {
		System.out.println(c+d);
	}
	public void add(int l,int m,int n) {
		System.out.println(l+m+n);
	}
	public static void main(String[] args) {
		methodoverloading m= new methodoverloading();
		m.add();
		m.add(40,50);
		m.add(20,30,40);
	}

}
