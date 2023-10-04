package educc;

class CheckBankBalance extends Exception{
	public CheckBankBalance(String s) {
		super(s);
	}
}

class Bank{
	float balance;
	
	Bank(){
		balance = 1000;
	}
	void deposit(float damt) {
		
		balance = balance+damt;
		System.out.println("after deposit your balance="+balance);
	}
	
	void withdraw(float wamt)    { //2000
		try {
		if(balance<wamt) {
		  	//CheckBankBalance cob=new CheckBankBalance("Less Balance you cannot withdraw");
			//throw cob;
			throw new CheckBankBalance("Less Balance you cannot");
	     }
	else {
			balance=balance-wamt;
			System.out.println("after withdraw your balance="+balance);
	      }
		}
     catch(CheckBankBalance e) {
	     e.printStackTrace();
		}
	
	}
}

public class CustomException {

	public static void main(String[] args)  {
		Bank bob=new Bank();
           bob.deposit(200); 
           bob.withdraw(1300);
           System.out.println("After withdraw");
	}

}