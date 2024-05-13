public class MyClass6{
	public static void main(String args[]){
		// 6. Method Overloading
		
		// create object of AccountUtil class
		AccountUtil util = new AccountUtil();
		util.printMessage();
		
		// lets say we have to transfer amount from my account to my friend.
		// So we can have same function name but with different parameters that's nothing but method overloading.
		
		util.doTransaction("NEFT", 123, 456); // refer mode of transfer, sender bank account and then receiver bank account
		util.doTransaction("IMPS", 123, 456); // refer mode of transfer, sender bank account and then receiver bank account
		util.doTransaction("abc@bank", "xyz@bank"); // UPI mode, sender's UPI and receiver's UPI
	}
}

class AccountUtil{
	public void printMessage(){
		System.out.println("Welcome to Session, Happy Coding.");
	}
	
	public void doTransaction(String transferMode, int sourceAccount, int destinationAccount){
		// do all validation and balance check of sourceAccount and OTP checks
		System.out.println("Transaction is successful by mode "+transferMode);
	}
	
	public void doTransaction(String sourceUPI, String destinationUPI){
		// do all validation and balance check of sourceUPI and PIN valdation
		// call NPCI API to validate PIN and transfer the amount to sourceUPI
		System.out.println("Transaction is successful from "+sourceUPI+" to "+destinationUPI);
	}
}