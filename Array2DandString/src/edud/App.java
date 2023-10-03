package edud;


	class InAmsterdam {
		
		 int countAm(String str) {
			 int count = 0;
				String s = "I Am in Amesterdam am I?";
				String[] arr = s.split(" ");
				
				for(int i =0;i<arr.length;i++) {
					if(arr[i].equalsIgnoreCase(str)) {
						count++;
					}
				}
			return count;
			 
		 }	
	}

	public class App {

		public static void main(String[] args) {
			
			InAmsterdam obj = new InAmsterdam();
		 System.out.println(obj.countAm("am"));	//obj.countAm("am");

		}

	}
