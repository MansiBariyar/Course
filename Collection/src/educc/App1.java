package educc;

import java.util.ArrayList;
import java.util.Iterator;

public class App1 {

	public static void main(String[] args) {
		//int a[]=new int[5]; //fixed size - 5 elements
		ArrayList<String> aob=new ArrayList<String>();
		 aob.add("Rashmi");
		 aob.add("Renuka");
		 aob.add("poovi");
		 aob.add("Kiran");
		 System.out.println(aob);
		 
//		for(int a:aob) {
//			System.out.println(a);
//		}
		
		Iterator<String> it=aob.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		aob.remove(1);
		System.out.println("after removing ");
		 System.out.println(aob);
	}

}