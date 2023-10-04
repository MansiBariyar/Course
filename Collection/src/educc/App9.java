package educc;
//Program: How to find does ArrayList contains all list elements or not?

//Description:
//Here we can see example for finding whether the instance of an ArrayList contains all objects of another Collection instance. Here we are checking with another List instance.

import java.util.ArrayList;
import java.util.List;
 
public class App9 {
 
    public static void main(String a[]){
        ArrayList<String> arrl = new ArrayList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        List<String> list = new ArrayList<String>();
        list.add("Second");
        list.add("Random");
        System.out.println("Does ArrayList contains all list elements?: "
                    +arrl.containsAll(list));
        list.add("one");
        System.out.println("Does ArrayList contains all list elements?: "
                    +arrl.containsAll(list));
    }
}


