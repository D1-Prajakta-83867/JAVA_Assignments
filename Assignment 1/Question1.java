
import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1;
		double num2;
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter First Number : ");

			if(sc.hasNextDouble())
			{
				 num1=sc.nextDouble();	
					System.out.println(" Enter Second Number : ");
					if(sc.hasNextDouble())
					{	
						 num2=sc.nextDouble();	
							
							double avg= (num1+num2)/2;
							System.out.println("Avg ="+avg);
					}	

					else{
						System.out.println("Number2 is not double. !");
					
					}
			}
			
			else {
				System.out.println("Number1 is not double. !");
				
			}
			
	}
		
		
	}

