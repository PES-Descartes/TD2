package com.nexomega;

public class Square {
	double side;
	Vector point;
	double angleRad;
	
	public Square(Vector center) {
		this.point = center;
	}
	
	public Square(double side, Vector center, double angleRad) {
		this.side = side;
		this.point = center;
		this.angleRad = angleRad;
	}
	
	void rotateClockwise(double radians) {
		this.angleRad += radians;
	}
	
	public void printSvgLine(String color) {
		String toString = "<rect x='" + point.x + "' y='" + point.y + "' width='" + side + "' height='" + side + "' transform='rotate(" + (angleRad* 180/Math.PI) +" " + (point.x + (side/2)) + " " + (point.y + (side/2)) + ")' fill='" + color + "'/>";
		System.out.println(toString);
	}
}
