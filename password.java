import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a password
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        // Check if the password is valid
        if (isValidPassword(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid. It must meet the following criteria:");
            System.out.println("- At least 8 characters long");
            System.out.println("- At least one uppercase letter");
            System.out.println("- At least one lowercase letter");
            System.out.println("- At least one special character");
        }
        
        scanner.close();
    }

    // Method to validate the password
    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;

        // Iterate through each character in the password string
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            // Check if the character is an uppercase letter
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }
            // Check if the character is a lowercase letter
            else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            }
            // Check if the character is a special character
            else if (!Character.isLetterOrDigit(ch)) {
                hasSpecialChar = true;
            }
        }

        // Return true if all conditions are satisfied
        return hasUpperCase && hasLowerCase && hasSpecialChar;
    }
}
