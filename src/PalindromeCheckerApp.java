import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
                // Display application details
                System.out.println("=================================");
                System.out.println("   Palindrome Checker App - UC4   ");
                System.out.println("   Version: 1.0                   ");
                System.out.println("=================================");

                // Take input from user
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a string to check palindrome: ");
                String input = scanner.nextLine();

                // Convert string to character array
                char[] charArray = input.toCharArray();

                // Two-pointer approach
                int start = 0;
                int end = charArray.length - 1;
                boolean isPalindrome = true;

                while (start < end) {
                    if (charArray[start] != charArray[end]) {
                        isPalindrome = false;
                        break;
                    }
                    start++;
                    end--;
                }

                // Display result
                if (isPalindrome) {
                    System.out.println("Result: The given string is a Palindrome ✅");
                } else {
                    System.out.println("Result: The given string is NOT a Palindrome ❌");
                }

                scanner.close();
            }
        }








