public class Palindrome {
    public static void main(String[] args) {
        String input = "Madam";  // Change this string to test other cases
        String original = input.toLowerCase();  // Convert to lowercase to ignore case
        String reversed = "";

        // Reverse the string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // Check if palindrome
        if (original.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }
    }
}
