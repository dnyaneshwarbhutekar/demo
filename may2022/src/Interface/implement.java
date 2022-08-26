package Interface;

public class implement implements dnyanu1,dnyanu2,dnyanu3 {
	public void sub() {
		int a=10;
		byte b=2;
		System.out.println(a-b);
	}public void String() {
		String name="dnyanraj";
		System.out.println(name);
	}public void mul() {
		short s=50;
		long l=100;
		System.out.println(s*l);
	}public void div() {
		float f=10.5f;
		double d=123.45;
		System.out.println(f/d);
	}public void add() {
		int a=10;
		int v=10;
		System.out.println(a+v);
	}public static void main(String[] args) {
		implement t=new implement();
		t.sub();
		t.String();
		t.mul();
		t.div();
		t.add();
	}

}
