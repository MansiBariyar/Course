package educ;

import java.util.Scanner;


class Employee{
	 int employeeid;
	 String employeename;
	 int employeeage;
	 double employeesalary;
	 

	void inputEmployeeData(){
	    Scanner sc  = new Scanner(System.in);
	   System.out.println("Enter id");
	    employeeid = sc.nextInt();
	    System.out.println("Enter name");
	    employeename = sc.nextLine();
	    System.out.println("Enter age");
	    employeeage = sc.nextInt();
	    System.out.println("Enter salary");
	    employeesalary = sc.nextDouble();
	   

	}
	void displayEmployeeData(){
	     
	      System.out.println("EmpId="+employeeid);
	      System.out.println("EmpName="+employeename);
	      System.out.println("EmpAge="+employeeage);
	      System.out.println("EmpSalary="+employeesalary);
	}
	 
	}

public class MainAppEmployee {

	public static void main(String[] args) {
	
		Employee emp = new Employee();
		
		System.out.println("empid="+emp.employeeid);
		System.out.println("empname="+emp.employeename);
		System.out.println("empage= "+emp.employeeage);
		System.out.println("empsalary="+emp.employeesalary);
		
		emp.inputEmployeeData();
		emp.displayEmployeeData();
		
	}

}


