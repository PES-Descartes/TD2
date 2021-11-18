package com.nexomega;

public class Circle {
	double radius;
	Vector center;
	
	public Circle(Vector center, double radius) {
		this.radius = radius;
		this.center = center;
	}
	
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return "("+ center.getX() + ", " + center.getY() + ")";
	}
	
	public void printSvgLine(String color) {
		String toPrint = "<circle cx='" + center.x + "' cy='" + center.y + "' r='" + radius + "' fill='" +color+ "'/>";
		System.out.println(toPrint);
	}
}
