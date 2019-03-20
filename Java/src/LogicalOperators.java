import java.util.Scanner;

public class LogicalOperators {
		public static void main (String[] args) {
			Scanner write = new Scanner(System.in);
			int age;
			double gameBalance;
			System.out.println("---------Welcome to the Game Center---------");
			
			System.out.println("Enter the money you have:");
			gameBalance = write.nextDouble();		//takes no with decimals
			
			System.out.println("Please enter your age in years?");
			age = write.nextInt();					//takes only number w/o decimals (threw error when I put decimal year)
			
			if (age < 16  || gameBalance < 16) {
				System.out.println("We are sorry! You won't be able to participate in this game");
			}
			else {
				System.out.println("Please procede to the entry signal. Enjoy the visit!");
			}
		}
}


//If you have enough money to play the game but your age is less than 16, you wont be able to play the game