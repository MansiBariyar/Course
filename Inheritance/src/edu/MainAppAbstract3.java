package edu;

abstract class Shape1 // Shape ob=new Shape(); //error
{
    int color;
       Shape1(){
      }
    // An abstract function
    abstract void draw(); //no body function
    abstract void draw1();
   void display(){
          System.out.println("Display method");
   }
}
 abstract class Reactangle1 extends Shape1{

	@Override
	void draw() {
		System.out.println("Draw Reactangle");
	}
	void m1() {
		System.out.println("method m1");
	}
        
}
 
 class TestReact extends Reactangle1{

	@Override
	void draw1() {
		System.out.println("Draw1 Reactangle");
		
	}
	 
 }
public class MainAppAbstract3{
   public static void main(String args[]){
      //Reactangle rob=new Reactangle();
	   TestReact tob=new TestReact();
			   tob.draw();
	         tob.display();
	         tob.draw1();
      // Shape sob=new Shape();  //error because abstract class cannot be instantiated
     // Shape sob=new Reactangle();
       // sob.display();
   }
}