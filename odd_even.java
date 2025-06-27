public class odd_even {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 6, 9, 11, 14, 17};
        int evenct = 0;
        int oddct = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenct++;
            } else {
                oddct++;
            }
        }

        System.out.println("Total even numbers: " + evenct);
        System.out.println("Total odd numbers: " + oddct);
    }
}
