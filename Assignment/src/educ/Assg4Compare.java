package educ;

import java.util.Scanner;

public class Assg4Compare
{
 void compare(int a, int b) {
        
        if (a > b) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
        
    }
    
    
    void compare(char a, char b) {
        int x = (int)a;
        int y = (int)b;
        
        if (x > y) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
        
    }
    
    void compare(String a, String b) {
        
        int l1 = a.length();
        int l2 = b.length();
        
        if (l1 > l2) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }

    }
    
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        Assg4Compare c= new Assg4Compare();
        
        System.out.print("Enter first integer: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = sc.nextInt();
        c.compare(n1, n2);
        
        System.out.print("Enter first char: ");
        char c1 = sc.next().charAt(0);
        System.out.print("Enter second char: ");
        char c2 = sc.next().charAt(0);
        sc.nextLine();
        c.compare(c1, c2);
        
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        c.compare(s1, s2);
    }
}
