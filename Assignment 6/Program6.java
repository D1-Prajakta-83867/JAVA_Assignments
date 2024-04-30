package p6;
import java.util.*;
import java.util.Scanner;

public class Program6 {
	
	public static int Menu(Scanner sc)
	{
		System.out.println("	0.	Exit \n	1.	Add Salaried Employee \n 	2.	Add Hourly Employee \n "
				+ "	3.	Add Commission Employee \n	4. 	Add Base Salaried Commision Employee ");
		System.out.println("     	5.     Display all details all employee");

		System.out.println("	Enter your choice :	");
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
		int choice,counter=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of Employee: ");
		int eno = sc.nextInt();
        Employee[] emp = new Employee[eno];
        for (int i = 0; i < emp.length; i++) 
        {
        	
        }
		while ((choice = Menu(sc)) != 0) {
			switch (choice) {
			
			case 0:
				System.out.println("Thank you.");
				break;
				
			case 1:
				if(counter<emp.length)
				{
					emp[counter]=new SalariedEmployee();
					emp[counter].accept(sc);
					counter++;
				}
				else {
					System.out.println("Array is full ");
				}
				break;
				
			case 2:
				if(counter<emp.length) {
					emp[counter]=new HourlyEmployee();
					emp[counter].accept(sc);
					counter++;
				}
				else
					System.out.println("Array is full");
				break;
				
				
			case 3:
				if(counter<emp.length) {
				emp[counter]=new CommissionEmployee();
				emp[counter].accept(sc);
				counter++;
			}
			else
				System.out.println("Array is full");
			
			break;
				
			case 4:
				if(counter<emp.length) {
					emp[counter]=new BaseSalariedCommisionEmployee();
					emp[counter].accept(sc);
					counter++;
				}
				else
					System.out.println("Array is full");
				
				break;
			case 5:
				double total=0,totalBaseSalariedCommision=0;
			
				for(Employee e:emp) {
					if(e!=null) {
					System.out.println(e);
					total=e.calculateTotalSalary();
					if(e instanceof BaseSalariedCommisionEmployee) {
						totalBaseSalariedCommision+=e.calculateTotalSalary()*0.10;
					}
					
				}
				}
					System.out.println("Total Pay:"+total);
					System.out.println("Total bonus of base Salaried Commision Employee:"+totalBaseSalariedCommision);
			
				
				break;
			default :
				System.out.println("Wrong choice .");
				break;
			}	
		}
		sc.close();

	}

}
