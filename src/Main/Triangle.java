package Main;

/** 
 * @author Ian Heffner
 * This is the Triangle class. It extends the abstract class GeometricObject.
 * GeometricObject passes on three abstract methods that require implementation.
 * These methods are getArea, getPerimeter, and toString.
 *
 * There are five private attributes:
 *  side1, side2, side3: the three side lengths
 *  perimeter: the calculated perimeter
 *  area: the calculated area
 */

public class Triangle extends GeometricObject {
	//Establish attributes
	private double side1;
	private double side2;
	private double side3;
	
	private double perimeter;
	private double area;
	
	//Getters for side length
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	//No-arg constructor with default side lengths
	public Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	//Constructor with three side lengths
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	//Implement getPerimeter for GeometricObject
	@Override
	public double getPerimeter() {
		//Calculate perimeter by adding side lengths together
		this.perimeter = side1 + side2 + side3;
		return this.perimeter;
	}
	
	//Implement getArea from GeometricObject
	@Override
	public double getArea() {
		//Area calculation done using Heron's formula
		double halfp = this.perimeter / 2;
		double a = this.side1;
		double b = this.side2;
		double c = this.side3;
		this.area = Math.sqrt(halfp * (halfp - a) * (halfp - b) * (halfp - c));
		return this.area;
	}
	
	//Implement toString from GeometricObject
	@Override
	public String toString() {
		//Return a String description of the triangle
		String description = "The triangle has three side lengths: " + side1 + 
				", " + side2 + ", and " + side3 + ".\nThe perimeter of the triangle is " +
				perimeter + ".\nThe area of the triangle is " + area + ".";
				;
		return description;
	}
	
}
