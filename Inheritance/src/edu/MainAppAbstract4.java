package edu;

abstract class MyClass{
	private int a, b;
	MyClass(int i, int j){
		a=i;
		b=j;
	}
    void m1() {
    	System.out.println("m1 a="+a+" and b="+b);
    }
   void m2() {
	   System.out.println("m2");
    }
}

class Test extends MyClass{

	Test(int i, int j) {
		super(i, j); //calls super class
		// TODO Auto-generated constructor stub
	}
	
}
public class MainAppAbstract4 {

	public static void main(String[] args) {
		//if you dont want object to be created for the class
		//MyClass ob=new MyClass();
		 Test tob=new Test(9,7);
		 tob.m1();
		 tob.m2();
		 
	}

}