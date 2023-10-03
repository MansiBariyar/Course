package edud;


	public class MainApp {

		public static void main(String[] args) {
			String s="hello";
			String s1=new String("Hello");
			if(s==s1) {
				System.out.println("Locations are same");
			}
			else {
				System.out.println("not same");
			}
			
			//contents
			if(s.equalsIgnoreCase(s1)) { //hello==hello
				System.out.println("contents are same");
			}else {
				System.out.println("contents are not same");
			}

		}

	}


