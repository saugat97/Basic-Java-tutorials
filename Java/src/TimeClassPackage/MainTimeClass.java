package TimeClassPackage;

import java.util.Scanner;

public class MainTimeClass {
	public static void main (String[] args) {
		TimeClass object = new TimeClass();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the hours: ");
		int h1 = input.nextInt();
		
		System.out.println("Enter the minutes: ");
		int m1 = input.nextInt();
		
		System.out.println("Enter the seconds: ");
		int s1 = input.nextInt();
		
		object.setTime(h1, m1, s1);  //gets userInput and sets it to the setTime method
		
		System.out.println("Military time: " + object.toMilitary());
		System.out.println("Regular time: " + object.toRegular());
		
	
	}
}
