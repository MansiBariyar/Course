//Description:
		//ArrayList is a resizable-array implementation of the List interface. Implements all optional list operations, and permits all elements, including null. In addition to implementing the List interface, this class provides methods to manipulate the size of the array that is used internally to store the list. (This class is roughly equivalent to Vector, except that it is unsynchronized.)


package educc;

import java.util.ArrayList;

public class App4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		         
		        ArrayList<String> al = new ArrayList<String>();
		        //add elements to the ArrayList
		        al.add("JAVA");
		        al.add("C++");
		        al.add("PERL");
		        al.add("PHP");
		        System.out.println(al);
		        //get elements by index
		        System.out.println("Element at index 1: "+al.get(1));
		        System.out.println("Does list contains JAVA? "+al.contains("JAVA"));
		        //add elements at a specific index
		        al.add(2,"PLAY");
		        System.out.println(al);
		        System.out.println("Is arraylist empty? "+al.isEmpty());
		        System.out.println("Index of PERL is "+al.indexOf("PERL"));
		        System.out.println("Size of the arraylist is: "+al.size());
		    }
		


	}


