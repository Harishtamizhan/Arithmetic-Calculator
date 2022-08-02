package com;

public class Encapsulation1 {
	
	public static void main (String[] args)  
    { 
        Encapsulation obj = new Encapsulation(); 
        obj.setName("M.Harish Kumar"); 
        obj.setAge(22); 
        obj.setRoll(101); 
        System.out.println("My name: " + obj.getName()); 
        System.out.println("My age: " + obj.getAge()); 
        System.out.println("My roll: " + obj.getRoll());      
    }

}
