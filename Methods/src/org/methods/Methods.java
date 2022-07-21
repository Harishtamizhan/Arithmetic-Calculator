package org.methods;

public class Methods {
	public void display() {
		System.out.println("Methods");
	}
	private static int add(int x,int y) {
		return x+y;

	}
	private int add(int x,int y,int z) {
		return x+y+z;
		

	}
	public static void main(String[] args) {
		int x=20,y=40,z=60;
		Methods n=new Methods();
		n.display();
		System.out.println("Call by value");
		System.out.println(add(x,y));
		System.out.println("Call by Method overloaded methods ");
		System.out.println(n.add(x,y,z));
	}

}
