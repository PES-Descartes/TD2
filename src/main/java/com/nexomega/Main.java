 package com.nexomega;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		//exo123();
		
		System.out.println("<svg");
		System.out.println("  viewBox='0 0 100 100' style='background: white'");
		System.out.println("  version='1.1' xmlns='http://www.w3.org/2000/svg'");
		System.out.println(">");
		Rectangle rect = new Rectangle(new Vector(5,5), 10, 5, 0);
		/*rect.printSvgLine("blue");

		Rectangle rectangle = new Rectangle(rect.getCPoint(), 10, 5,Math.PI/4);
		rectangle.printSvgLine("red");

		Rectangle rectangle1 = new Rectangle(rectangle.getCPoint(), 10, 5,6);
		rectangle1.printSvgLine("green");

		Rectangle rectangle2 = new Rectangle(rectangle1.getCPoint(), 10, 5,Math.PI/6);
		rectangle2.printSvgLine("yellow");*/

		recursiveTransform(rect, 50);
		System.out.println("</svg>");
	}

	public static void recursiveTransform(Rectangle rect, int s) {
		if(s>0) {
			rect.printSvgLine("black");
			rect = new Rectangle(rect.getCPoint(), rect.width * 0.9, rect.height*0.9, rect.angleRad+Math.PI/4);
			recursiveTransform(rect, s-1);
		}
	}
	
	public static void exo123() {
		Circle myCircle = new Circle(new Vector(1, 1), 5);
		myCircle.setRadius(2);
		myCircle.center.x = -1;
		myCircle.setRadius(myCircle.radius+1);
		Vector point2 = new Vector(3,-2.5);
		myCircle.center = point2;
		Vector point3 = new Vector(-1.2,0.7);
		point2.x = point3.x;
		Circle anotherCircle = new Circle(point3, 3.1);
		
		System.out.println("Peri myCircle : " + myCircle.perimeter() + " anotherCircle : " + anotherCircle.perimeter());
	}

	public static void exo45() {
		System.out.println("<svg");
		System.out.println("  viewBox='0 0 100 100' style='background: white'");
		System.out.println("  version='1.1' xmlns='http://www.w3.org/2000/svg'");
		System.out.println(">");
		Circle circle1 = new Circle(new Vector(10, 30), 5);
		circle1.printSvgLine("pink");
		Square square1 = new Square(20, new Vector(0, 5), 0);
		square1.printSvgLine("blue");
		Square square2 = new Square(10, new Vector(5, 37), Math.PI/4);
		square2.printSvgLine("green");
		System.out.println("</svg>");
	}
}
