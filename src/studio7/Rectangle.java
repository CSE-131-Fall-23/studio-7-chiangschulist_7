package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle() {
		length = 0.0;
		width = 0.0;
	}
	
	public Rectangle(double l, double  w) {
		length = l;
		width = w;
	}
	
	public double getArea() {
		return length * width;
	}
	
	public double getPerimeter() {
		return length * 2 + width * 2;
	}
	
	public boolean isSquare() {
		return length == width;
	}
	
	public boolean isSmaller(Rectangle r) {
		return getArea() < r.length * r.width;
	}
	
	public void draw() {
		double halfLength = length / 2;
		double halfWidth = width / 2;
		StdDraw.filledRectangle(.5, .5, halfWidth, halfLength);
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(0.25, 0.5);
		Rectangle r2 = new Rectangle(0.5, 0.5);
		System.out.println("Area: " + r1.getArea());
		System.out.println("Perimeter: " + r1.getPerimeter());
		System.out.println("isSquare: " + r1.isSquare());
		System.out.println("isSmaller: " + r1.isSmaller(r2));
		r1.draw();
	}
}




