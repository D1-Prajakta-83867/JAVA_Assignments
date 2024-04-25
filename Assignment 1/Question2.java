import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		
		int ch,d=0,s=0,i=0,total=0, qty=0;
		
		do {
			System.out.println("\n 1.Dosa\n 2.Samosa \n 3.Idli \n4. Generate Bill  \n \t Enter your choice :  ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 0: 
				System.out.println("\nThank you.! Visit again.\n");
			case 1:
				System.out.println("\nPlease Enter quantity ");
				qty=sc.nextInt();
				d=50;
				total+=qty*d; 
				break;
			case 2:
				
				System.out.println("\nPlease Enter quantity ");
				qty=sc.nextInt();
				s=15;
				total+=qty*s;
				break;
			case 3:
				System.out.println("\nPlease Enter quantity ");
				qty=sc.nextInt();
				i=30;
				total+=qty*i;
				break;
			case 4:
			
//			total=d+s+i;
			System.out.println("\nTotal Bill :  "+total);
			break;
			}
		}
		while(ch!=0);
	}

	
}
