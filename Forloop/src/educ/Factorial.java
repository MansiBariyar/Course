package educ;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		double s = 0, fact = 1;
        for (int i = 1; i <= num; i++)
        {
            fact = fact * i;
  
            s= s+ (i / fact);
	}
        System.out.println(s);

}
}









