package METHOD;

public class nonstaticmethodcallfromsameclass {
	public static void main(String[] args) {
		nonstaticmethodcallfromsameclass d=new nonstaticmethodcallfromsameclass ();
		d.add();
		d.sub();
		d.String();
	}
	public void add() {
		
	long l=159753;
	short s=15;
	float f=15;
	System.out.println("add "+l+s+f);
	
	}
	public void sub() {
		int i=500;
		double d=12;
		System.out.println("sub "+(i-d));
		
	}
		public void String() {
			String name="dnyanu";
			String pass="dgh15642";
			String msg="good morning";
			String letter=" india is my country";
			System.out.println(name);
			System.out.println("string pass "+pass);
			System.out.println("msg "+msg);
			System.out.println(letter);
		}
		
	}


