# PalindromeCheckerApp

This repository contains a console-based Java application for checking whether a string is a palindrome using various approaches.  

## UC8: Linked List Based Palindrome Checker

The class `UseCase8PalindromeCheckerApp.java` implements the following:

- Builds a singly linked list from a filtered input string
- Uses fast/slow pointer technique to find the middle of the list
- Reverses the second half of the list in-place
- Compares the two halves to determine if the string is a palindrome

### Compilation & Execution

```bash
# compile
javac UseCase8PalindromeCheckerApp.java

# run
java UseCase8PalindromeCheckerApp
```

The program will prompt for a string. It ignores non-alphanumeric characters and compares case-insensitively.

### Example

```
Enter a string to check: A man, a plan, a canal: Panama
The string is a palindrome (checked with linked list).
```

## Git Workflow (for reference)

Follow the steps described in the project instructions to initialize a repository, create branches, and deliver features using the UC workflow.  

> **Note:** For the real project use your own GitHub account and repository URL as described in the assignment.