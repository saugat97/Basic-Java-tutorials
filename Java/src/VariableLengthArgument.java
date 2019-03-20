
public class VariableLengthArgument {
	public static void main(String[] args) {
		System.out.println(average(10,20,30,40,50,60));
	}
	
	public static int average(int...num) /// we put ... ellipse in the parameter when we don't knwo how many no we want
	{
		int total = 0;					//enhanced for loop
		for(int x: num) {
			total += x;
		}
		return total/num.length;
	}
}
