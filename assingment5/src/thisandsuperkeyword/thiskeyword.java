package thisandsuperkeyword;

public class thiskeyword {
		int a=10;
	
		public void add() {
			int a=20;
			System.out.println(a);
			System.out.println(this.a);
		}public static void main(String[] args) {
			thiskeyword t=new thiskeyword();
			t.add();
		}
	}


