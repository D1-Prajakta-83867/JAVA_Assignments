package p2;

import java.util.Arrays;
import java.util.Scanner;

public class Que2 {

	public static void main(String[] args) {
		//Product p= new Product();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter products \n");
		Product[] arr= new Product[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=new Product();
			System.out.println("-----------------------------------\nProduct : "+i+"\n");
			arr[i].accept(sc);
		}
		
		System.out.println("Before sorting --> ");
		for (Product product : arr)
			System.out.println(product);//by default it is employee.toString();
		
		Arrays.sort(arr);
		
		System.out.println("After sorting --> ");
		for (Product product : arr)
			System.out.println(product);
		
		//Comparable<Product> c1 = new Product();
	
	}

}
