package generalization;

public class testgeneralization {
	public static void main(String[] args) {
		System.out.println("feature of idea");
		idea i=new idea();
		i.audiocall();
		i.internet();
		i.sms();
		
		System.out.println("feature of airtel");
		airtel a=new airtel();
		a.audiocall();
		a.sms();
		a.internet();
		
		System.out.println("feature of jio");
		jio j=new jio();
		j.audiocall();
		j.internet();
		j.sms();
	}

}
