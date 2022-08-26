package controlstatment;

public class nestedif {
	public static void main(String[] args) {
		String id = "@dny";
		String pwd = "123";
				
		if(id == "@dny") {
			System.out.println(" write id");
			if(pwd == "123") {
				System.out.println("write pwd");
				System.out.println("login successful");
				
			}else {
				System.out.println("wrong pwd");
				System.out.println("login failed");
				
			}
			
		}else {
			System.out.println("wrong id");
			System.out.println("loginfailed");
		}
	}

}
