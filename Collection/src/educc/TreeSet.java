package educc;

//ascending order
//no duplicates
//null is not allowed, 
//throws NullPointerException



import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet {

	public static void main(String[] args) {
		Set<Integer> tob=new TreeSet<Integer>(Comparator.reverseOrder());
		tob.add(89);
		
		tob.add(45);
		tob.add(12);
		tob.add(8);
		tob.add(8);
		//tob.add(null);
		System.out.println(tob);
		Iterator<Integer> itob=tob.iterator();
		
		while(itob.hasNext()) {
			System.out.println(itob.next());
		}
		
	}

}