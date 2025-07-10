public class Character_print {
    public static void main(String[] args) {
        String input = "hello world";

        // Convert to lowercase and remove spaces
        input = input.toLowerCase().replace(" ", "");

        int[] freq = new int[256]; // Array to store frequency of each ASCII character

        // Count frequency of each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            freq[ch]++;
        }

        // Print frequencies
        System.out.println("Character frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " : " + freq[i]);
            }
        }
    }
}
