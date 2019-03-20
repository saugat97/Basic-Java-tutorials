import java.util.Scanner;

public class AverageCalculate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int total = 0;           
		int grade;
		int counter = 0;
		int average;
		int n;               //for n no of courses taken
		
		System.out.println("How many courses did you take? ");
		n = input.nextInt();
		
		System.out.println("Enter your grades for " + n + " courses:");
		while (counter < n) {
			grade = input.nextInt();
			total += grade;
			counter++;
		}
		
		average = total/n;
		System.out.print("\n The average is: " + average );
		
	}
}
