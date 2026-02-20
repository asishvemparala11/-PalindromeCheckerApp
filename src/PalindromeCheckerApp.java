import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

                System.out.println("=================================");
                System.out.println("  Palindrome Checker Application ");
                System.out.println("  Version : 1.0 (UC7 - Deque)     ");
                System.out.println("=================================");

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a string to check palindrome: ");
                String input = sc.nextLine();

                // Convert to lowercase to make comparison case-insensitive
                input = input.toLowerCase();

                // Create Deque
                Deque<Character> deque = new ArrayDeque<>();

                // Insert characters into deque
                for (char ch : input.toCharArray()) {
                    deque.addLast(ch);
                }

                boolean isPalindrome = true;

                // Compare front and rear elements
                while (deque.size() > 1) {
                    char front = deque.removeFirst();
                    char rear = deque.removeLast();

                    if (front != rear) {
                        isPalindrome = false;
                        break;
                    }
                }

                // Output result
                if (isPalindrome) {
                    System.out.println("Result: The given string IS a Palindrome ");
                } else {
                    System.out.println("Result: The given string is NOT a Palindrome ");
                }

                sc.close();
            }
        }








