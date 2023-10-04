package edu;

class Parent5{ //Object
	int i;
	Parent5(){
		super(); //call Object class constructor i=0
		i=9; //
	}
	 void display() {
		System.out.println("Parent display()");
	}
	//function overriding : function name , return type and argument list must match
   //Overriding funtcion :accesspecifiers : lower to higher access specier
	//public(every where)->protected(within package it is behaves public
	 //outside package only inherited class can access
	 //->default(within package)
	 //->private->with in class
	 
	 //when we make class final it cannot be extends
}

class Child5 extends Parent5{
	int i;
	public Child5(){
	
		System.out.println("Child2 class constructor "+super.i);
		System.out.println("Child2 class constructor "+i);
	}
	protected void display() {
		System.out.println("child display()");
		
	}
	
}


public class MainApp4{

	public static void main(String[] args) {
		//Parent2 pob=new Parent2(); //Parernt2 constructor
		Child5 cob=new Child5();  //Parernt2 constructor  Child2 class constructor
          // cob.display();
	}
}