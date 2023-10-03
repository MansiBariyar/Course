package edud;

public class PatternSubstringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="HELLO";
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.substring(0,i+1));
	}

}
}
