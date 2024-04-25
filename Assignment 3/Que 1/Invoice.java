package p1;

import java.util.Scanner;

public class Invoice {
	
	public Invoice(String pnumber, String pdesc, int quantity, double price) {
		//super();
		this.pnumber = pnumber;
		this.pdesc = pdesc;
		this.quantity = quantity;
		this.price = price;
	}

	private String pnumber ;
	public String getPnumber() {
		return pnumber;
	}

	public void setPnumber(String pnumber) {
		this.pnumber = pnumber;
	}

	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}

	public int getquantity() {
		return quantity;
	}

	public void setItem(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	private String pdesc ;
	private int quantity;
	private double price;
	 
	 
	public void accept() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter part number : ");
		pnumber=sc.nextLine();
		
		System.out.println("Enter part description : ");
		pdesc=sc.nextLine();
		
		System.out.println("Enter quantity of item : ");
		quantity=sc.nextInt();
		if(quantity<0){
			quantity=0;
		}
		
		
		System.out.println("Enter price per item : ");
		price=sc.nextDouble();
		if(price<0){
			price=0.0;
		}
		
		
		
	}
	public void display()
	{
		System.out.println(" part number : "+pnumber);
		System.out.println(" part desc : "+pdesc);
		System.out.println(" purchased  : "+quantity);
		System.out.println(" price per item : "+price);
	}
	

//	public Invoice() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
}
