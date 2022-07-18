package ar.calculator;

import java.util.Scanner;

public class Calculater {
	
public static void main(String[] args) {
		
		Double number1,number2,solution;
		char operator;
		char repeat;
		Scanner s=new Scanner(System.in);
	do {	
		System.out.println("Enter First number");
		number1 =s.nextDouble();
		System.out.println("Enter Second number");
		number2 =s.nextDouble();
		
		
		
		System.out.println("1.Addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("choose the option ");
		operator =s.next().charAt(0);
		
		
		
		switch (operator) {
		case '1':
			solution=number1 + number2;
			System.out.println("the sum of 2 num is "+ solution);
			break;
		case '2':
			solution=number1 - number2;
			System.out.println("the subtraction of 2 num is "+ solution);
			break;
		case '3':
			solution=number1 * number2;
			System.out.println("multiple of 2 num is " + solution);
			break;
		case '4':
			solution=number1 / number2;
			System.out.println("the division of 2 num is "+ solution);
			break;
		default:
			System.out.println("Invalid operator");
			break;
			
		}
		System.out.println("Do you want to continue Y/N:");
		repeat=s.next().charAt(0);
		}
		while(repeat=='Y'|| repeat=='y');
		System.out.println("Thank you");
		
		s.close();
		
		
	}

}