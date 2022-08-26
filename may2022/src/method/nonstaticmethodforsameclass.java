package method;

public class nonstaticmethodforsameclass {
	public static void main(String[] args) {
		
	
	nonstaticmethodforsameclass cl=new nonstaticmethodforsameclass();
	cl.String();
	cl.mul();
}
	public void String() {
		String name = "dnyanu";
		System.out.println(name);
	}
public static void mul() {
	int c=12;
	int d=20;
	System.out.println(c*d);
}
}
