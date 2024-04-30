package p6;
import java.util.Scanner;
public class CommissionEmployee extends Employee{
	private double grossSales;
	private double commissionRate;
	
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter gross sales :");
		grossSales=sc.nextInt();
		System.out.print("Enter commission rate :");
		commissionRate=sc.nextInt();

	}
	
	@Override
	public String toString() {
		return  "CommissionEmployee [ " +super.toString()+", Gross Sales:"+grossSales+",Commission Rate:"+commissionRate;
	}
	
	public double calculateTotalSalary() {
		return grossSales*(commissionRate*0.10);
	}	

		
		
}
