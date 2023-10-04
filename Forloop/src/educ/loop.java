// 12/06/22
//sum of 1/2+1/4+1/6+---------1/20

package educ;


public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int n=10;
		float s = 0;
	      for (int i = 1; i <= n; i++)
	          s = s + ((float)1/(i*2));
System.out.println(s);
	}

}


