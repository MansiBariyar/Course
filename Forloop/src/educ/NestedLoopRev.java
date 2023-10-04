package educ;

public class NestedLoopRev {

	public static void main(String[] args) {
		
		for(int i=4;i>=1;i--) //i=1  i=2
		{
			for(int j=4;j>=1;j--) {  //3
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}