import java.util.*;

/*
 * UC12: Strategy Pattern for Palindrome Algorithms
 * Demonstrates dynamic selection of palindrome checking algorithm
 */

// Strategy Interface
interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

// Strategy 1: Stack Based Implementation
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();

        // Push all characters to stack
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        // Compare original string with stack pop
        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Strategy 2: Deque Based Implementation
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }

        // Compare front and rear
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}

// Context Class
class PalindromeContext {

    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String input) {
        return strategy.isPalindrome(input);
    }
}

// Main Class
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PalindromeContext context = new PalindromeContext();

        System.out.println("==== UC12: Strategy Pattern Palindrome Checker ====");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("\nChoose Strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");
        System.out.print("Enter choice (1 or 2): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                context.setStrategy(new StackStrategy());
                break;
            case 2:
                context.setStrategy(new DequeStrategy());
                break;
            default:
                System.out.println("Invalid choice! Defaulting to Stack Strategy.");
                context.setStrategy(new StackStrategy());
        }

        boolean result = context.executeStrategy(input);

        if (result) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        scanner.close();
    }
}