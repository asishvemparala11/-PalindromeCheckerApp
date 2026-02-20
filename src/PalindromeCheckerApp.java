import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.println("====================================");
                System.out.println("   Palindrome Checker Application");
                System.out.println("   Use Case 6: Queue + Stack Check");
                System.out.println("====================================");

                System.out.print("Enter a string to check palindrome: ");
                String input = scanner.nextLine();

                // Remove spaces and convert to lowercase for fair comparison
                input = input.replaceAll("\\s+", "").toLowerCase();

                Queue<Character> queue = new LinkedList<>();
                Stack<Character> stack = new Stack<>();

                // Enqueue and Push characters
                for (char ch : input.toCharArray()) {
                    queue.add(ch);     // FIFO
                    stack.push(ch);   // LIFO
                }

                boolean isPalindrome = true;

                // Compare dequeue and pop
                while (!queue.isEmpty()) {
                    char queueChar = queue.remove(); // Dequeue
                    char stackChar = stack.pop();    // Pop

                    if (queueChar != stackChar) {
                        isPalindrome = false;
                        break;
                    }
                }

                // Output Result
                if (isPalindrome) {
                    System.out.println("Result: The given string IS a Palindrome ");
                } else {
                    System.out.println("Result: The given string is NOT a Palindrome ");
                }

                scanner.close();
            }
        }








