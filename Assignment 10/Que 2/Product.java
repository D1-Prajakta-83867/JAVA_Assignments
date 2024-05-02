package p2;
import java.util.Scanner;


public class Product implements Comparable<Product>{
	int id;
	String name;
	String category;
	double price;
	
	public Product() {
	
	}

	public Product(int id, String name, String category, double price) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}
	
	public void accept(Scanner sc)
	{
		System.out.println("Enter id : ");
		id = sc.nextInt();
		System.out.println("Enter name : ");
		name = sc.next();
		System.out.println("Enter category : ");
		category = sc.next();
		System.out.println("Enter price : ");
		price = sc.nextDouble();
	}
	
	public int compareTo(Product o)
	{
		//return Double.compare(o.price,this.price );
		return this.category.compareTo(o.category);
	}
	
	
}
