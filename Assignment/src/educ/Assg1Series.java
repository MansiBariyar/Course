package educ;

class Overloading {
	
	    void series(int x, int n) {
	        long sum = 0;
	        for (int i = 1; i <= n; i++) {
	            sum += Math.pow(x, i);
	        }
	        System.out.println("Sum = " + sum);
	    }

	    void series(int p) {
	        for (int i = 1; i <= p; i++) {
	            int term = (int)(Math.pow(i, 3) - 1);
	            System.out.print(term + " ");
	        }
	        System.out.println();
	    }

	    void series() {
	        double sum = 0.0;
	        for (int i = 2; i <= 10; i++) {
	            sum=sum+ 1.0 / i;
	        }
	        System.out.println("Sum = " + sum);
	    }
	}
public class Assg1Series
{
	public static void main(String[] args)
	{
		Overloading o=new Overloading();
		o.series(2,3);
		o.series(10);
		o.series();
		
	}
}


