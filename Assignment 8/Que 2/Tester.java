package p82;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
	Circle c= new Circle ();
	System.out.println("Enter value of diameter : ");
	Scanner sc =  new Scanner(System.in);
	double dia;
	dia=sc.nextDouble();
	
	try {
		c.setDiameter(dia);
	} catch (NegativeDiameterException e) {
		
		e.printStackTrace();
	}
	}

}
