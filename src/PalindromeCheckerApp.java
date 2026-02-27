import java.util.*;

        public class PalindromeCheckerApp {

            // Normalize string: remove spaces and convert to lowercase
            public static String normalize(String str) {
                // Remove all non-alphanumeric characters if needed
                str = str.replaceAll("\\s+", ""); // remove spaces
                return str.toLowerCase();
            }

            // Check palindrome using two-pointer technique
            public static boolean isPalindrome(String str) {
                str = normalize(str);
                int start = 0, end = str.length() - 1;

                while (start < end) {
                    if (str.charAt(start) != str.charAt(end)) {
                        return false;
                    }
                    start++;
                    end--;
                }
                return true;
            }

            public static void main(String[] args) {
                String input = "A man a plan a canal Panama";
                boolean result = isPalindrome(input);
                System.out.println("Is \"" + input + "\" a palindrome (ignoring case & spaces)? " + result);
            }
        }








