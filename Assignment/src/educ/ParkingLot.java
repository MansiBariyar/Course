package educ;

import java.util.Scanner;

public class ParkingLot
{
    private int vno;
    private int hours;
    private double bill;
    
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter vehicle no.: ");
        vno = in.nextInt();
        System.out.print("Enter hours: ");
        hours = in.nextInt();
    }
    
    public void calculate() {
        if (hours <= 1)
            bill = 3;
        else
            bill = 3 + (hours - 1) * 1.5;
    }
    
    public void display() {
        System.out.println("Vehicle number: " + vno);
        System.out.println("Hours: " + hours);
        System.out.println("Bill: " + bill);
    }
    
    public static void main(String args[]) {
        ParkingLot p = new ParkingLot();
        p.input();
        p.calculate();
        p.display();
    }
}