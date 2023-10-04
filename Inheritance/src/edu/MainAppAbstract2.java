package edu;

abstract class Shap // Shape ob=new Shape(); //error
{
    int color;
       Shap(){
      }
    // An abstract function
    abstract void draw(); //no body function
   void display(){
          System.out.println("Display method");
   }
}
 class React extends Shap{

	@Override
	void draw() {
		System.out.println("Draw Reactangle");
		
	}
	void m1() {
		System.out.println("method m1");
	}
        
}
public class MainAppAbstract2{
   public static void main(String args[]){
      React rob=new React();
          rob.draw();
           rob.display();
      // Shape sob=new Shape();  //error because abstract class cannot be instantiated
      Shap sob=new React();
        sob.display();
   }
}