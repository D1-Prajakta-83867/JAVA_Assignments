import java.util.Scanner;

public class Que2 {
		
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
	    String s=sc.nextLine();
		
		StringBuffer Qrigstring=new StringBuffer(s);
		
		Qrigstring.reverse();
		
		String Qrigstring2=Qrigstring.toString();

		if(s.equals(Qrigstring2))
		{
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}
	}
}
