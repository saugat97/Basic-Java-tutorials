public class MultidimentionalArray {
	public static void main(String[] args) {
		int array[][] = {{5,10,15,20},{3,6,9,12,15}};
		
		showArray(array);
	}
	
	public static void showArray(int x[][]) {
		for(int row = 0; row < x.length; row++) {
			for(int column = 0; column < x[row].length; column++) {
				System.out.print(x[row][column] + " ");
			}
			System.out.println("\n");
		}
		
	}
}
