package com.edu.pack1;

import com.edu.pack2.Employee;
class HR extends Employee{
	void accessData() {
		System.out.println("age="+age); //protected
		//System.out.println("ename="+ename); //privatr cannot be accessed
	    System.out.println("Salary="+salary); //public
	}
	
}

class HR1 {
	void accessData() {
		Employee eob1=new Employee(); //
	//	System.out.println("age="+eob1.age); //protected can be accessed only child class
		//System.out.println("ename="+ename); //privatr cannot be accessed
	    System.out.println("Salary="+eob1.salary); //public
	}
	
}
public class MainPack1 {

	public static void main(String[] args) {
		Student ob=new Student();
		ob.display();
		
		Employee eob=new Employee();
		eob.empDisplay(); 
		
		HR hob=new HR();
		hob.accessData();
		

	}

}

