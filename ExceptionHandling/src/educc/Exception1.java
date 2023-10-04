package educc;

public class Exception1 {

	public static void main(String[] args) {
		int i=10;
		System.out.println("hello");
		try {
          int d=i/0;
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("End ");
	}

}