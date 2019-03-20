package classesWithMethodsAndInstances;

//import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {	
		
		/*
		Scanner input = new Scanner(System.in);
		Name object = new Name();
		System.out.println("Enter the name of your first friend here: ");
		
		String tempName = input.nextLine();
		object.setName(tempName);                 //takes tempName and set it to setName method
		object.print();
		
		System.out.println("Enter the name of your second friend: ");
		String tempName2= input.nextLine();
		object.setName(tempName2);
		object.print2();
		*/
	
	
		//We made a constructor, Constructor allows us to initialize the variable as soon as it is created. 
		//Also, constructor doesn't return value
		
		Name object = new Name("Shady");      //We add String type argument to the parameter
		object.print();
		
		Name object2 = new Name("Remi");      //Different objects have different variables
		object2.print2();
	}
}
