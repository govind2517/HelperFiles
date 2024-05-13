public class MyClass5{
	public static void main(String args[]){
		// 5. Method declaration and passing parameters
		
		// create object of MyUtil class
		MyUtil util = new MyUtil();
		util.printMessage();
		
		int a = 10, b = 20;
		System.out.println("Is Odd :: "+(util.isOdd(a)));		
		System.out.println("Sum is :: "+(util.sum(a, b)));
	}
}

class MyUtil{
	public void printMessage(){
		System.out.println("Welcome to Session, Happy Coding.");
	}
	
	public boolean isOdd(int a){
		boolean result = (a%2 == 0);
		return !result;
	}
	
	public int sum(int a, int b){
		return (a+b);
	}
}