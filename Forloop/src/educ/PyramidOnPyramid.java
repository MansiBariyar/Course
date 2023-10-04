package educ;

import java.util.Scanner;

public class PyramidOnPyramid {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int[] a=new int[3];
		 for(int i=0;i<3;i++) { 
			 a[i]=sc.nextInt();
			 } 
		   int count=1;
		   int b=0;
		    
		   for(int h=0; h<a.length;h++) {
			   int n=a[h];
		 	for (int i=1; i<=n; i++) { 
				
			for (int j=(n-i); j>=1; j--)  {    
			System.out.print(" ");
			     }      
			for (int j=1; j<=i; j++ ) { 
			System.out.print(i);  
			System.out.print(" ");
			count++; 
			  }     
			System.out.println(); 
			  
		}   
		 	  
	}
	}
}