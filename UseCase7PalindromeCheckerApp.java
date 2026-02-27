import java.util.Scanner;

public class UseCase7PalindromeCheckerApp {
    /**
     * Check if a string is a palindrome using two pointers approach.
     * Compare characters from both ends moving towards the middle.
     */
    private static boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        // Filter and convert to lowercase
        String filtered = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        int left = 0;
        int right = filtered.length() - 1;

        while (left < right) {
            if (filtered.charAt(left) != filtered.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input);

        if (result) {
            System.out.println("The string is a palindrome (two-pointer approach).");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}
