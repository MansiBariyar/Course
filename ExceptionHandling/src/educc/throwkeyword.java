package educc;

import java.util.Scanner;

public class throwkeyword {

	public static void main(String[] args) {
		int i=10,d;
		System.out.println("Before division");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int j=sc.nextInt();
		try {
			if(j==0) {
				throw new ArithmeticException("divide by error because denominator is zero");
			}
			else {
		       d=i/j;
		       System.out.println("result="+d);
			}
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("After Division");
	}

}