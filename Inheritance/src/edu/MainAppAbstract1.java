package edu;

abstract class Shapee // Shape ob=new Shape(); //error
{
    int color;
       Shapee(){
      }
    // An abstract function
    abstract void draw(); //no body function
   void display(){
          System.out.println("Display method");
   }
}
 class Reactanglee extends Shapee{

	@Override
	void draw() {
		System.out.println("Draw Reactangle");
		
	}
	void m1() {
		System.out.println("method m1");
	}
        
}
public class MainAppAbstract1{
   public static void main(String args[]){
      Reactanglee rob=new Reactanglee();
          rob.draw();
           rob.display();
      // Shape sob=new Shape();  //error because abstract class cannot be instantiated
      Shapee sob=new Reactanglee();
        sob.display();
   }
}