import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
                // Display application details
                System.out.println("=== Palindrome Checker App ===");
                System.out.println("Use Case 3: Palindrome Check Using String Reverse");
                System.out.println();

                // Take input from user
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a string: ");
                String original = sc.nextLine();

                // Reverse the string using for loop
                String reversed = "";
                for (int i = original.length() - 1; i >= 0; i--) {
                    reversed = reversed + original.charAt(i);
                }

                // Compare original and reversed strings
                if (original.equals(reversed)) {
                    System.out.println("Result: The given string is a Palindrome.");
                } else {
                    System.out.println("Result: The given string is NOT a Palindrome.");
                }

                sc.close();
            }
        }








