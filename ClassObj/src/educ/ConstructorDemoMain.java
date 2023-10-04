package educ;
class Product{
	int productid;
	String productname;
	
	//constructor with no-argument
	public Product(){ //name of the constructor should be same name as class
		                    //no return type
		                     //On object creation constructor is called
		                     //used to initialize the instantnce variable of a class
	
		
		productid=100;
		productname ="TV";
		System.out.println("product id="+productid);
		System.out.println("Product name="+productname);
		
		
	}
	
	void methodProudct() {
		System.out.println("MethodProduct");
	}
}

public class ConstructorDemoMain {
     
	
	public static void main(String[] args) {
		
		Product product =new Product(); //calls constructor
		product.methodProudct(); //call member methods
	}

}


