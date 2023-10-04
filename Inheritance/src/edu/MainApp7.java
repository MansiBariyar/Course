package edu;

class Parent10{
    Parent10(){
           System.out.print("parent1");
    }
}
class Child10 extends Parent10{
  Child10(){
           System.out.print("child 1");
    }
}
class Child20 extends Parent10{
    Child20(){
           System.out.print("child 2");
    }
}

class Child30 extends Child20{
            Child30 (){
            System.out.print("child 3");
          }
}

public class MainApp7{
       public static void main(String args[]){
              Child30 ob=new Child30 ();   
      }
}