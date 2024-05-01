package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {
	
	public static void main(String [] args) {	
	int choice;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter how many points u want to enter:");
	Point2D [] points= new Point2D [sc.nextInt()];
	
	for(int i=0;i<points.length;i++) {
		
		System.out.print("Enter x co-ordinate:");
		int x=sc.nextInt();
		System.out.print("Enter y co-ordinate:");
		int y=sc.nextInt();
		
		points[i]=new Point2D(x,y);		
	}
	
do {
	System.out.println("\n1.Display details of specific point\n2.Display x and y co-ordinates of all points\n3.Display distance between if they are not located at same position\n4.Exit " );
	
	choice=sc.nextInt();
	
	switch(choice) {
	
	case 1:
		System.out.print("Enter index of point whose x and y coordinate u wanna know:");
		int index=sc.nextInt();
		 if(index>=0 && index<points.length) {
		 	System.out.println(points[index].getDetails());
		 }
		 else {
			  System.out.println("Invalid index");
		 }
		
		break;
		
	case 2:
		 
		  System.out.println("Display All points:");
		  if(points!=null) {
		  for(Point2D point: points) {
			  System.out.println(point.getDetails());
		  }
		  }
		
		  break;
		  
		  
	case 3:
		 System.out.print("Enter index of start point and end point:");
		 int index1=sc.nextInt();
		 int index2=sc.nextInt();
		 
		 
		 if(index1 >=0 && index1<points.length && index2>=0 && index2<points.length ) {
			 
			 if(points[index1].isEqual(points[index2])) 
				 	System.out.println("Both points are located at same position");
			 
		     else 
					System.out.println("Distance between 2 points is:"+points[index1].calculateDistance(points[index2]));
				  
			 }
		
	       else
	    	   	System.out.println("Invalid index"); 
		 
		 
		break;
	
	case 4:
		System.out.println("Exit.........");
		break;
	}
	
}while(choice!=4);

}
	
	
}

	

	  
	
	
	


    
	
