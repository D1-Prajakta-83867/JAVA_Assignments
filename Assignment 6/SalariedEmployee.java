package p6;
import java.util.Scanner;
public class SalariedEmployee extends Employee {
	private int weeklySalary;

	@Override
	public void accept(Scanner sc)
	{
		super.accept(sc);
		System.out.println("Enter Weekly Salary : ");
		weeklySalary=sc.nextInt();		
	}
	
	
//	public int getWeeklySalary() {
//		return weeklySalary;
//	}

	@Override
	public String toString() {
		return "SalariedEmployee [ " + super.toString() + " weeklySalary=" + weeklySalary+"]";
	}
	
	
	public double calculateTotalSalary() {
		return weeklySalary;
	}

	
	
}
