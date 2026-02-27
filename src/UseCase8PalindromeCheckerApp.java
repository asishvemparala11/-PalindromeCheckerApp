public class UseCase8PalindromeCheckerApp{

    // Recursive function
    public static boolean isPalindrome(String str, int start, int end) {
        // Base condition
        if (start >= end) {
            return true;
        }
        // If mismatch
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        // Recursive call inward
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String input = "madam";
        boolean result = isPalindrome(input, 0, input.length() - 1);
        System.out.println("Is \"" + input + "\" a palindrome? " + result);
    }
}