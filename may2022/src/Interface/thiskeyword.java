package Interface;

public class thiskeyword {
	int a=50;
	public void test() {
		int a=40;
		System.out.println(a);
		System.out.println(this.a);
	}


	public static void main(String[] args) {
		thiskeyword t = new thiskeyword();
		t.test();
		
	}
}
