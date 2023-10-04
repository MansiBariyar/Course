package educ;

import java.util.Scanner;

class Student5{
	 int studentid;
	 String studentname;
	 boolean studentreg;

	void inputStudent(){
	    Scanner scanner  = new Scanner(System.in);
	    System.out.println("Enter name");
	    studentname = scanner.nextLine();
	   
	    System.out.println("Enter id");
	    studentid = scanner.nextInt();

	}
	void displayStudent(){
	     System.out.println("Student name="+studentname);
	      System.out.println("Student Id="+studentid);
	}
	 
	}

public class AppStudent1 {

	public static void main(String[] args) {
		int age;
		System.out.println("Main method");
		//create an object
		Student5 student = new Student5();
		System.out.println("studentname="+student.studentname);
		System.out.println("Studentid="+student.studentid);
		System.out.println("student registered "+student.studentreg);
		
		student.inputStudent();
		student.displayStudent();
		//System.out.println("age="+age); //error local variables are not initialized

	}

}


