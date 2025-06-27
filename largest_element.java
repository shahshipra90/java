public class largest_element {
    public static void main(String[] args) {
        int[] n = {34, 89, 12, 76, 55};
        int largest = n[0];

        for (int num : n) {
            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("The largest number in the array is: " + largest);
    }
}
