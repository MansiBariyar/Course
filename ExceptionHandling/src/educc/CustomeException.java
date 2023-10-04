package educc;

class MyAgeCheck extends Exception{
	public MyAgeCheck(String s) {
		super(s);
	}
}
class AgeCheck{
	void checkAgeVote(int age) {
		try {
		if(age>=18) {
			System.out.println("You are eligible for voting");
		}
		else {
			throw new MyAgeCheck("Your is below 18 not eligible to vote");
		}
		}catch(MyAgeCheck e) {
			e.printStackTrace();
		}
	}
}

public class CustomeException {

	public static void main(String[] args) {
		AgeCheck ob=new AgeCheck();
		ob.checkAgeVote(17);

	}

}