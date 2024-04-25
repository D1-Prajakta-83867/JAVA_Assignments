package p1;

public class TestInvoice {

	public static void main(String[] args) {

		 Invoice t1;
		 t1=new Invoice("abc","pqr",50,50.50);
		 t1.display();
		 
		 t1.setPnumber("part1");
		 t1.setPdesc("desc: it is part of device .");
		 t1.setItem(300);
		 t1.setPrice(3000.50);
		
		 t1.getPnumber();
		 t1.getdesc();
		 t1.getItem();
		 t1.getPrice();
		 
		 t1.accept() ;
		 t1.display();
	}
	

}
