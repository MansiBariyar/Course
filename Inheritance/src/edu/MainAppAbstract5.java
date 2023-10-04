package edu;

abstract class MyClass1{
	private int a, b;
	MyClass1(){
		System.out.println("Myclass");
	}
	MyClass1(int i, int j){
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

class Test1 extends MyClass1{

	Test1(int i, int j) {
		super(i, j); //calls super class
		// TODO Auto-generated constructor stub
	}
	Test1(){
		System.out.println("no arg constr");
	}
	
}
public class MainAppAbstract5 {

	public static void main(String[] args) {
		//if you dont want object to be created for the class
		//MyClass ob=new MyClass();
		 Test1 tob=new Test1(9,7);
		 tob.m1();
		 tob.m2();
		 Test1 ob=new Test1();
		 
	}

}