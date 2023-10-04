package educc;

class Student1{
	String s;
	
	Student1(){
		System.out.println("no argument constructor");
	}
	
	Student1(String s){
		this(); //first line
	   this.s=s;
		System.out.println("one arg constructor");
		
	}
	
	void display() {
		System.out.println("Name="+s);
	}
}

public class MainApp1 {

	public static void main(String[] args) {
		
		
		Student1 obj1=new Student1("Kiran");
		
		obj1.display();
	}

}