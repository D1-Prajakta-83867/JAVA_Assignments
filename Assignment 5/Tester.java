package com.app.fruits;

import java.util.Scanner;
	
class Fruit{
		private String color;
		private double weight;
		private String name;
		private boolean isFresh;
		
		public Fruit() {
			
		}
		public Fruit(String name, double weight, String color, boolean isFresh) {
			
			this.color = color;
			this.weight = weight;
			this.name = name;
			this.isFresh = isFresh;
		}
		public String taste()
		{
			return "\n No specific taste.";	
		}
		
		public String toString()
		{
			return ("\n Name:  "+name+"  Color: "+color+"  Weigth:  "+weight);
		}
	
//		public double getWeight() {
//			return weight;
//		}
//		public void setWeight(double weight) {
//			this.weight = weight;
//		}
		public void setName(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		public boolean isFresh() {
			return isFresh;
		}
		
		
		public void setFresh(boolean isFresh) {
			this.isFresh = isFresh;
		}
		public boolean getFresh() {
			return isFresh;
		}
		
		
	 }
	 class Mango extends Fruit {
		 public Mango(String color, double weight, String name, boolean isFresh) {
				super(color,weight,name,isFresh);
				}
		 
		 public String taste()
			{
				return "\n sweet.";
				
			}
		}
	 
	 class Orange extends Fruit{
		 public Orange(String color, double weight, String name, boolean isFresh) 
				{
					super(color,weight,name,isFresh);
				}	
		 
		 public String taste()
			{
				return "\n sour.";
				
			}
		}
	 
	 class Apple extends Fruit{
		 public Apple(String color, double weight, String name, boolean isFresh) 
			{
			 super(color,weight,name,isFresh);
			}	
		 
		 public String taste()
			{
				return "\n sweet and sour.";	
			}
	 }
	 
	public class Tester {
	public static void main(String[] args) {
		int ch;
		int sizeb , counter=0;
		Scanner sc =new Scanner(System.in);

		System.out.println("\n Enter size of basket : ");
		sizeb=sc.nextInt();
		Fruit []basket= new Fruit[sizeb];
		do {
			System.out.println("\n   0. Exit.\n"
					+ "   1. Add Mango \n   2. Add Orange \n   3. Add Apple \n   4. Display names of all fruits in the basket."
					+"  \n   5. Display name,color, weight, taste of all fresh fruits in the basket. "
					+ "\n   6. Mark a fruit as stale.\n   7. Display tastes of all stale fruits in the basket."
					+ "\n   8. Mark all sour fruits stale\n"
					+ "\n  Enter your choice. ");
				ch=sc.nextInt();	
			switch(ch)
			{
			case 0:
				System.out.println("Thank you ...!!!");
				break;
			case 1:
				System.out.println("Add Mango");
					if(counter<basket.length)
					{
						System.out.println("Enter name: ");
						String name = sc.next();
						
						System.out.println("Enter weight: ");
						double weight = sc.nextDouble();
						
						System.out.println("Enter color: ");
						String color = sc.next();
						
						System.out.println("is Fresh (true/false): ");
						boolean isFresh = sc.nextBoolean();
						
						basket[counter++]= new Mango(name,weight,color,isFresh);
					}
				break;
					
			case 2:
				System.out.println("Add Orange");

				if(counter<basket.length)
				{
					System.out.println("Enter name: ");
					String name = sc.next();
					
					System.out.println("Enter weight: ");
					double weight = sc.nextDouble();
					
					System.out.println("Enter color: ");
					String color = sc.next();
					
					System.out.println("is Fresh (true/false): ");
					boolean isFresh = sc.nextBoolean();
					
					basket[counter++]= new Orange(name,weight,color,isFresh);
				}
				break;
				
			case 3:
				System.out.println("Add Apple");

				if(counter<basket.length)
				{
					System.out.println("Enter name: ");
					String name = sc.next();
					
					System.out.println("Enter weight: ");
					double weight = sc.nextDouble();
					
					System.out.println("Enter color: ");
					String color = sc.next();
					
					System.out.println("is Fresh (true/false) : ");
					boolean isFresh = sc.nextBoolean();
					
					basket[counter++]= new  Apple(name,weight,color,isFresh);
				}
				break;
				
			case 4:
				
				for(Fruit fruits:basket)
				{
					if(fruits!=null)
					System.out.println(fruits.getName());
				}
				break;
				
			
			case 5:
				for(Fruit fruits:basket)
				{
					if(basket!=null)
						
					System.out.println(fruits.toString()+" Taste: "+fruits.taste());
				}
				break;
				
			case 6:
				System.out.print("Enter Index to mark a fruit as a stale: ");
				int index=sc.nextInt();
				if(index>=0 && index<basket.length) {
					if(basket[index]!=null)
					basket[index].setFresh(false);
				}
				else {
					System.out.println("Invalid index..");
				}
				
				break;
			case 7:
				for(Fruit fruits:basket)
				{
					 if(fruits!=null && fruits.getFresh()==false )
					 	 System.out.println("taste of stale fruit is:"+fruits.taste());
				 }
				 break;
				
			case 8:
				for(Fruit fruits:basket)
				{
					 if(fruits!=null && fruits.taste().equals("sour"))
						 fruits.setFresh(false);
				 }
				 break;
				
			default:
				System.out.println(" Wrong choice .");
				break;
			}
				
		}while(ch !=0);
	}

}
