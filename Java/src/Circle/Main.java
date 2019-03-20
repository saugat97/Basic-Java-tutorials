package Circle;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		Circle2D object = new Circle2D();
		//System.out.println("Whats the radius?:");
		
		double radii = input.nextDouble();
		object.setArea(radii);
		object.printArea();
		
	}
	
	
	//My Class: Circle2D
	
	public static class Circle2D {
		
		public double x;
		public double y;
		public double radius;
		public double areaOfCircle;
		public double perimeterOfCircle;
		
		public Circle2D(double x1, double y1, double radii) {
			x1 = x;
			y1 = y;
			radii = radius;
		}
		
		public Circle2D() {
			this(0, 0, 1);
		}

		public double getRadius() {
			return radius;
		}
		
		public void setRadius(double radii) {
			radius = radii;
		}
		
		public void setArea(double rrr) {
			areaOfCircle = rrr * rrr * Math.PI;
		}
		
		public double getArea() {
			return areaOfCircle;
		}
		
		public void printArea() {
			System.out.println("The area of circle is " + areaOfCircle);
		}
		
		public double getPerimeter() {
			return perimeterOfCircle;
		}
		
		public boolean contains(double x, double y) {
			return true;
		}
		
		public boolean contains(Circle2D circle) {
			return true;
		}
		
		public boolean overlaps(Circle2D circle) {
			return true;
		}
	}

}
