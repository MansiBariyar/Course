	package eddc;
    import java.util.Scanner;
	
	class Arrr { 
		  int sum=0;
		  int max=0;
		  int min=0;
		  int  a[]; 
			  Scanner sc= new Scanner(System.in);
			   void input() 
			   {  
			   System.out.println("enter size of array");
			   int n=sc.nextInt();
			   a=new int[n];
			   System.out.println("enter"+ n +" array elements");
			   for(int i=0;i<a.length;i++) 
			   {
				  a[i]=sc.nextInt();
			  }
			  
	  }
		     void display()
		     {
		  	 for(int i=0;i<a.length;i++)
		  	 {
		  		 System.out.println(a[i]);
		  		  
		  	 }
		   }
	   void sum() 
	   {
	  	 for(int i=0;i<a.length;i++) 
	  	 {
	  		 sum=sum+a[i];
	     }
	  		 System.out.println("sum of elements is"+sum);
	  	 
	   }
	   void average() {
		  	   float avg=(float)sum/5;
		  	 System.out.println("average of elements is"+avg);
		   }
		   void largest() 
		   {
		  	 max=a[0];
		  	 for(int i=1;i<a.length;i++) {
		  		 if(a[i]>max) max=a[i];
		  		 }
		  		 System.out.println("Greatest element is"+max);
		  	  
	   }
	   void smallest() {
	  	 min=a[0];
	  	 for(int i=1;i<a.length;i++) {
	  		 if(a[i]< min) min=a[i];
	  		 }
	  		 System.out.println("least element is"+min); 
	   }
	  
	   void linearSearch1() {
		   int search,pos=-1;
		   System.out.println("enter element to search");
		   search=sc.nextInt();
		    
		   for(int i=0;i<a.length;i++)
		   {
			   if(a[i]==search)
			   {
				   pos=i;
				   break;
			   }
		   }
		   if(pos>=0)
		   {
			   System.out.println("successful search");
			   System.out.println(search+"found at position "+(pos+1));
		   }
		   else {
			   System.out.println("unsuccessful search");
			   System.out.println(search+"element not found");
		   }
	   }
	   
	}
	
	public class Arr {
	
		public static void main(String[] args) {
			 Arrr o1=new Arrr();
			 o1.input();
	       o1.display();
	       o1.sum();
	       o1.average();
	       o1.largest();
	       o1. smallest();
	     
	       o1.linearSearch1();
		}
	
	}
	
	
