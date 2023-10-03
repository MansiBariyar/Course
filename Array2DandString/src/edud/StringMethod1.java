package edud;


	import java.util.Scanner;
	class Am {
		String st;
		
		
		int countAm(String str) {
			
			String sArr [] = str.split(" ");
			int c = 0;
			for(int i = 0; i < sArr.length; i++) {
				if(sArr[i].toLowerCase().equals("Am".toLowerCase()))
					c++;
			}
			return c;
		}
	}
	public class StringMethod1 {
	   
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			String st = sc.nextLine();
			String target = "Am";
			Am iams = new Am();

			int res= iams.countAm(st);
			
			System.out.println(res);

		}

	}


