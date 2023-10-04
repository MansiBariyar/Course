package edu;

class Parent1{
	 int i, j;  
	   Parent1(){
	        i=12;
	        j=34;
	  }
	  void parentDisplay(){
	        System.out.println("parentDisplay "+(i+j));
	}
	}

	class Child1 extends Parent1{
	  int s;
	   void ChildMethod(){
//	          Parent pob=new Parent(); // has a relatioship
//	             s=pob.i+pob.j;// in a relationship
	  	         s=i+j;
	              System.out.println("sum="+s);
	      } 
	}
	public class MainApp1{
	 public static void main(String args[]){
	  Child1  cob=new Child1();
	      cob.ChildMethod();
	}
	}
