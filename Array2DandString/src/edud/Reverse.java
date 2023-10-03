package edud;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str, revstr;
		revstr="";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int k = sc.nextInt();  //4564
		
		str = String.valueOf(k); //integer to string
		
		for(int i=str.length()-1;i>=0;i--) {   //hello  ->len=5
			char ch=str.charAt(i);
			//System.out.print(ch);
			revstr=revstr+ch;
		}
		
		System.out.println("Reversed number is="+Integer.valueOf(revstr));
		
		//to check for pallandrome
		if(str.equals(revstr)) {
			System.out.println("The given string is pallandrome");
		}
		else {
			System.out.println("The given string is not pallandrome");
		}


	}

}
