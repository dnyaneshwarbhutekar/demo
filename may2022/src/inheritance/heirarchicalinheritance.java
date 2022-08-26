package inheritance;

public class heirarchicalinheritance {
	public static void main(String[] args) {
		child1 c1 = new child1();
		c1.car();
		c1.home();
		
		child2 c2 = new child2();
		c2.bike();
	    c2.home();
	    
	    child3 c3 = new child3();
    	c3.mobile();
    	c3.home();
	}

}
