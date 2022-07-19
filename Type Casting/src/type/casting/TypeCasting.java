package type.casting;

public class TypeCasting {

public static void main(String[] args) {
		
		System.out.println("Implicit Type Casting");
		
		int a=44;
		System.out.println("Value of a: "+a);
		
		char b='M';
		System.out.println("Value of b: "+b);
		
		float c=a;
		System.out.println("Value of c: "+c);
		
		long d=a;
		System.out.println("Value of d: "+d);
		
		double e=a;
		System.out.println("Value of e: "+e);
		
				
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		
		double x=90.5;
		char y=(char)x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		
	
}
}
