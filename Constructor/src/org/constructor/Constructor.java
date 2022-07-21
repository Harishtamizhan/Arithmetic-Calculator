package org.constructor;

class Employee {
	int id;
	String name;
	float salary;
	public Employee() {
		id=2526916;
		name="M Harish Kumar";
		salary = 30000;
	}
	Employee(int id, String name, float salary){
		this.id = id;
		this.name=name;
		this.salary = salary;
	}
	void display() {
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
}


public class Constructor {
	public static void main(String[] args) {
		Employee emp1 = new Employee();  
		System.out.println("Default constructor");
		 emp1.display();	
		Employee emp2 = new Employee(2233999, "Prakash", 29000); 
		System.out.println("Parameterized constructor");
		emp2.display();

}
	

}
