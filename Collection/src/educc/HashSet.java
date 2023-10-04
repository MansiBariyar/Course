package educc;

//HashSet does not maintains order.

import java.util.HashSet;

public class HashSet 
{
public static void main(String[] args) {
HashSet<Integer> hob = new HashSet<Integer>();

hob.add(null);
hob.add(1);
hob.add(2);
hob.add(3);
hob.add(4);
hob.add(5);
//hob.add(5); It is not allow the duplicate values
//hob.add(null); Single null value are allowed.

System.out.print(hob  + " ");

}
}