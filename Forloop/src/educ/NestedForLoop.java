package educ;

public class NestedForLoop {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) //i=1  i=2
		{
			for(int j=1;j<=3;j++) {  //3
				System.out.println("i="+i +" and j="+j);
			}
		}
	}

}