package educc;

//Program: How to add all elements of a list to ArrayList?

//Description:
//Here we can see example for copying another collection instance objects to existing ArrayList.

import java.util.ArrayList;
import java.util.List;
 
public class App7 {
 
    public static void main(String a[]){
        ArrayList<String> arrl = new ArrayList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual ArrayList:"+arrl);
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        arrl.addAll(list);
        System.out.println("After Copy: "+arrl);
    }
}
