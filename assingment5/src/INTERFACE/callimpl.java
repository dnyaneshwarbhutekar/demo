package INTERFACE;

public class callimpl implements i11,i22 {
	public void add() {
		int a=50;
		int b=100;
		System.out.println(a+b);
	}
	public void sub() {
		int i=40;
		int o=20;
		System.out.println(i-o);
	}
	public static void main(String[] args) {
		 callimpl d=new  callimpl();
		d.add();
		d.sub();


		
	}

}

