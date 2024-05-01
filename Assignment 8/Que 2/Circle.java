package p82;

import java.awt.geom.Point2D;

public class Circle {

	private Point2D centerPoint;
	 private double diameter;

	 
	 public Circle() {
	     this.centerPoint = new Point2D.Double(0, 0);
	     this.diameter = 100;
	 }

	
	 public double getDiameter() {
	     return diameter;
	 }

	 public void setDiameter(double diameter) throws NegativeDiameterException {
	     if (diameter < 0) {
	         throw new NegativeDiameterException("Diameter cannot be negative.");
	     }
	     this.diameter = diameter;
	 }
	
}


