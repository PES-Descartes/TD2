package com.nexomega;

public class Rectangle {
	Vector point;
	double width, height, angleRad;
	
	public Rectangle(Vector point, double width, double height, double angleRad) {
		this.point = point;
		this.width = width;
		this.height = height;
		this.angleRad = angleRad;
	}
	
	public Rectangle rotation(double radians) {
		Rectangle rectangle = new Rectangle(point, width, height, angleRad);
		rectangle.point = rectangle.point.rotation(angleRad + radians);
		
		return rectangle;
	}
	
	public Rectangle changeSize(double multiplier) {
		return new Rectangle(point, width * multiplier, height * multiplier, angleRad);
	}
	
	public Rectangle changePos(Vector vect) {
		return new Rectangle(point.addition(vect), width, height, angleRad);
	}

	public Rectangle changeAngle(double angleRad) {
		return new Rectangle(point, width, height, angleRad);
	}
	
	public void printSvgLine(String color) {
		System.out.println(toSvg(color));
	}

	public String toSvg(String color) {
		return "<rect x='" + point.x + "' y='" + point.y + "' width='" + width + "' height='" + height + "' transform='rotate(" + (angleRad* 180/Math.PI) +" " + (point.x) + " " + (point.y ) + ")' fill='" + color + "'/>";
	}

	public Vector getBPoint() {
		return new Vector(this.getPoint().getX() + getWidth()*Math.cos(this.getAngleRad()), this.getPoint().getY()+ getWidth()*Math.sin(this.getAngleRad()));
	}

	public Vector getCPoint() {
		double length = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		double angle = Math.asin(getHeight()/length);
		//System.out.println("A : " + angle + " L : " + length);
		return new Vector(this.getPoint().getX() + length*Math.cos(this.getAngleRad()+angle), this.getPoint().getY()+ length*Math.sin(this.getAngleRad()+angle));
	}

	public Vector getDPoint() {
		return new Vector(this.getPoint().getX() + getHeight()*Math.cos(this.getAngleRad()+Math.PI/2), this.getPoint().getY()+ getHeight()*Math.sin(this.getAngleRad()+Math.PI/2));
	}

	public Vector getPoint() {
		return point;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double getAngleRad() {
		return angleRad;
	}
}
