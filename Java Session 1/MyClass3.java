public class MyClass3{
	public static void main(String args[]){
		// 3. Operators
		
		// 1. Assigment Operators
		int a = 10; // assigning value so here = is nothing but assignment operator
		int b = 20;
		
		int sum = a;
		sum += b; // same += assigning value, same with -=, *=, /=
		
		System.out.println("Sum is ::"+sum);
		
		// 2. Arithmetic Operators - previous exammple
		
		// 3. Comparision Operators 
		if(a == b){ 
			System.out.println("matched..");
		}else{
			System.out.println("not matched..");
		}
		
		// 4. logical operator
		// Working same as AND OR and NOT table
		// AND condition will only be true if both condition are true
		// OR condition will be true if any of the condition true
		// NOT just reverse the condition
		if(a < 20 && b < 30){
			System.out.println("got in true for AND");
		}
		
		if(a < 20 || b > 30){
			System.out.println("got in true for OR");
		}
		
		if(!(b == 10)){ 
			System.out.println("got in true for NOT");
		}
	}
}