package educc;
class Employee{
	//instance variable
	int eid;
	String ename;
	float esalary;
   //static String cname="Edubridge";
	static String cname;
	static {
		cname="Edubridge";
	}
	public Employee(int eid, String ename, float esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	
	} 
    
    void display() {
    	System.out.println("id="+eid);
    	System.out.println("ename="+ename);
    	System.out.println("esalary="+esalary);
    	System.out.println("companyname="+cname);
    }
	
	
}

public class VariableDemo {

	public static void main(String[] args) {
		Employee ob1=new Employee(1,"Kiran",7865);
		Employee ob2=new Employee(2,"Lavanya",17865);
		Employee ob3=new Employee(3,"Saptarishi",19865);
		ob1.display();
		ob2.display();
		ob3.display();

	}

	}




