package p8.tester;

import java.util.Scanner;

import p8.StringLength;

public class Program08 {

	public static void main(String[] args) {
		StringLength s= new StringLength();
		String str;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any String ");
		str=sc.next();
		try {
			s.checkLen(str);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//System.out.println(s);
		
		
	}

}
