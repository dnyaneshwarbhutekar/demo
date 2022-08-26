package method;

public class nonstaticsame {
	public static void main(String[] args) {
		nonstaticsame a=new nonstaticsame();
		
	a.sub();	
	}public void sub() {
		int a=10;
		short b=40;
		System.out.println(a-b);
	}

}
