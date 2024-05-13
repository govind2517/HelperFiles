public class MyClass4{
	public static void main(String args[]){
		// 4. Control Structures
		
		int a = 10;
		int b = 20;
		
		// if-else
		if(a == b){ 
			System.out.println("matched..");
		}else{
			System.out.println("not matched..");
		}
		// we can have nested if else
			
		// switch case - it is faster than if else
		int choice = 6;
		switch(choice){
			case 1:
				System.out.println("Jan");
			break;
			case 2:
				System.out.println("Feb");
			break;
			case 3:
				System.out.println("Mar");
			break;
			case 4:
				System.out.println("Apr");
			break;
			default:
				System.out.println("Not valid choice");
		}
		
	}
}