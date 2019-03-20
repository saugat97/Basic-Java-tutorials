import java.util.Scanner;

public class Calculate
{
	public static void main(String[] args) {
		Scanner write = new Scanner(System.in);
		double firstNum, secondNum, totalSum;
		
		System.out.println("Enter the first number: ");
		firstNum = write.nextDouble();						//for numbers with decimals
		
		System.out.println("Enter the second number: ");
		secondNum = write.nextDouble();  					
		
		totalSum = firstNum + secondNum;
		System.out.println("The total sum is "+totalSum+"\n");
		
		
		int male, female, population;
		System.out.println("how many men are present?");
		male = write.nextInt();								//for numbers w/o decimals
		
		System.out.println("how many women are present?");
		female = write.nextInt();
		
		population = male + female;
		System.out.println("The total population is "+ population);
		
	}
}
