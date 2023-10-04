package educ;

import java.util.Scanner;

public class Assg2SpyNum
{
	public static void main(String[] args)
	{
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number= ");
        int n = sc.nextInt();
        
        int digit, sum=0, prod=1;
        int orgNum=n;
        
            while (n > 0) {
            digit = n % 10;
            
            sum=sum+digit;
            prod=prod*digit;
            n=n/10;
        }
        
        if (sum == prod)
            System.out.println(orgNum + " is Spy Num");
        else
            System.out.println(orgNum + " is not Spy Num");
        
    }
	
}
