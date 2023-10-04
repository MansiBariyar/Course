package educc;
public class DiffBlock {
	int i; //instance variable
	static String cname; //class variable
	static{
		System.out.println("static block is called before main method");
		System.out.println("used to initialize static variable of a class");
	    cname="Edubridge";
	}
		
	{
		System.out.println("Annonymous Block1, execute before constructor, on object creation");
	}
	
	DiffBlock(){
		//intitializing the instatince variable of class
		System.out.println("contructor "+i);
		System.out.println("Company name "+cname);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main");
		DiffBlock ob=new DiffBlock();

	}

}

