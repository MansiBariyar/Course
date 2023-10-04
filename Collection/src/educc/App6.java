package educc;

//Program: How to copy or clone a ArrayList?

//Description:
//Here we can see example for creating duplicate object of an ArrayList instance. we can done this by using clone() function.

import java.util.ArrayList;
 
public class App6 {
 
    public static void main(String a[]){
        ArrayList<String> arrl = new ArrayList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual ArrayList:"+arrl);
        ArrayList<String> copy = (ArrayList<String>) arrl.clone();
        System.out.println("Cloned ArrayList:"+copy);
    }
}
