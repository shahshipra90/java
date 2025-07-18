public class Vowels {
    public static void main(String[] args) {
        String input = "Hello World";  //  input

        // Convert string to lowercase
        input = input.toLowerCase();

        int vowels = 0;
        int consonants = 0;

        // Loop through each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
// Check if the character is a letter
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Input string: " + input);
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}
