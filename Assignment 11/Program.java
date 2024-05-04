package p11;
import java.util.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Program {

	public static int Menu(Scanner sc) {
		int choice;
		System.out.println("0.Exit.");
		System.out.println("1.Add Student.");
		System.out.println("2.display all students sorted on rollno ");
		System.out.println("3. display all students sorted on name");
		System.out.println("4. display all students sorted on marks in desc order");
		System.out.println("5. display all students sorted on course");
		System.out.println("\t Enter your choice : ");
		choice=sc.nextInt();	
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int choice;
		Student [] arr = new Student[3];
do {
	

		switch((choice = Menu(sc)))
		{ 
		
		case 0:
			System.out.println("Bbye");
			break;
			
		case 1:
			for(int i=0;i<10;i++) {
				arr[i]=new Student();
				arr[i].accept();
			}
			break;
		
		case 2:
			System.out.println("Before sorting :\n----------------- ");
			for(Student s1: arr)
				System.out.println(s1);
					
			Arrays.sort(arr);
				System.out.println("After sorting :\n----------------- ");
				for(Student s1: arr)
					System.out.println(s1);
				System.out.println("\n-----------------------------------");

			break;
		case 3:
			
			Arrays.sort(arr, new StudentnameComparator());
		
			System.out.println("After Sorting on name\n............................");
			for (Student student : arr)
				System.out.println(student);
			System.out.println("\n-----------------------------------");
			break;
			
		case 4:
			Arrays.sort(arr, new StudentmarksComparator());
			System.out.println("After Sorting on name\n............................");
			for (Student student : arr)
				System.out.println(student);
			System.out.println("\n-----------------------------------");
			break;
			
		case 5:
			Arrays.sort(arr, new StudentcourseComparator());
			System.out.println("After Sorting on name\n............................");
			for (Student student : arr)
				System.out.println(student);
			System.out.println("\n-----------------------------------");
			break;
		
		 default:
			 System.out.println("Wrong choice .\n");
			break;
		
		}
}while(choice!=0);
	} 
	}


