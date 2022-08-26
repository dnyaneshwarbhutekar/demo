package polymorphism;

public class methodoverriding1 extends methodoverriding {
	public void laptop() {
		System.out.println("laptop");
		
	}
	public void iphone() {
		System.out.println("iphone");
	}
	public static void main(String[] args) {
		methodoverriding1 o=new methodoverriding1();
		o.car();
		o.mobile();
		o.iphone();
		o.laptop();
	}

}

