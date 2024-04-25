
import java.util.Scanner;
package com.app.geometry.Point2D;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String [] args) 
	{
		
		System.out.print("Enter x co-ordinate of point p1:");
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		System.out.print("Enter y co-ordinate of point p1:");
		int y1=sc.nextInt();
		
		Point2D p1=new Point2D(x1,y1);

		System.out.print("Enter x co-ordinate of point p2:");
		int x2=sc.nextInt();
		System.out.print("Enter y co-ordinate of point p2:");
		int y2=sc.nextInt();
		
		Point2D p2=new Point2D(x2,y2);
		
	
		System.out.println(p1.getDetails());
		System.out.println(p2.getDetails());
		
	
		if(p1.isEqual(p2)) {
			System.out.println("P1 and P2 are located at same position");
		}
		else {
		System.out.println("Distance between two points is: "+ p1.calculateDistance(p2));
		}
}
}