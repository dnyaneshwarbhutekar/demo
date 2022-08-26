package thisandsuperkeyword;

public class superkeyword2 extends superkeyword {
	int a=60;
	public void add() {
		int a=70;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}public static void main(String[] args) {
		superkeyword2 s=new superkeyword2();
		s.add();
	}

}
