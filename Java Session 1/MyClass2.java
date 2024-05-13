public class MyClass2{
	public static void main(String args[]){
		// 2. DataTypes and Variables
		int a = 10; // here int is datatype, a is variable name and 10 is value assigned to that variable
		int b = 20;
		int c = a + b;
		System.out.println("Sum is " + c);
		System.out.println("Diff is " + (a-b));
		System.out.println("Multiplication is " + (a*b));
		System.out.println("Div is " + (a/b)); // it always show integer division
		
		// for point division, both value must be in same datatype
		double f = 1.0/2.0;
		System.out.println("Div is " + (f)); 
	}
}