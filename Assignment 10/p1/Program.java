package p1;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {

		
		Student[] arr = {
				new Student(4,"Anil",60.45),
				new Student(2,"Mukesh",30.67),
				new Student(5, "Sham",50.90),
				new Student(1,"Nikhil", 90.89),
				new Student(3, "Akash",70.76) 
				};
		
		System.out.println("Before sorting :\n-----------------------------\n");
		for(Student student : arr)
		System.out.println(student);
		
		Arrays.sort(arr);
		
		System.out.println("\nAfter sorting :\n-----------------------------\n");
		for(Student student: arr)
		System.out.println(student);
		
		//Comparable<Student> c1 = new Student(); // upcasting?

	}

}
