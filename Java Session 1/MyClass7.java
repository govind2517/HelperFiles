public class MyClass7{
	public static void main(String args[]){
		// 7. Method Overriding
		
		// create object of parent itself
		GSTUtil util = new GSTUtil();
		util.printMessage();
		util.GSTCalculation();
		
		System.out.println("==========================================");
		
		// create object of BankUtil 
		GSTUtil util2 = new BankUtil();
		util2.printMessage();
		util2.GSTCalculation();
		
		System.out.println("==========================================");
		
		// create object of BankUtil 
		BankUtil2 util3 = new BankUtil2();
		util3.printMessage();
		util3.GST();
		
	}
}

class GSTUtil{
	public void printMessage(){
		System.out.println("Welcome to Session, GST logic from GSTUtil.");
	}
	
	public void GSTCalculation(){
		System.out.println("GST logic from Central.");
		// Parent can have it's own logic coming from central usecase.
	}
}

class BankUtil extends GSTUtil{
	// All the state bank can have there own implementation or can user central logic by default
	
	public void GSTCalculation(){
		System.out.println("GST logic from State, writing my own implementation here.");
	}
}

class BankUtil2 extends GSTUtil{
	// All the state bank can have there own implementation or can user central logic by default
	
	// new function not present in parent
	public void GST(){
		super.GSTCalculation();
		System.out.println("Adding new Logic for this in different function.");
	}
}