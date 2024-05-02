package p1;

public class Student implements Comparable<Student>{
	
	int rollno;
	String name ;
	double marks;
	
	public Student() {
	}

	public Student(int rollno, String name, double marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	public int compareTo(Student o)
	{
		return Double.compare(o.marks,this.marks );
	}
}
