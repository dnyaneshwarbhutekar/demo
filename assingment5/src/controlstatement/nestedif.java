package controlstatement;

public class nestedif {
	public static void main(String[] args) {
		
		String usrname="dnyanubhutekar5@gmail.com";
		String pass="dny123456";
	
	if( usrname=="dnyanubhutekar5@gmail.com") {
		System.out.println("correct usrname");
		
		if( pass=="dny123456") {
			System.out.println("correct pass");
			System.out.println("login succesfully");
			
		}else {
			System.out.println("wrong pass");
			System.out.println("login faild");
		}
		
	}else {
		System.out.println("wrong usrname");
		System.out.println("log in faild");
	}
	}
}
