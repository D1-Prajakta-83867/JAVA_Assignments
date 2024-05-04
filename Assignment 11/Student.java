package p11;
import java.util.*;
import java.util.Scanner;

public class Student implements Comparable<Student> {

	int rollno;
	String name;
	double marks;
	String course;
	
	public Student()  {
		
	}

	public Student(int rollno, String name, double marks, String course) {
	
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.course = course;
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rollno");
		rollno=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter marks");
		marks=sc.nextDouble();
		System.out.println("Enter course");
		course=sc.next();
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", course=" + course + "]";
	}

	public int compareTo(Student o) {
		return this.rollno-o.rollno;
	}
//
//	public int compareTo1(Student o2) {
//		return String.compare(this.name,o2.name);
//

}

class StudentmarksComparator implements Comparator<Student>{
	
	@Override
	public int compare(Student o1, Student o2) {
		return Double.compare(o1.marks, o2.marks);
	}
}
class StudentnameComparator implements Comparator<Student>{
	
	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo( o2.name);
	}
}
class StudentcourseComparator implements Comparator<Student>{
	
	@Override
	public int compare(Student o1, Student o2) {
		return o1.course.compareTo( o2.course);
	}
}
	