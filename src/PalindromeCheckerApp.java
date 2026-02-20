import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                // Welcome Message
                System.out.println("==================================");
                System.out.println("   Palindrome Checker App - UC5   ");
                System.out.println("   Stack Based Palindrome Check  ");
                System.out.println("==================================");

                // User Input
                System.out.print("Enter a string: ");
                String input = scanner.nextLine();

                // Create Stack
                Stack<Character> stack = new Stack<>();

                // Push characters into stack
                for (int i = 0; i < input.length(); i++) {
                    stack.push(input.charAt(i));
                }

                // Pop characters to form reversed string
                String reversed = "";
                while (!stack.isEmpty()) {
                    reversed += stack.pop();
                }

                // Compare original and reversed strings
                if (input.equals(reversed)) {
                    System.out.println("Result: \"" + input + "\" is a Palindrome ");
                } else {
                    System.out.println("Result: \"" + input + "\" is NOT a Palindrome ");
                }

                scanner.close();
            }
        }








