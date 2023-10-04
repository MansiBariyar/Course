package educc;

import java.util.Scanner;

class Prime{
	int num; //instance varaible
	
	void inputNum() { 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		num = sc.nextInt();
	}
	
	void checkPrime() {
	int c=0;
	   for(int i=1;i<=num;i++){
	          if(num%i==0){
	                 System.out.println(i);
	                 c++;
	          }

	  }
	if(c==2){
	        System.out.println(num+" is prime number ");
	}
	else{
	         System.out.println(num+" is not a prime number");
	}
  }
}


public class PrimeMain {

	public static void main(String[] args) {
		Prime1 primeObj=new Prime1();
		primeObj.inputNum();
		primeObj.checkPrime();

	}

	
}