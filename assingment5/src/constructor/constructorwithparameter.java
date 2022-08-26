package constructor;

public class constructorwithparameter {
	constructorwithparameter(int a, int b){
		System.out.println(a+b);
	}
	constructorwithparameter(String name){
		System.out.println("name "+name);
	}
	constructorwithparameter(int a, int b, int c){
		System.out.println("mul "+(a*b*c));
	}
	constructorwithparameter(int f,int d,int k,int w){
		System.out.println("sub "+(f-d));
	}
	public static void main(String[] args) {
		constructorwithparameter d=new constructorwithparameter(10,20);
		constructorwithparameter d1=new constructorwithparameter("DNYANU");
		constructorwithparameter d2=new constructorwithparameter(2,5,4);
		constructorwithparameter d3=new constructorwithparameter(10,20,40,50);
		
		
		
	}
}
