package edud;

import java.util.Scanner;

class Arr{
	int i,j;
	int a[][]=new int[3][3];
	

void input() {
	Scanner s=new Scanner(System.in);
	System.out.println("enter element:");
	for(int i=0;i<a.length;i++)
	{
		for(j=0;j<a.length;j++)
		{
			a[i][j]=s.nextInt();
		}
	}
}
void display()
{
	System.out.println("elements are:");
	for(int i=0;i<a.length;i++)
	{
		for(j=0;j<a.length;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
}
void diagonalElement() {
	int sum=0;
	System.out.println("Daigonal elements:");
	for(int i=0;i<a.length;i++)
	{
		for(j=0;j<a.length;j++)
		{
			if(i==j) {
			
				System.out.print(a[i][j]+" ");
				sum=sum+a[i][j];
			
		}
	}
	}
	System.out.println();
			System.out.print("sum="+sum);
		}
}

	
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arr a=new Arr();
		a.input();
		a.display();
		a.diagonalElement();
		

	}

}
