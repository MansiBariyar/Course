package edu;


	class Parent2{
		public Parent2(){
			System.out.println("Parernt2 constructor");
		}
	}


	class Child2 extends Parent2{
		public Child2(){
		
			System.out.println("Child2 class constructor");
		}
	}
	class Child3 extends Child2{
		public Child3(){
		
			System.out.println("Child3 class constructor");
		}
	}
	public class MainApp2 {

		public static void main(String[] args) {
			Parent2 pob=new Parent2(); //Parernt2 constructor
			Child2 cob=new Child2();  //Parernt2 constructor  Child2 class constructor

		}

	}
	


