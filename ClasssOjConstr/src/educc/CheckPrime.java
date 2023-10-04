package educc;

class Prim{
	
	void checkPrime() {
		int count = 0;
		for(int i = 100; i >= 1; i--) {
			int c = 0;
			if(count == 3) {
				break;
			}
			for(int j = 1; j<= i;j++) {
				if(i%j == 0) {
					c++;
				}
			}
			if(c==2) {
				System.out.println(i);
				count++;
			}
		}
	}
}

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prim prime = new Prim();
		prime.checkPrime();
	}

}