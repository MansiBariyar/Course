package edu;

class Parent3{ //Object
	int i;
	Parent3(){
		super(); //call Object class constructor i=0
		i=9; //
	}
}

class Child4 extends Parent3{
	int i;
	public Child4(){
	
		System.out.println("Child2 class constructor "+super.i);
		System.out.println("Child2 class constructor "+i);
	}
}


public class MainApp3 {

	public static void main(String[] args) {
		//Parent2 pob=new Parent2(); //Parernt2 constructor
		Child4 cob=new Child4();  //Parernt2 constructor  Child2 class constructor

	}
}