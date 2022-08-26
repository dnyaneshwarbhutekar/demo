package constructor;

public class constructor {
	public static void main(String[] args) {
		constructor c=new constructor();
		constructor c1=new constructor("dnyanu");
		constructor c2=new constructor(100,500);
		constructor c3=new constructor(11,22,33);
	}
	constructor(){
		int a=123;
		int b=159;
		System.out.println(a+b);
	}
	constructor(int a,int b){
		System.out.println("mul"+(a*b));
	}
	constructor(String name){
		System.out.println("name "+name);
		
	}
	constructor(float c,int v, float b){
		System.out.println("add"+(c+v+b));
	}
}
