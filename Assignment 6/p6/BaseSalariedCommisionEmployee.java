package p6;

import java.util.Scanner;

public class BaseSalariedCommisionEmployee extends CommissionEmployee {
	private double baseSalary;
	
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter base salary:");
		baseSalary=sc.nextDouble();
		

	}
	@Override
	public String toString()  {
		return "BaseSalariedCommisionEmployee [ " + super.toString()+",base Salary:"+baseSalary ;
	}
	
	public double calculateTotalSalary() {
		return super.calculateTotalSalary()+baseSalary;
	}

}
