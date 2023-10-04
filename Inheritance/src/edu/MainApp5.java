package edu;

class Parent6{ //Object
	 int i;
	Parent6(){
		//super(); //call Object class constructor i=0
		i=9; //
		System.out.println("Parent");
	
		
	}
void display() { //if the function is final you cannot override
		System.out.println("Parent display() ");
	}
	//function overriding : function name , return type and argument list must match
  //Overriding funtcion :accesspecifiers : lower to higher access specier
	//public(every where)->protected(within package it is behaves public
	 //outside package only inherited class can access
	 //->default(within package)
	 //->private->with in class
}

class Child6 extends Parent6{  //stop the inheritance level
	                                  //No more child class
	int i;
	public Child6(){
	
		System.out.println("Child2 class constructor "+super.i);
		System.out.println("Child2 class constructor "+i);
	}
 void display() {
	 //super.display();
	System.out.println("child display()");
}
	  
	  void add() {
		  System.out.println("add method");
	  }
	
}
//class Child3 extends Child2{ //error because Child2 is final class
	
//}


public class MainApp5 {

	public static void main(String[] args) {
		//Parent2 pob=new Parent2(); //Parernt2 constructor
		Child6 cob=new Child6();  //Parernt2 constructor  Child2 class constructor
         cob.display();
         cob.add();
         
         Parent6 pob = new Child6();
         pob.display();
         
      }
}