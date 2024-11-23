package Utils;

import geometry.Circle;
import geometry.Rectangle;

public class Calculator {
	
	public static void main(String[] args) {
		
		
		Circle cir= new Circle(2.0);
		
	double circArea=	Math.PI*Math.pow(cir.radius,2);
	
	Rectangle rect = new Rectangle(10,12);
	
	
	
		double rectArea = rect.length*rect.breadth;
		
		System.out.println("Artea is "+circArea);
		System.out.println("Rectangle area is "+rectArea);
		
	}

}
