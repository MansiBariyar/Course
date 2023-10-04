package educc;

import java.util.Scanner;
class Prime1{
	int num;
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

public void generatePrimeOneToHundred() {
int c;
System.out.println("Prime numbers from 1 to 100 are ");
for(int num=1;num<=100;num++) {  //1 2 3 4 5 6 7 8 9 ..............100
	c=0;
	for(int i=1;i<=num;i++) { //
		if(num%i==0) {
			c++;
		}
	}
	if(c==2) {
		System.out.print(num+" ");
	}

}
System.out.println();

}

	// TODO Auto-generated method stub
	public void generatePrimeBetweenTwoRange()
	 {
		Scanner sc=new Scanner(System.in);
	  System.out.print("Enter first range: ");
	  int firstnum = sc.nextInt();
	  System.out.print("Enter last range: ");
	  int lastnum=sc.nextInt();
	  int count;
	  for(int num=firstnum;num<=lastnum;num++) {  
	   count=0;
	   for(int i=1;i<=num;i++) { 
	    if(num%i==0) {
	     count++;
	    }
	   }
	   if(count==2) {
	    System.out.print(num+" ");
	   }
	  }
	 }
}




public class PrimeMain1 {

public static void main(String[] args) {
Prime1 primeObj=new Prime1();
primeObj.inputNum();
	primeObj.checkPrime();
primeObj.generatePrimeOneToHundred();
primeObj.generatePrimeBetweenTwoRange();

}


}
