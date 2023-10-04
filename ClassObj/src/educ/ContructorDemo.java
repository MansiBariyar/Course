package educ;
class Product1{
	int productid;
	String productname;
	
	//constructor with no-argument
	public Product1(){ //name of the constructor should be same name as class
		                    //no return type
		                     //On object creation constructor is called
		                     //used to initialize the instantnce variable of a class
	
		
		productid=0;
		productname ="";
		System.out.println("product id="+productid);
		System.out.println("Product name="+productname);
		
		
	}
	
	public Product1(int i, String n) { //constructor with argument
		productid=i;
		productname=n;
	}
			
	void methodProudct() {
		System.out.println("MethodProduct");
		System.out.println("product id="+productid);
		System.out.println("Product name="+productname);
		
	}
}

public class ContructorDemo {
     
	public static void main(String[] args) {
		
//		Product product =new Product(); //calls constructor
//		product.methodProudct(); //call member methods
		Product1 product1 =new Product1(34,"Laptop");
		Product1 product2 =new Product1(35,"Refrigirator");
		
		product1.methodProudct();
		product2.methodProudct();
	}

}

