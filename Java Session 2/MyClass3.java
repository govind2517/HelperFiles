public class MyClass3{
	// 3. for loop
	public static void main(String[] args) {
        System.out.print("Enter a positive integer: ");
        int number = 5;
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is " + factorial);
		
		 System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
		
	System.out.println("===============For Loop===============");
	//4. For each loop
		String[] names = {"Alice", "Bob", "Charlie", "David"};

        System.out.println("Names:");
        for (String name : names) {
            System.out.println(name);
        }
		
	// 5. Array
		int numDays= 7;
		int[] temperatures = {44,42,38,30,35,44,47}; // Array to store temperatures

        // Calculate average temperature
        int totalTemperature = 0;
        for (int temp : temperatures) {
            totalTemperature += temp;
        }
        double averageTemperature = (double) totalTemperature / numDays;

        // Find the highest and lowest temperatures
        int maxTemp = temperatures[0];
        int minTemp = temperatures[0];
        for (int i = 1; i < numDays; i++) {
            if (temperatures[i] > maxTemp) {
                maxTemp = temperatures[i];
            }
            if (temperatures[i] < minTemp) {
                minTemp = temperatures[i];
            }
        }

        // Display results
        System.out.println("\nWeekly Temperature Report:");
        System.out.println("Average Temperature: " + averageTemperature);
        System.out.println("Highest Temperature: " + maxTemp);
        System.out.println("Lowest Temperature: " + minTemp);
    }
}
