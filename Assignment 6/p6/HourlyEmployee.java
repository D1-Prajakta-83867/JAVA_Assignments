package p6;
import java.util.Scanner;
public class HourlyEmployee extends Employee{
	private int hrs;
	private int wages;
	private double totalSalary;
	
	
	public HourlyEmployee() {
		System.out.println("Hourly Employee");
	}

	
	@Override
	public void accept(Scanner sc) {
		
		super.accept(sc);
		System.out.println("Enter Hrs: ");
		hrs=sc.nextInt();
		
		System.out.println("Enter Wages  : ");
		 wages=sc.nextInt();	
	}

	@Override
	public String toString() {
		return "HourlyEmployee [ " + super.toString() + " hrs= " + hrs + ", wages = " + wages +  "]";
	}

	@Override
	public double calculateTotalSalary() {
		
		if(hrs<40)
		{
			return totalSalary= (hrs*wages);				
		}
		else {
			return totalSalary=40*wages+(hrs-40)*wages*1.5;
		
		}
	}
	
}
