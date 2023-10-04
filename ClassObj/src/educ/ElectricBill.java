package educ;

import java.util.Scanner;

class ElectricB {
   
    String n; 
    int units; 
    double bill;
    //int price;
   
    void accept() {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer name");
        n = sc.nextLine();
        System.out.println("Enter no. of units");
        units = sc.nextInt();	    
    }

    void calculate() {
    	 //int price;
 		
	     if(units<=100)
	     {
	    	 bill=2*units;
	    	// System.out.println("current bill:"+bill);
	     }
	     
	     else if(units>100 && units<=300)
	     {
	    	 bill=2*100+3*(units-100);
	    	 //System.out.println("current bill:"+bill);
	     }
	     else if(units>300)
	     {
	    	 bill=2*100+3*200+4*(units-300);
	    	 bill +=bill*0.25;
	     }
	     else
	     {
	    	
	    	 System.out.println("invalid");
	     }

    }

    

    void print() {
        System.out.println("Name of the customer: " + n);
        System.out.println("Number of units consumed: " + units);
        System.out.println("Bill amount: " + bill);
    }
}
public class ElectricBill{
    public static void main(String[] args) {
        ElectricB e = new ElectricB();
        e.accept();
        e.calculate();
        e.print();
    }
}

