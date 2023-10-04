package educ;

import java.util.Scanner;

class MovieMagic
{
	int year;
	String title;
	float rating;

void movieMagic()
{
	
}
void accept()
{
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter year");
    year = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter title");
    title= sc.nextLine();	
    System.out.println("Enter rating");
    rating= sc.nextFloat();
  
}
void display()
{
	  System.out.println("title = "+title);
	if(rating>=0.0 && rating<=2.1)
    {
   	
   	System.out.println("Flop");
    }
    
    else if(rating>=2.1 && rating<=3.4)
    {
   	 
   	 System.out.println("Semi-hit");
    }
    else if(rating>=3.5 && rating<=4.5)
    {
   	 System.out.println("Hit");
    }
    else if(rating>=4.6 && rating<=5.0)
    {
   	 
   	 System.out.println("Super hit");
    }
   
    else
    {
   	
   	 System.out.println("invalid");
    }

}
}

public class MovieMagicApp {
	public static void main(String[] args) {
		MovieMagic s= new MovieMagic();
		s.movieMagic();
		s.accept();
		s.display();

}
}


