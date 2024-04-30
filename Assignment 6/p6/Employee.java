package p6;
import java.util.Scanner;
public abstract class Employee {
	private String FirstName;
	private String LastName;
	private int Empid;
	
	public Employee(String firstName, String lastName, int empid) {
	
		FirstName = firstName;
		LastName = lastName;
		Empid = empid;
	}

	public Employee() {
		//System.out.println("parameterless Employee");
	}
	public void accept(Scanner sc)
	{
		System.out.println("Enter FirstName : ");
		FirstName=sc.next();
		System.out.println("Enter LastName : ");
		LastName=sc.next();
		System.out.println("Enter EmpId : ");
		Empid=sc.nextInt();	
	}

	@Override
	public String toString() {
		return "Employee : FirstName=" + FirstName + ", LastName= " + LastName + ", Empid= " + Empid;
	}
	
	public abstract double calculateTotalSalary();
		
	
}
