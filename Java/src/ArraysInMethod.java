public class ArraysInMethod {
	public static void main(String[] args) {
		int array[] = {5,10,15,15,20};
		
		addMethod(array);

		for(int y: array)
			System.out.println(y);
	}
	
	//Add 5 on each elements of an array
	public static void addMethod(int x[]) {
		for (int i = 0; i < x.length; i++) {
			x[i] += 5;
		}
	}
}
