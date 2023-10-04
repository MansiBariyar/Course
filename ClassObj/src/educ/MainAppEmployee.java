package educ;

import java.util.Scanner;


import java.util.Scanner;
class Employee{
	 int empid; 
	 String empname;
	 int empage;
	 double empsalary;

	void inputEmployeeData(){
	    Scanner scanner  = new Scanner(System.in);
	    System.out.println("Enter employee name");
	    empname = scanner.nextLine();
	    System.out.println("Enter employee id");
	    empid = scanner.nextInt();	    
	    System.out.println("Enter employee age");
	    empage = scanner.nextInt();
	    System.out.println("Enter employee salary");
	    empsalary = scanner.nextInt();
	}
	void displayEmployeeData(){
	     System.out.println("Employee name = "+empname);
	      System.out.println("Employee Id = "+empid);
	      System.out.println("Employee age = "+empage);
	      System.out.println("Employee salary = "+empsalary);
	}
	}
public class MainAppEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.inputEmployeeData();
		emp.displayEmployeeData();
	}
}