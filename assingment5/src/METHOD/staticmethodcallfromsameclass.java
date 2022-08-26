package METHOD;

public class staticmethodcallfromsameclass {
	public static void main(String[] args) {
		add();
		mul();
		String();
	}
		public static void add() {
			int a=50;
			int b=40;
			System.out.println((a+b));
		}
		public static void mul() {
			double d=10.20;
			byte k =14;
			System.out.println("mul "+d*k);
		}
		public static void String() {
			char grade='D';
			String name="dnyanraj";
			String mob="9011608564";
			String mailid="dnyanrah12@gmail.com";
			System.out.println(grade);
			System.out.println(name);
			System.out.println(mob);
			System.out.println(mailid);
		}
		
		
	}


