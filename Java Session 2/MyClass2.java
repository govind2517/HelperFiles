import java.util.Scanner;

public class MyClass2{
	// 2. Do While loop
	public static void main(String[] args) {
        int count = 0;
        do {
            System.out.println("Count: " + count);
            count++;
        } while (count < 5);
        System.out.println("Loop ended.");
		
		System.out.println("===================================");
		LoginSystem ls = new LoginSystem();
		ls.validateLogin();
    }
}

class LoginSystem {
	/*
	In this example:
		We use a do-while loop to repeatedly ask the user to enter a username and password until they successfully log in.
		The loop checks the input against predefined username and password values.
		If the input matches, the loop exits and displays a success message.
		Otherwise, it continues looping and asks the user to try again.
	*/
    public void validateLogin() {
        Scanner scanner = new Scanner(System.in);
        String username = "admin";
        String password = "1234";
        boolean isLoggedIn = false;

        do {
            System.out.print("Enter username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                isLoggedIn = true;
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        } while (!isLoggedIn);

        // After successful login, proceed with other operations
        System.out.println("Welcome, " + username + "! You are now logged in.");
        // Other code for the application can go here
    }
}