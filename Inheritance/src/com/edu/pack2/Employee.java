package com.edu.pack2;

public class Employee {
	  private  String ename;
	  public  float salary;
	   protected int age;
	  
	    public Employee(){
	    	 ename ="Mani";
	    	 salary=98761;
	    	 age=23;
	    	
	     }
	    private void meth1() {
	    	System.out.println("private method");
	    }
	    public void empDisplay() {
	    	 System.out.println("Employee name="+ename);
	    	 System.out.println("Employee salary="+salary);
	    	 meth1();
	     }
	}
