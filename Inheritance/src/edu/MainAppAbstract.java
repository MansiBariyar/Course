package edu;

 abstract class Shape // Shape ob=new Shape(); //error
{
    int color;
       Shape(){
      }
    // An abstract function
    abstract void draw(); //no body function
   void display(){
          System.out.println("Display method");
   }
}

 class Reactangle extends Shape{
         void draw(){ 
                 System.out.println("Reactangle Drawing");
         }
}
 class Circle extends Shape{
     void draw(){ 
             System.out.println(" Drawing");
     }
}
public class MainAppAbstract{
   public static void main(String args[]){
      Reactangle rob=new Reactangle();
      Circle c=new Circle();
          rob.draw();
           rob.display();
           c.draw();
        //Shape sob=new Shape();  //error because abstract class cannot be instantiated
   }
}