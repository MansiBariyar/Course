package eddc;

import java.util.Scanner;

public class MainArray {

	public static void main(String[] args) {
		//int a[]=new int[5];
		int a[],size;
		/*a[0]=5;
		a[1]=6;
		a[2]=8;
		a[3]=9;
		a[4]=10;*/
	//	System.out.println("fine");
		//a[5]=12; //Exception
		
		
		//User input 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array");
		size=sc.nextInt();
		a=new int[size];
		System.out.println("Enter the array elements");
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Array elements");
		
		//System.out.println(a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]);
		
		for(int i=0;i<a.length;i++) { //0 to 4
		//for(int i=a.length-1;i>=0;i--) { //last to first
			System.out.print(a[i]+ " ");
		}
     }
}