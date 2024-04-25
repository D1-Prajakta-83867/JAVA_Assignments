import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		int AccNo ,AllowedCredits,CreditsApplied,ItemsCharged,PendingBalance,CalcBalance ;
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Account Number : ");
		AccNo=sc.nextInt();
		
		System.out.println("Enter Pending Balance at beginning of month : ");
		PendingBalance=sc.nextInt();
		
		System.out.println("Enter total of item charged : ");
		ItemsCharged=sc.nextInt();
		
		System.out.println("Enter total all creadit applied in this month : ");
		CreditsApplied=sc.nextInt();
		
		System.out.println("Enter allowed credit limit : ");
		AllowedCredits=sc.nextInt();
		
		CalcBalance=(PendingBalance+ItemsCharged-CreditsApplied);
		System.out.println("New Balance : "+CalcBalance);
		if(CalcBalance<AllowedCredits)
		{
			System.out.println("Allowed Limit ...!!!");
		}
		else
		{
			System.out.println("Credit Limit Exceeded ...!!!");
		}	
	}
}
