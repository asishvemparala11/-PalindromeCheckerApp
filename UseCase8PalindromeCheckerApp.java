import java.util.Scanner;

public class UseCase8PalindromeCheckerApp {
    /**
     * Singly linked list node holding a character.
     */
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Build a linked list from a string. Each character becomes a node.
     */
    private static Node buildList(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        Node head = new Node(s.charAt(0));
        Node tail = head;
        for (int i = 1; i < s.length(); i++) {
            tail.next = new Node(s.charAt(i));
            tail = tail.next;
        }
        return head;
    }

    /**
     * Reverse a linked list in-place and return new head.
     */
    private static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }

    /**
     * Check whether the characters stored in a singly linked list form a palindrome.
     * Uses fast/slow pointer to find middle, reverses second half, and compares.
     */
    private static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        // find midpoint (slow will point to middle)
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse second half
        Node secondHalf = reverseList(slow);
        Node firstHalf = head;

        // compare first and reversed second half
        Node p = firstHalf;
        Node q = secondHalf;
        boolean palindrome = true;
        while (q != null) { // second half is shorter or equal
            if (p.data != q.data) {
                palindrome = false;
                break;
            }
            p = p.next;
            q = q.next;
        }

        // restore the list (optional)
        reverseList(secondHalf);

        return palindrome;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();
        // ignore non-alphanumeric and case to make check more general
        String filtered = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        Node head = buildList(filtered);
        boolean result = isPalindrome(head);

        if (result) {
            System.out.println("The string is a palindrome (checked with linked list).\n");
        } else {
            System.out.println("The string is NOT a palindrome.\n");
        }
        scanner.close();
    }
}
