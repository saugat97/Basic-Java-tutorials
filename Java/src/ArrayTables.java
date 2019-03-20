public class ArrayTables {
		public static void main(String[] args) {
			System.out.println("Numbers\tvalues");
			int array[] = {12,20,25,30,40};         //array of length 5
			int index;
						
			for (index = 0; index < array.length; index++) {
				System.out.println(index +"\t"+ array[index]);
			}
			
			//To calculate sum of the elements in an array

			int sum = 0;
			
			for(index = 0; index < array.length; index++) {
				sum += array[index];
			}
			
			System.out.println("\nThe sum of given values is " + sum);
			
			
			//Enhanced for loop: add all the elements 
			int total = 0;
			
			for(int x: array) {
				total += x;
			}
			
			System.out.println("\nSum total = " + total);
			
		}
}
