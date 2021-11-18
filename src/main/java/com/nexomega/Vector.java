package com.nexomega;

public class Vector {
	double x, y;
	
	public Vector(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Vector addition(Vector vector) {
		return new Vector(this.x + vector.x, this.y + vector.y);
	}
	
	public Vector substraction(Vector vector) {
		return new Vector(this.x - vector.x, this.y - vector.y);
	}
	
	public Vector opposite() {
		return new Vector(this.x*-1, this.y*-1);
	}
	
	public Vector scalarMultiplication(double multiplier) {
		return new Vector(multiplier*this.x, multiplier*this.y);
	}
	
	public Vector rotation(double radians) {
		return new Vector(this.x*Math.cos(radians) - this.y*Math.sin(radians), this.x*Math.sin(radians) - this.y*Math.cos(radians));
	}
	
	public double norme() {
		return Math.hypot(this.x, this.y);
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public String toString() {
		return "("+ x + ", " + y + ")";
	}
}
