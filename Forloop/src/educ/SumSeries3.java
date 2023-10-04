package educ;

//using for loop//1/1!+2/2!+3/3!+4/4!+5/5!  find the sum of this series


public class SumSeries3 {

	public static void main(String[] args) {
	    int n=5;
	    double sum=0;
	    for(int i=1;i<=5;i++) {
	    	int fact=1;
	    	for(int j=1;j<=i;j++) {
	    		fact = fact * j;
	    	}
	    	sum=sum+((double)i/fact);
	    }
	    System.out.println("sum="+sum);

	}

}