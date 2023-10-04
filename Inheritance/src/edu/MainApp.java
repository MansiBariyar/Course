package edu;
//default access specifier, scope is within package
//private data cannot be accessed from out side the class

class Parent{
    int i, j;
    Parent(){
          i=12;
          j=34;
    }
    void parentDisplay(){
          System.out.println("parentDisplay");
  }
}

class Child {
    int s;
     void ChildMethod(){
               Parent pob=new Parent();
                s=pob.i+pob.j;  //is-a relationship
                System.out.println("sum="+s);
        } 
}
public class MainApp{
   public static void main(String args[]){
    Child  cob=new Child();
        cob.ChildMethod();
}
}