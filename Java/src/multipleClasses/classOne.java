package multipleClasses;

import java.util.Scanner;

public class classOne {
	public static void main(String[] args) {
	
		/* classTwo object2= new classTwo();      		 //Create an object of classTwo 
		  object2.simpleMessage();              		 //object name with method call of classTwo	  
        */	
		
		Scanner input = new Scanner (System.in);
		classTwo object = new classTwo();
		
		System.out.println("Enter your name here: ");
		String name = input.nextLine();            		 //to input String
	
		object.simpleMessage(name);					     //object to call the method
		
	}

}
